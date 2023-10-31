package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SauceDemoLogin_page;

public class SauceDemo_step extends Config {
    SauceDemoLogin_page sdlp = new SauceDemoLogin_page();
    @Given("I am at SauceDemo Homepage")
    public void iAmAtSauceDemoHomepage() {
        
    }

    @And("I enter my valid username at SauceDemo")
    public void iEnterMyValidUsernameAtSauceDemo() {
        sdlp.enterUsername(SAUCE_DEMO_USER_NAME);
    }

    @And("I enter my valid password at SauceDemo")
    public void iEnterMyValidPasswordAtSauceDemo() {
        sdlp.enterPassword(SAUCE_DEMO_PASSWORD);
    }

    @When("I click on Login Button at SauceDemo")
    public void iClickOnLoginButtonAtSauceDemo() {
        sdlp.clickLoginButton();
    }

    @Then("I should be able to successfully login at SauceDemo")
    public void iShouldBeAbleToSuccessfullyLoginAtSauceDemo() {
        // DO THIS LATER
    }

    @Given("Verify logo name for SauceDemo")
    public void verifyLogoNameForSauceDemo() {
        sdlp.verifyLogoName();
    }

    @And("I enter my valid {string} and {string} at SauceDemo")
    public void iEnterMyValidUserNameAndPasswordAtSauceDemo(String userName, String password) {
        sdlp.enterUsername(userName);
        sdlp.enterPassword(password);
    }

    @And("I enter my invalid username at SauceDemo")
    public void iEnterMyInvalidUsernameAtSauceDemo() {
        
    }

    @Then("I should not be able to successfully login at SauceDemo")
    public void iShouldNotBeAbleToSuccessfullyLoginAtSauceDemo() {
    }
}
