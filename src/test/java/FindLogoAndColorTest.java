import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindLogoAndColorTest extends BaseTest{

    @Test(description = "Тест-кейс 1: Перевірка відображення логотипу")
    public void testLogoDisplayed() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            By findLogo = (By.xpath("//a[@class='header_logo']"));

            if (isElementPresent(driver, findLogo)) {
                log.info("Logo displayed");
            } else {
                log.info("Logo does not displayed");
            }
        } catch (Exception e) {
            log.info("Сталася помилка: " + e.getMessage());
        } finally {
        }
    }

    @Test(description = "Тест-кейс 2: Перевірка кольору фону кнопки \"Sign up\"")
    public void testCheckBackgroundColorButtonSignUp() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
            String backgroundColor = signUpButton.getCssValue("background-color");

            if (backgroundColor.equals("rgba(2, 117, 216, 1)")) {
                log.info("Background color of Sign up button is correct");
            } else {
                log.info("Background color of Sign up button is incorrect");
            }
        } catch (Exception e) {
            log.info("Сталася помилка: " + e.getMessage());
        } finally {
        }

    }

    public static boolean isElementPresent(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
