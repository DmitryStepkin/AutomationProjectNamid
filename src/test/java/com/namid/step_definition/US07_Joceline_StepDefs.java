package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.pages.PosPage;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.Columns;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US07_Joceline_StepDefs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    PosPage posPage = new PosPage();
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
}






