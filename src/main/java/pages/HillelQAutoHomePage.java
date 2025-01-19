package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HillelQAutoHomePage extends BasePage{

    public HillelQAutoHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickGuestLoginButton() {
        WebElement guestLogButton = driver.findElement(By.xpath("//button[text()='Guest log in']"));
        Assert.assertTrue(guestLogButton.isDisplayed(), "Кнопка Guest log in відсутня");
        guestLogButton.click();
    }


}
