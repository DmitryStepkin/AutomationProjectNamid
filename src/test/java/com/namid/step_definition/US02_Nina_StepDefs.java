package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class US02_Nina_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is at the login page")
    public void user_is_at_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User enter {string} for Email and {string} for Password")
    public void user_enter_for_email_and_for_password(String email, String password) {
         loginPage.loginInput.sendKeys(email);
         loginPage.passwordInput.sendKeys(password);
    }
    @When("User click on Log In button")
    public void user_click_on_log_in_button() {
         loginPage.loginBtn.click();
    }

    @Then("User should see his {string} on dashboard")
    public void user_should_see_his_on_dashboard(String expectedUserName) {
        String actualUserName = dashboardPage.userName.getText();

        Assert.assertEquals( expectedUserName, actualUserName);
    }

    @Then("User should see his {string} on a login page")
    public void user_should_see_his_on_a_login_page(String expectedErrorMsg) {

        String actualErrorMsg = loginPage.invalidCredentialsMessage.getText();

        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
    }


}
