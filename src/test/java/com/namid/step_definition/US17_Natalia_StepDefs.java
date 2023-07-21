package com.namid.step_definition;

import com.namid.pages.LoginPage;
import com.namid.utilities.BrowserUtils;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US17_Natalia_StepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("User logged in as Sales Manager")
    public void user_logged_in_as_sales_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginInput.sendKeys("salesmanager15@info.com");
        loginPage.passwordInput.sendKeys("salesmanager");
        loginPage.loginBtn.click();

    }
    @Then("User should be able to access nineteen modules")
    public void user_should_be_able_to_access_nineteen_modules() {

        List<WebElement> allModules = Driver.getDriver().findElements(By.xpath("//li[@style='display: block;']//span"));

        for (WebElement each : allModules){
            BrowserUtils.sleep(2);
            Assert.assertTrue(each.isEnabled());
        }

    }


}
