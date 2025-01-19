import org.testng.annotations.Test;
import utils.ConfigReader;

public class AddCarInGarageTest extends BaseTest {

    //TODO Для запуску на іншому браузері, в config.properties потрібно змінити на інший браузер.
    @Test
    public void testAddCarAudiTTInGarage() {

        hillelQAutoHomePage.openUrl(ConfigReader.getValue("baseUrl"));
        hillelQAutoHomePage.clickGuestLoginButton();
        garagePage.isLoaded()
                .clickAddCarButton();
        framePage.isLoaded()
                .fillMillage()
                .clickAddCarButtonInFrame();

        garagePage.isCarNameCorrect()
                .isDateCorrect()
                .getMileageValue("20")
                .checkLogo()
                .checkLogoUrl("audi.png");

        garagePage.assertAll();
    }
}
