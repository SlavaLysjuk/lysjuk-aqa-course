package utils;

import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static factories.WebDriverFactory.log;

public class TxtFileHandler {

    public static void readFile(String filePath) {
        try {
            log.info(Files.readString(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeFile(String filePath) {

        String newFilePath = "src/main/resources/allCars.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(newFilePath))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String... args) {
        String filePath = "src/main/resources/modelCar.txt";
        readFile(filePath);
        writeFile(filePath);
    }

}
