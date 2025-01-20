package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class InstructionsPage extends BasePage {

    public InstructionsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public InstructionsPage clickInstruction() {
        WebElement clickInstructionButton = wait.until(elementToBeClickable(By.xpath("//a[text()=' Instructions ']")));
        clickInstructionButton.click();
        return this;
    }

    public InstructionsPage isLoaded() {
        wait.until(ExpectedConditions.urlToBe("https://guest:welcome2qauto@qauto.forstudy.space/panel/instructions"));
        return this;
    }

    public InstructionsPage clickDownloadFileButton() {
        WebElement clickButton = wait.until(elementToBeClickable(
                By.xpath("//a[@class='instruction-link_download' " +
                        "and contains(@href, " +
                        "'instructions/audi/tt/Front windshield wipers on Audi ')]")));
        clickButton.click();
        return this;
    }

    public void moveDownloadedFile(String downloadedFileName) {
        String downloadsPath = System.getProperty("user.home") + "/Downloads";
        String projectRoot = System.getProperty("user.dir") + "/";
        File downloadedFile = new File(downloadsPath + "/" + downloadedFileName);
        File destinationFile = new File(projectRoot + "/" + downloadedFileName);
        if (downloadedFile.exists()) {
            try {
                Files.move(downloadedFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                log.info("File moved successfully to: " + destinationFile.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error moving file: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.err.println("Downloaded file not found: " + downloadedFile.getAbsolutePath());
        }
    }

    public void readFile() {
        try {
            WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("brandSelectDropdown")));
            dropdownButton.click();
            WebElement dropdownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//ul[contains(@class, 'brand-select-dropdown_menu') and contains(@class, 'show')]")
            ));
            log.info("Dropdown menu is visible.");
            List<WebElement> options = dropdownMenu.findElements(By.xpath(".//li[contains(@class, 'brand-select-dropdown_item')]"));
            List<String> optionTexts = new ArrayList<>();
            for (WebElement option : options) {
                String text = option.getText().trim();
                log.info("Found option: " + text);
                optionTexts.add(text);
            }
            saveToFile(optionTexts, "modelCar.txt");
            log.info("Dropdown options saved successfully!");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void saveToFile(List<String> data, String fileName) {
        String filePath = System.getProperty("user.dir") + "/" + fileName;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            log.info("Data saved to file: " + filePath);
        } catch (IOException e) {
            log.info("Error saving to file: " + e.getMessage());
            e.printStackTrace();
        }
    }


}
