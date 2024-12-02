package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorPage extends BasePage {
	
	DriverManager driverManager = DriverManager.getInstance();
    
    public CalculatorPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private WebElement eqBtn;
	
	@AndroidFindBy(id = "com.google.android.calculator:id/clr")
	private WebElement clrBtn;
	
	@AndroidFindBy(id = "com.google.android.calculator:id/result_final")
	private WebElement resultField;
	
	
    

    public void performCalculation(String operation, String num1, String num2) {
		clickOnElement(driverManager.initDriver().findElement(By.id("com.google.android.calculator:id/digit_" + num1)));
		clickOnElement(driverManager.initDriver().findElement(By.id("com.google.android.calculator:id/op_" + operation.toLowerCase())));
		clickOnElement(driverManager.initDriver().findElement(By.id("com.google.android.calculator:id/digit_" + num2)));
		clickOnElement(eqBtn);
    }
    
    public String getResult() {
		return getText(resultField);
	}
    
    public boolean isCalculatorOpen() {
		return elementDisplayed(clrBtn);
	}
    
}