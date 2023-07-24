package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.pages.SalesPage2;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_Zehra_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    SalesPage2 SalesPage = new SalesPage2();


    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User have enters the valid credentials")
    public void user_have_enters_the_valid_credentials() {
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("loginSalesManager"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordSalesManager"));
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginBtn.click();

    }

    @Then("User sees his {string} on dashboard")
    public void userSeesHisOnDashboard(String expectedName) {

        String actualName = dashboardPage.userName.getText();
        Assert.assertEquals(expectedName, actualName);

    }

    @Given("User clicks the Sales module and lands on the sales dashboard page")
    public void user_clicks_the_sales_module_and_lands_on_the_sales_dashboard_page() {
        SalesPage.salesModuleBtn.click();

        String quotationText = SalesPage.quotationText.getText();
        Assert.assertEquals("Quotations", quotationText);


    }

    @And("User clicks the Customers button and lands on the Customers page")
    public void user_clicks_the_customers_button_and_lands_on_the_customers_page() {

        SalesPage.customerBtn.click();
        String actualCustomerPageTitle = SalesPage.customersText.getText();
        Assert.assertEquals("Customers", actualCustomerPageTitle);
    }

    @When("User clicks the Create button and lands on the Create Customer page")
    public void user_clicks_the_create_button_and_lands_on_the_create_customer_page() {

        SalesPage.createBtn.click();
        String actualCreateBtnPage = SalesPage.createBtn.getText();
        Assert.assertEquals("Create", actualCreateBtnPage);
        //System.out.println("User lands on the Create Customer page");

    }

    @When("User writes customer name into the name field and clicks the create button")
    public void user_writes_customer_name_into_the_name_field_and_clicks_the_create_button() {

        SalesPage.nameField.sendKeys("Zehra");
        SalesPage.createBtnNameField.click();
    }

    @When("User sees the Create Contact window on the screen")
    public void user_sees_the_create_contact_window_on_the_screen() {

        System.out.println("User sees the Create Contact window on the screen.");

    }

    @When("User fills out the Contact name field in the window and clicks the Save&Close button")
    public void user_fills_out_the_contact_name_field_in_the_window_and_clicks_the_save_close_button() {
        SalesPage.contactNameField.sendKeys("Simona");
        SalesPage.saveCloseBtn.click();
    }

    @When("User sees the customer name on the Customer information window and clicks the save button")
    public void user_sees_the_customer_name_on_the_customer_information_window_and_clicks_the_save_button() {
        System.out.println("User sees the customer name on the Customer information window.");
        SalesPage.primarySaveBtn.click();

    }

    @Then("User sees the edit button on the top of the page and clicks the edit button")
    public void user_sees_the_edit_button_on_the_top_of_the_page_and_clicks_the_edit_button() {
        System.out.println("User sees the edit button on the top of the page.");
        SalesPage.editBtn.click();


    }

    @When("User sees the customer name on the window, can edit it, and clicks the save button on top")
    public void user_sees_the_customer_name_on_the_window_can_edit_it_and_clicks_the_save_button_on_top() {

        System.out.println("User sees the customer name on the window.");
        SalesPage.jobPosition.sendKeys("Tester");
        SalesPage.primarySaveBtn.click();

    }


    @When("User clicks on any customer from the list")
    public void user_clicks_on_any_customer_from_the_list() {


        SalesPage.customerFromList.click();


    }

    @When("User clicks the edit button")
    public void user_clicks_the_edit_button() {
        System.out.println("User sees the edit button on the top of the page.");
        SalesPage.editBtn.click();


    }

    @Then("Users can edit all entered information")
    public void users_can_edit_all_entered_information() {
        System.out.println("User sees the new customer name on the window.");
        SalesPage.newCustomerPhoneNum.sendKeys("222-333-4444");
        SalesPage.primarySaveBtn.click();


    }


}
