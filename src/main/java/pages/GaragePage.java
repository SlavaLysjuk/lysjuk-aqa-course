package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class GaragePage extends BasePage {

    SoftAssert softAssert = new SoftAssert();

    LocalDate currentDate = LocalDate.now();
    String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    String xpathDate = String.format("//p[text()='Update mileage • %s']", formattedDate);


    public GaragePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public GaragePage isLoaded() {
        wait.until(ExpectedConditions.urlToBe("https://guest:welcome2qauto@qauto.forstudy.space/panel/garage"));
        return this;
    }

    public GaragePage clickAddCarButton() {
        WebElement addButton = wait.until(elementToBeClickable(By.xpath("//button[text()='Add car']")));
        addButton.click();
        return this;
    }

    public GaragePage isCarNameCorrect() {
        boolean isCarNameDisplayed = driver.findElement(By.xpath("//p[text()='Audi TT']")).isDisplayed();
        softAssert.assertTrue(isCarNameDisplayed, "Ім'я автомобіля 'Audi TT' не відображається!");
        return this;
    }

    public GaragePage isDateCorrect() {
        boolean isDateDisplayed = driver.findElements(By.xpath(xpathDate)).size() > 0;
        softAssert.assertTrue(isDateDisplayed, "Дата 'Update mileage' не відображається або некоректна!");
        return this;
    }

    public GaragePage getMileageValue(String expectedMileage) {
        WebElement mileageInput = driver.findElement(By.xpath("//input[@name='miles']"));
        String actualMileage = mileageInput.getAttribute("value");
        softAssert.assertEquals(actualMileage, expectedMileage, "Пробіг автомобіля не відповідає очікуваному!");
        return this;

    }

    public GaragePage checkLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='car_logo car-logo']")));
        return this;
    }

    public GaragePage checkLogoUrl(String expectedUrl) {
        WebElement logoUrl = driver.findElement(By.xpath("//img[@alt='TT']"));
        String actualUrl = logoUrl.getAttribute("src");
        softAssert.assertTrue(actualUrl.endsWith(expectedUrl), "URL логотипу не закінчується на '" + expectedUrl + "'!");
        return this;

    }

    public void assertAll() {
        softAssert.assertAll();
    }


}
