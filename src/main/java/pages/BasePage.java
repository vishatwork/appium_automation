package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	public BasePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	protected void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	protected String getText(WebElement element) {
		return element.getText();
	}
	
	protected boolean elementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	

}
