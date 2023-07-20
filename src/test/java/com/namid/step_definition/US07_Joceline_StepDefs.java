package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.pages.PosPage;
import com.namid.pages.SalesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US07_Joceline_StepDefs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    PosPage posPage = new PosPage();

    SalesPage salesPage = new SalesPage();
    @Given("user on pos manager home page")
    public void user_on_pos_manager_home_page()  {
        loginPage.loginAsPostManager();

    }
    @When("user on the home page they see pos manager display name")
    public void user_on_the_home_page_they_see_pos_manager_display_name() {
        String expectedTitle ="POSManager10";
        String actualTitle = posPage.posManagerDisplayName.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("user click on sales module")
    public void user_click_on_sales_module() {
        posPage.Sales.click();
    }
    @Then("user able to see six columns on the sales page")
    public void user_able_to_see_six_columns_on_the_sales_page(List<String>expectedColumns){

        List<String>actualColumns = new ArrayList<>();

        for(WebElement eachColumns : posPage.Columns){
            actualColumns.add(eachColumns.getText());
        }


    }

    @Given("user on Sales manager home page")
    public void userOnSalesManagerHomePage() {
        loginPage.loginAsSalesManager();
    }

    @When("user on the home page they see Sales manager display name")
    public void userOnTheHomePageTheySeeSalesManagerDisplayName() {
        String expectedTitle ="SalesManager10";
        String actualTitle = salesPage.SalesManagerDisplayName.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user click on Sales module")
    public void userClickOnSalesModule() {
        salesPage.Sales.click();
    }

    @Then("user able to see six columns on the Sales page")
    public void userAbleToSeeSixColumnsOnTheSalesPage(List<String>expectedColumns) {

        List<String>actualColumns = new ArrayList<>();

        for(WebElement eachColumns : salesPage.Columns) {
            actualColumns.add(eachColumns.getText());
        }
    }
}






