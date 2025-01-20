import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class QaAutoHillelTest extends BaseTest{

    @BeforeSuite
    public void setUpSuite() {
        log.info("This is BeforeSuite");
    }
    @BeforeTest
    public void setUpTest() {
        log.info("This is setUpTest");
    }
    @BeforeClass
    public void setUpClass() {
        log.info("This is setUpClass");
    }
    @BeforeGroups
    public void setUpGroups() {
        log.info("This is setUpGroups");
    }
    @BeforeMethod
    public void setUpMethod() {
        log.info("This is setUpMethod");

    }

    @Test
    public void testCanGuestLogInAndOutModuleText() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement guestLogButton = driver.findElement(By.xpath("//button[text()='Guest log in']"));
        Assert.assertTrue(guestLogButton.isDisplayed(), "Кнопка Guest log in відсутня");
        guestLogButton.click();

        String borderMenuElementGarage = driver.findElement(By.xpath("//a[text()=' Garage ']")).getText();
        log.info(borderMenuElementGarage);

        String borderMenuElementFuelExpenses = driver.findElement(By.xpath("//a[text()=' Fuel expenses ']")).getText();
        log.info(borderMenuElementFuelExpenses);

        String borderMenuElementInstructions = driver.findElement(By.xpath("//a[text()=' Instructions ']")).getText();
        log.info(borderMenuElementInstructions);

        String borderMenuElementLogOut = driver.findElement(By.xpath("//a[text()=' Log out ']")).getText();
        log.info(borderMenuElementLogOut);
    }

    @Test
    public void testCanGuestLogInAndOutModuleText2() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement guestLogButton = driver.findElement(By.xpath("//button[text()='Guest log in']"));
        Assert.assertTrue(guestLogButton.isDisplayed(), "Кнопка Guest log in відсутня");
        guestLogButton.click();

        String borderMenuElementGarage = driver.findElement(By.xpath("//a[text()=' Garage ']")).getText();
        log.info(borderMenuElementGarage);

        String borderMenuElementFuelExpenses = driver.findElement(By.xpath("//a[text()=' Fuel expenses ']")).getText();
        log.info(borderMenuElementFuelExpenses);

        String borderMenuElementInstructions = driver.findElement(By.xpath("//a[text()=' Instructions ']")).getText();
        log.info(borderMenuElementInstructions);

        String borderMenuElementLogOut = driver.findElement(By.xpath("//a[text()=' Log out ']")).getText();
        log.info(borderMenuElementLogOut);
    }

}
