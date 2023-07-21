package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.pages.RepairsPage;
import com.namid.utilities.BrowserUtils;
import com.namid.utilities.Driver;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US08_Sergei_StepDefinition {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    RepairsPage repairsPage = new RepairsPage();

   // WebDriverWait wait= (new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20)));





    @Given("User logged in as posmanager")
    public void userLoggedInAsPosmanager()  {
        loginPage.loginAsPostManager();

    }

    @Given("User logged in as salesmanager")
    public void userLoggedInAsSalesmanager() {
        loginPage.loginAsSalesManager();
    }


    @And("User click on enter on the keyboard")
    public void userClickOnEnterOnTheKeyboard() {
        loginPage.loginBtn.sendKeys(Keys.ENTER);
    }

    @Then("User sees Repairs module")
    public void userSeesRepairsModule() {

        String actualModule = repairsPage.repairsBtn.getText();
        Assert.assertTrue(actualModule.contains("Repairs"));
    }


    @Then("User click on Repairs module")
    public void user_click_on_repairs_module() {
        repairsPage.repairsBtn.click();
    }

    @Then("User should see six columns in the repair orders on the Repairs page")
    public void user_should_see_columns_in_the_repair_orders_on_the_repairs_page() {
        int culumns = repairsPage.topNavigationBar.size();
        /*String columnOfWarrantyText = repairsPage.columnOfWarranty.getText();
        if (columnOfWarrantyText.equals("Warranty Expiration")) {
            ++culumns;
        }

         */
        Assert.assertEquals(6, culumns);
    }




    @And("User types Reference data {string} in the search box")
    public void userTypesReferenceDataInTheSearchBox(String RMA) {
       // wait.until(ExpectedConditions.visibilityOf(repairsPage.searchBox));
        BrowserUtils.sleep(5);
        repairsPage.searchBox.sendKeys(RMA+Keys.ENTER);


    }


    @Then("User should see {string} the result")
    public void userShouldSeeTheResult(String expectedResult) {
       String actualresult =repairsPage.iceCream.getText();
        //BrowserUtils.sleep(15);
        Assert.assertEquals(expectedResult,actualresult);
    }



}
