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

public class US01_Dmitrii_StepDefs {

    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
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



    @Then("User should sees his {string} on dashboard")
    public void userShouldSeesHisOnDashboard(String expectedName) {

        String actualName = dashboardPage.userName.getText();

        Assert.assertEquals(expectedName, actualName);

    }

    @And("User click on enter from keyboard")
    public void userClickOnEnterFromKeyboard() {
        loginPage.loginBtn.sendKeys(Keys.ENTER);
    }

    @Then("User should sees error message")
    public void userShouldSeesErrorMessage() {
        String actualMessage = loginPage.invalidCredentialsMessage.getText();
        String expectedMessage="Wrong login/password";
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @When("User leave blank username field and enter password")
    public void userLeaveBlankUsernameFieldAndEnterPassword() {
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordPostManager"));
    }


    @Then("User should sees error message in username field")
    public void userShouldSeesErrorMessageInUsernameField() {

        String actualMessage = loginPage.loginInput.getAttribute("validationMessage");
        String expectedMessage = "Please fill out this field.";
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @When("User leave blank password field and enter username")
    public void userLeaveBlankPasswordFieldAndEnterUsername() {
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("loginPostManager"));
    }

    @Then("User should sees error message in password field")
    public void userShouldSeesErrorMessageInPasswordField() {
        String actualMessage = loginPage.passwordInput.getAttribute("validationMessage");
        String expectedMessage = "Please fill out this field.";
        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
