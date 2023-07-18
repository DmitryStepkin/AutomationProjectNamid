package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.pages.RepairsPage;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US12_ueni_stepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    RepairsPage repairsPage = new RepairsPage();

    @Given("POS is on the Repairs page.")
    public void pos_is_on_the_repairs_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("loginPostManager"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordPostManager"));
        loginPage.loginBtn.click();
        dashboardPage.repairs.click();


    }

    @When("user click the top checkbox in repair page")
    public void user_click_the_top_checkbox_in_repair_page() {
        repairsPage.RepairReferenceCheckbox.click();
    }

    @Then("user verify all the checkbox are selected")
    public void user_verify_all_the_checkbox_are_selected() {
        // List<WebElement> CheckboxList = Driver.getDriver().findElements(By.xpath("//table//input[@type='checkbox']"));
        for (WebElement eachElement : repairsPage.allCheckBox) {
            Assert.assertTrue(eachElement.isSelected());
        }

    }

    @Given("sales manager is on the Repairs page.")
    public void salesManagerIsOnTheRepairsPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("loginSalesManager"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordSalesManager"));
        loginPage.loginBtn.click();
        dashboardPage.repairs.click();
    }
}
