import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class IFrameTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test(description = "Тест-кейс 1: Перевірка тайтлу у фреймі.")
    public void testCheckTitleInIFrame() {
        wait.until(ExpectedConditions.urlToBe("https://guest:welcome2qauto@qauto.forstudy.space/"));

        WebElement iframeVideo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='hero-video_frame']")));
        driver.switchTo().frame(iframeVideo);

        WebElement titleIframeElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//title")));

        String actualIframeTitle = titleIframeElement.getAttribute("textContent");
        String expectedIframeTitle = "Hillel IT School | Учись ради мечты! - YouTube";
        Assert.assertEquals(actualIframeTitle, expectedIframeTitle, "Title doesn’t equals to the expected result");

        driver.switchTo().defaultContent();

    }

    @Test(description = "Тест-кейс 2: Перевірка блока соціальних мереж в футері сайту.")
    public void testCheckSocialNetworkIcon() {
        wait.until(ExpectedConditions.urlToBe("https://guest:welcome2qauto@qauto.forstudy.space/"));

        WebElement socialNetworkBlock = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'contacts_socials')]"))
        );

        List<WebElement> socialIcons = socialNetworkBlock.findElements(By.tagName("a"));

        Assert.assertEquals(
                socialIcons.size(),
                5,
                "Social network block doesn’t contain 5 items"
        );

        List<String> expectedUrls = List.of(
                "https://www.facebook.com/Hillel.IT.School",
                "https://t.me/ithillel_kyiv",
                "https://www.youtube.com/user/HillelITSchool?sub_confirmation=1",
                "https://www.instagram.com/hillel_itschool/",
                "https://www.linkedin.com/school/ithillel/"
        );

        String mainTab = driver.getWindowHandle();

        for (int i = 0; i < socialIcons.size(); i++) {
            WebElement icon = socialIcons.get(i);
            icon.click();
            Set<String> allTabs = driver.getWindowHandles();
            Assert.assertTrue(allTabs.size() > 1, "New tab did not open after clicking");

            for (String tab : allTabs) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, expectedUrls.get(i), "Incorrect url of Social network");

            driver.close();
            driver.switchTo().window(mainTab);
        }
    }
}


