import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class WaitsAndJSExecutorTest extends BaseTest{
    @BeforeMethod
    public void setUp() {

        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
    }

    @Test(description = "Тест з використанням явних очікувань та JavascriptExecutor")
    public void testWaitsAndJSExecutor() {
        wait.until(ExpectedConditions.urlToBe("https://guest:welcome2qauto@qauto.forstudy.space/"));

        Boolean title = wait.until(titleIs("Hillel Qauto"));
        Assert.assertTrue(title, "Title не знайдено");

        WebElement guestLogInButton = wait.until(elementToBeClickable(By.xpath("//button[text()='Guest log in']")));
        Assert.assertTrue(guestLogInButton.isDisplayed(), "Кнопка Guest log in відсутня");
        clickOnElementJs(guestLogInButton);

        WebElement addCarButton = wait.until(elementToBeClickable(By.xpath("//button[text()='Add car']")));
        Assert.assertTrue(addCarButton.isDisplayed(), "Кнопка Add car не клікабельна");
        clickOnElementJs(addCarButton);
    }

    private void clickOnElementJs(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

}
