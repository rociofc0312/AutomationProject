package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CalculatorSteps extends ParentScenario {


    @Given("^I open the calculator app$")
    public void iOpenTheCalculatorApp() {
        startAndroid();
    }

    @When("^I click on the first number \"([^\"]*)\"$")
    public void iClickOnTheFirstNumber(String arg0) throws Throwable {
        calculatorPage.ClickNumber(arg0);
    }

    @And("^I click on the sum button$")
    public void iClickOnTheSumButton() {
        calculatorPage.ClickSum();
    }

    @And("^I click on the subtract button$")
    public void iClickOnTheSubtractButton() {
        calculatorPage.ClickSubtract();
    }

    @And("^I click on the multiply button$")
    public void iClickOnTheMultiplyButton() {
        calculatorPage.ClickMultiply();
    }

    @And("^I click on the divide button$")
    public void iClickOnTheDivideButton() {
        calculatorPage.ClickDivide();
    }

    @And("^I click on the second number \"([^\"]*)\"$")
    public void iClickOnTheSecondNumber(String arg0) throws Throwable {
        calculatorPage.ClickNumber(arg0);
    }

    @And("^I click on the equals button$")
    public void iClickOnTheEqualsButton() {
        calculatorPage.ClickResult();
    }


    @Then("^I should see the correct result number \"([^\"]*)\"$")
    public void iShouldSeeTheCorrectResultNumber(String arg0) throws Throwable {
        Assert.assertTrue(calculatorPage.getResultNumber(arg0));
    }
}
