package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_page;

public class Login_step {
    Login_page lp = new Login_page();
    @Given("I am at TalentTEK Homepage")
    public void iAmAtTalentTEKHomepage() {
        // Selenium code
    }

    @And("I enter my valid email address")
    public void iEnterMyValidEmailAddress() {
        lp.enterEmail("hassan.qa@gmail.com");
    }

    @And("I enter my valid password")
    public void iEnterMyValidPassword() {
        lp.enterPassword("123456");
    }

    @When("I click on Login Button")
    public void iClickOnLoginButton() {
        lp.clickLoginButton();
    }

    @Then("I should not be able to successfully login")
    public void iShouldNotBeAbleToSuccessfullyLogin() {
        lp.invalidEmailOrPasswordMsg();
    }

    @And("I enter my invalid email address")
    public void iEnterMyInvalidEmailAddress() {

    }

    @And("I enter my invalid password")
    public void iEnterMyInvalidPassword() {
    }
}
