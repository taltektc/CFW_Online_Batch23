package stepDef;

import base.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_page;

public class Login_step extends TestData {
    Login_page loginPage = new Login_page();
    @Given("I am at TalentTEK Homepage")
    public void iAmAtTalentTEKHomepage() {
        // Selenium code
    }

    @And("I enter my valid email address")
    public void iEnterMyValidEmailAddress() {
        loginPage.enterEmail("hassan.qa@gmail.com"); // Still hard-coded
    }

   @And("I enter my valid password")
    public void iEnterMyValidPassword() {
        loginPage.enterPassword(GLOBAL_STUDENT_PASSWORD);
    }

    @When("I click on Login Button")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should not be able to successfully login")
    public void iShouldNotBeAbleToSuccessfullyLogin() {
        loginPage.invalidEmailOrPasswordMsg();
    }

    @And("I enter my invalid email address")
    public void iEnterMyInvalidEmailAddress() {
        loginPage.enterEmail("fakeemailaddress3e343@gmail.com");
    }

    @And("I enter my invalid password")
    public void iEnterMyInvalidPassword() {
        loginPage.enterPassword("FakePassword12121");
    }
}
