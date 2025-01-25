import io.qameta.allure.*;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class AddCarInGarageTest extends BaseTest {

    @Test
    @Description("Додавання машини Audi TT, та перевірка заповнених даних")
    @Owner("Slava Lysjuk")
    @Link("https://lms.ithillel.ua/groups/66a3b3f284150597717a2ab7/homeworks/6787738aaf5b996f98f997a7")
    @Severity(SeverityLevel.BLOCKER)
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
