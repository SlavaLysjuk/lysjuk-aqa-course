import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindLogoAndColorTest {

    @Test(description = "Тест-кейс 1: Перевірка відображення логотипу")
    public void testLogoDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            By findLogo = (By.xpath("//a[@class='header_logo']"));

            if (isElementPresent(driver, findLogo)) {
                System.out.println("Logo displayed");
            } else {
                System.out.println("Logo does not displayed");
            }
        } catch (Exception e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Тест-кейс 2: Перевірка кольору фону кнопки \"Sign up\"")
    public void testCheckBackgroundColorButtonSignUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
            String backgroundColor = signUpButton.getCssValue("background-color");

            if (backgroundColor.equals("rgba(2, 117, 216, 1)")) {
                System.out.println("Background color of Sign up button is correct");
            } else {
                System.out.println("Background color of Sign up button is incorrect");
            }
        } catch (Exception e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        } finally {
            driver.quit();
        }

    }

    public static String rgbaToHex(String rgba) {
        String[] numbers = rgba.replace("rgba(", "").replace(")", "").split(", ");
        int r = Integer.parseInt(numbers[0]);
        int g = Integer.parseInt(numbers[1]);
        int b = Integer.parseInt(numbers[2]);
        return String.format("#%02x%02x%02x", r, g, b);
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
