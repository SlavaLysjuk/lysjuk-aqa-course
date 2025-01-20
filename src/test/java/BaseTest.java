import factories.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.FramePage;
import pages.GaragePage;
import pages.HillelQAutoHomePage;
import pages.InstructionsPage;
import utils.ConfigReader;

import java.time.Duration;
import java.util.logging.Logger;

public class BaseTest {

    static final Logger log = Logger.getLogger(BaseTest.class.getName());

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor js;
    GaragePage garagePage;
    HillelQAutoHomePage hillelQAutoHomePage;
    FramePage framePage;
    InstructionsPage instructionsPage;


    @BeforeMethod
    public void setUpMethodBaseTest() {
        log.info("This is BeforeMethod in base test");
        driver = WebDriverFactory.getWebDriver(ConfigReader.getValue("browser"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;

        hillelQAutoHomePage = new HillelQAutoHomePage(driver, wait);
        garagePage = new GaragePage(driver, wait);
        framePage = new FramePage(driver, wait);
        instructionsPage = new InstructionsPage(driver, wait);


    }

    @AfterMethod(alwaysRun = true)
    public void tearDownBaseTest() {
        if (driver != null) {
            driver.quit();
        }

    }


}
