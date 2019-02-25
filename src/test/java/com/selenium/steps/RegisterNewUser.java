package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterNewUser extends ParentScenario {

    @Given("^I open the browser on \"([^\"]*)\"$")
    public void iOpenTheBrowserOn(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on Sign Up button$")
    public void iClickOnSignUpButton() {
        mainPage.ClickOnSignUp();
    }

    @And("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnter(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on Sign Up$")
    public void iClickOnSignUp() {

    }

    @Then("^I should see a confirmation message$")
    public void iShouldSeeAConfirmationMessage() {
    }
}
