package factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.logging.Logger;

public class WebDriverFactory {

    public static final Logger log = Logger.getLogger(WebDriverFactory.class.getName());

    public static WebDriver getWebDriver(final String browser) {
        WebDriver driver = null;

        if ("chrome".equalsIgnoreCase(browser)) {

            driver = new ChromeDriver();
        } else if ("edge".equalsIgnoreCase(browser)) {
            driver = new EdgeDriver();
        } else
            throw new IllegalArgumentException(String.format("Unsupported browser: %s", browser));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        log.info(String.format("Using %s driver", driver.getClass().getName()));
        return driver;
    }
}
