import io.qameta.allure.*;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class AddCarInGarageTest extends BaseTest {

    @Test
    @Description("Додавання машини Audi TT, та перевірка заповнених даних")
    @Owner("Slava Lysjuk")
    @Link("JIRA-12345")
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
