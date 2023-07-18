package com.namid.step_definition;

import com.namid.pages.CalendarPage;
import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class US03_Suraye_StepDefs {

    WebDriver driver;
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();

    CalendarPage calendarPage = new CalendarPage();

    @Given("User is in the login page")
    public void user_is_in_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters {string} and {string} in the appropriate fields")
    public void user_enter_and_in_the_appropriate_fields(String username, String password) {
        loginPage.loginInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }
    @When("User click on the login button")
    public void user_click_on_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("User sees his name on dashboard")
    public void user_Should_See_The_Dashboard() {
        System.out.println("User sees his name on dashboard");
    }


    @When("User navigates to the calendar page")
    public void user_navigates_to_the_calendar_page() {

    calendarPage.calendarLink.click();

    }

    @When("User selects the daily view option")
    public void user_selects_the_daily_view_option() {

    calendarPage.day.click();

    }

    @Then("User should see the calendar displayed in daily format")
    public void user_should_see_the_calendar_displayed_in_daily_format() {

        System.out.println("User should see the calendar displayed in daily format");


    }

    @When("User selects the weekly view option")
    public void user_selects_the_weekly_view_option() {

        calendarPage.week.click();

    }

    @Then("User should see the calendar displayed in weekly format")
    public void user_should_see_the_calendar_displayed_in_weekly_format() {

        System.out.println("User should see the calendar displayed in weekly format");

    }

    @When("User selects the monthly view option")
    public void user_selects_the_monthly_view_option() {

        calendarPage.month.click();

    }

    @Then("User should see the calendar displayed in monthly format")
    public void user_should_see_the_calendar_displayed_in_monthly_format() {

        System.out.println("User should see the calendar displayed in monthly format");

    }




}
