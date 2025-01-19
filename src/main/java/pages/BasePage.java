package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class BasePage {

    static final Logger log = Logger.getLogger(BasePage.class.getName());
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        log.info("BasePage initialized with WebDriver");
    }

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
        log.info("BasePage initialized with WebDriver");
    }

    public void openUrl(String url) {
        driver.get(url);
        log.info("Opened URL: " + url);
    }

    public String getUrl(String garagePageUrl) {
        log.info("Opened URL: " + driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    void clickAndWait(WebElement element, int millis) {
        element.click();
        log.info("Clicked on element: " + element + " and waiting for " + millis + " milliseconds");
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log.warning("Interrupted during wait after click: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}