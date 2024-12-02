package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utils.DriverManager;

public class Hooks {
	private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void setUp() {
        DriverManager driverManager = DriverManager.getInstance();
        driverManager.initDriver();
        LOGGER.info("Driver initialized successfully.");
    }

    @After
    public void tearDown() {
        // Quit the driver after each scenario
        DriverManager.getInstance().quitDriver();
        LOGGER.info("Driver quit successfully.");
    }
    
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverManager.getInstance().initDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
        }
    }
}
