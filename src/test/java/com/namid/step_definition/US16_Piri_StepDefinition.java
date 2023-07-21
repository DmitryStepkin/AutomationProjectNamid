package com.namid.step_definition;

import com.namid.pages.DashBoardExpensesPage;
import com.namid.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US16_Piri_StepDefinition {

    LoginPage loginPage =new LoginPage();
    DashBoardExpensesPage dashBoardExpensesPage = new DashBoardExpensesPage();
    @Given("User logs in as Expenses manager")
    public void user_logs_in_as_expenses_manager() {
        loginPage.loginAsExpensesManager();

    }
    @Then("user should see twelve modules at the top of the page")
    public void user_should_see_twelve_modules_at_the_top_of_the_page(List<String> expectedModules2) {

        List<String> actualModules2 =new ArrayList<>();
        for (WebElement each : dashBoardExpensesPage.expensesModules){
            actualModules2.add(each.getText());
        }
        Assert.assertEquals(expectedModules2,actualModules2);


    }
    @Then("user should see username on at the right top of the page")
    public void user_should_see_username_on_at_the_right_top_of_the_page() {

        String expectedTitle = "ExpensesManager57";
        String actualTitle = dashBoardExpensesPage.expensesManagerDisplayName.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
