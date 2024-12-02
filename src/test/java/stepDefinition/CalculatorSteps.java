package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CalculatorPage;
import utils.DriverManager;

import org.testng.Assert;

public class CalculatorSteps {

    private CalculatorPage calculatorPage;
    
	public CalculatorSteps() {
		calculatorPage = new CalculatorPage(DriverManager.getInstance().initDriver());
	}

    @Given("the calculator app is opened")
    public void theCalculatorAppIsOpened() {
    	Assert.assertTrue(calculatorPage.isCalculatorOpen());
    	
    }

    @When("I perform {string} between {string} and {string}")
    public void iPerformOperationBetweenNum1AndNum2(String operation, String num1, String num2) {
    	calculatorPage.performCalculation(operation, num1, num2);
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expectedResult) {
        Assert.assertEquals(expectedResult, calculatorPage.getResult());
    }

}
