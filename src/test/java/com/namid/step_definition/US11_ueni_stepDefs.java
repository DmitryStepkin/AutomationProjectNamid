package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.pages.SalesPage;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US11_ueni_stepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    SalesPage salesPage = new SalesPage();
    @Given("user is at sales page")
    public void user_is_at_sales_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("loginSalesManager"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordSalesManager"));
        loginPage.loginBtn.click();
        dashboardPage.sales.click();
    }
    @When("user click the top checkbox")
    public void user_click_the_top_checkbox() {
        salesPage.firstCheckbox.click();
    }
    @Then("user verify  that all the quotation are selected")
    public void user_verify_that_all_the_quotation_are_selected() {
       // List<WebElement> listCheckbox = Driver.getDriver().findElements(By.xpath("//tr//input[@type='checkbox']"));
        for (WebElement allCheckbox : salesPage.AllCheckbox) {
            Assert.assertTrue(allCheckbox.isSelected());
        }

    }
}
