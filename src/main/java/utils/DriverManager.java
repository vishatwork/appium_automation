package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {
    private static AppiumDriver driver;
    private static DriverManager instance;
    
	private DriverManager() {}

	public static DriverManager getInstance() {
		if (instance == null) {
			instance = new DriverManager();
		}
		return instance;
	}
    

    public AppiumDriver initDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }
    
    private void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
        capabilities.setCapability("appium:automationName", ConfigReader.getProperty("automationName"));
        capabilities.setCapability("appium:deviceName", ConfigReader.getProperty("deviceName"));
        capabilities.setCapability("appium:appPackage", ConfigReader.getProperty("appPackage"));
        capabilities.setCapability("appium:appActivity", ConfigReader.getProperty("appActivity"));
        capabilities.setCapability("appium:app", ConfigReader.getProperty("appPath"));
//        capabilities.setCapability("noReset", true);

        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            System.err.println("Error creating Appium driver: " + e.getMessage());
        }
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}