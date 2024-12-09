import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class QaAutoHillelTest {

    @Test
    public void testCanGuestLogInAndOutModuleText() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement guestLogButton = driver.findElement(By.xpath("//button[text()='Guest log in']"));
        Assert.assertTrue(guestLogButton.isDisplayed(), "Кнопка Guest log in відсутня");
        guestLogButton.click();

        String borderMenuElementGarage = driver.findElement(By.xpath("//a[text()=' Garage ']")).getText();
        System.out.println(borderMenuElementGarage);

        String borderMenuElementFuelExpenses = driver.findElement(By.xpath("//a[text()=' Fuel expenses ']")).getText();
        System.out.println(borderMenuElementFuelExpenses);

        String borderMenuElementInstructions = driver.findElement(By.xpath("//a[text()=' Instructions ']")).getText();
        System.out.println(borderMenuElementInstructions);

        String borderMenuElementLogOut = driver.findElement(By.xpath("//a[text()=' Log out ']")).getText();
        System.out.println(borderMenuElementLogOut);

        driver.quit();
    }

}
