package com.namid.step_definition;
import com.namid.pages.CalendarPage;
import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04_Suraye_StepDefs {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    CalendarPage calendarPage = new CalendarPage();

    @Given("User on the login page of the application")
    public void user_on_the_login_page_of_the_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("User have entered the valid credentials")
    public void user_have_entered_the_valid_credentials() {
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("loginPostManager"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordPostManager"));
    }
    @Given("User click the Login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();
    }
    @When("User on the Calendar module")
    public void user_on_the_module() {
        dashboardPage.calendarLink.click();
    }

    @And("User clicks on a time box on the calendar")
    public void userClicksOnATimeBoxOnTheCalendar() {
        calendarPage.timeBoxPage.isDisplayed();
        calendarPage.timeBoxes.isDisplayed();
        calendarPage.timeBoxes.click();
    }

    @Then("User should be able to create an event")
    public void user_should_be_able_to_create_an_event() {

        System.out.println("User should be able to create an event");
    }
    @And("User creates an event on the calendar")
    public void userCreatesAnEventOnTheCalendarWithTitle() {

        calendarPage.eventNameInput.sendKeys("Doctor Appointment");
        calendarPage.createEventBtn.click();
    }
    @When("User click on the created event on the calendar")
    public void user_click_on_the_created_event_on_the_calendar() {

        calendarPage.linkDoctorAppointment.click();
    }
    @Then("User should be able to see the event details")
    public void user_should_be_able_to_see_the_event_details() {

        Assert.assertTrue("Event details are not visible", calendarPage.eventDetails.isDisplayed());
    }



}
