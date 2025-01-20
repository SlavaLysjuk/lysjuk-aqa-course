import org.testng.annotations.Test;
import utils.ConfigReader;

public class WorkWithFilesTest extends BaseTest {

    @Test
    public void testDownloadPdfFile() {
        hillelQAutoHomePage.openUrl(ConfigReader.getValue("baseUrl"));
        hillelQAutoHomePage.clickGuestLoginButton();
        garagePage.isLoaded();
        instructionsPage.clickInstruction()
                .isLoaded()
                .clickDownloadFileButton()
                .moveDownloadedFile("Front windshield wipers on Audi TT.pdf");
    }

    @Test
    public void testWriteCarInFileTxt() {
        hillelQAutoHomePage.openUrl(ConfigReader.getValue("baseUrl"));
        hillelQAutoHomePage.clickGuestLoginButton();
        garagePage.isLoaded();
        instructionsPage.clickInstruction()
                .isLoaded()
                .readFile();
    }
}
