package com.namid.step_definition;

import com.namid.pages.LoginPage;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_Dmitrii_StepDefs {

    LoginPage loginPage=new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.fidexio.com/");
    }
    @When("User enter {string} and {string} in the appropriate fields")
    public void user_enter_and_in_the_appropriate_fields(String username, String password) {
        loginPage.loginInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("User should land on the dashboard page")
    public void user_should_land_on_the_dashboard_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expetedTitle="#Inbox - Odoo";
    }


}
