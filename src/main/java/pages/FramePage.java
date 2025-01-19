package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public FramePage isLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Add a car']")));
        return this;
    }

    public FramePage fillMillage() {
        WebElement fill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addCarMileage")));
        clickAndWait(fill, 1000);
        fill.sendKeys("20");
        return this;
    }

    public FramePage clickAddCarButtonInFrame() {
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add']"));
        addButton.click();
        return this;
    }


}
