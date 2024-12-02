package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String getProperty(String propertyName) {
        Properties props = new Properties();
        try (FileReader reader = new FileReader("src/main/java/resources/config.properties")) {
            props.load(reader);
            return props.getProperty(propertyName);
        } catch (IOException e) {
            System.err.println("Error reading config.properties file: " + e.getMessage());
            return null;
        }
    }
}