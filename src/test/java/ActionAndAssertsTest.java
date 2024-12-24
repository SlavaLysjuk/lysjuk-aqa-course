import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ActionAndAssertsTest {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        actions = new Actions(driver);
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

    @Test(description = "Тест-кейс 1: Перевірка відображення логотипу")
    public void testFindLogo() {
        String currentUrl = driver.getCurrentUrl();

        assertThat(currentUrl)
                .isEqualTo("https://guest:welcome2qauto@qauto.forstudy.space/")
                .as("Некоректний URL");
    }

    @Test(description = "Тест-кейс 2: Перевірка кольору фону кнопки \"Sign up\"")
    public void testCheckButtonSignUpBackgroundColor() {
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
        String backgroundColor = signUpButton.getCssValue("background-color");

        assertThat(backgroundColor)
                .isEqualTo("rgba(2, 117, 216, 1)")
                .as("Background color of Sign up button is incorrect");
    }

    @Test(description = "Приклад роботи методу Actions")
    public void testGuestLoginAndLogOutToMainPageTest() {
        WebElement guestLogIn = wait.until(visibilityOfElementLocated(By.xpath("//button[text()='Guest log in']")));
        assertThat(guestLogIn.isDisplayed()).as("Кнопку Guest log in не знайдено");
        actions.moveToElement(guestLogIn).click().perform();

        wait.until(ExpectedConditions.urlToBe("https://guest:welcome2qauto@qauto.forstudy.space/panel/garage"));
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl)
                .isEqualTo("https://guest:welcome2qauto@qauto.forstudy.space/panel/garage")
                .as("Некоректний URL");

        WebElement logOutButton = wait.until(visibilityOfElementLocated(By.xpath("//a[text()=' Log out ']")));
        actions.moveToElement(logOutButton).click().perform();

        wait.until(ExpectedConditions.urlToBe("https://guest:welcome2qauto@qauto.forstudy.space/"));
        currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl)
                .isEqualTo("https://guest:welcome2qauto@qauto.forstudy.space/")
                .as("Некоректний URL або не вийшли по кнопці Log out");
    }

}
