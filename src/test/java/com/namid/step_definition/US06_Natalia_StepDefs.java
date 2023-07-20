package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.InventoryModulePage;
import com.namid.pages.LoginPage;
import com.namid.utilities.BrowserUtils;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US06_Natalia_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    InventoryModulePage inventoryModulePage = new InventoryModulePage();

    Actions actions = new Actions(Driver.getDriver());


    @Given("User logged in as PosManager")
    public void user_logged_in_as_pos_manager() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginInput.sendKeys("posmanager10@info.com");
        loginPage.passwordInput.sendKeys("posmanager");
        loginPage.loginBtn.click();


    }
    @When("User goes to {string} module")
    public void user_goes_to_module(String inventoryModule) {
       dashboardPage.inventoryModule.click();

    }
    @When("User click Products button")
    public void user_click_products_button() {
        inventoryModulePage.productsButton.click();


    }
    @When("User click Create button")
    public void user_click_create_button() {
        WebElement createButton = Driver.getDriver().findElement(By.xpath("//button[@accesskey='c']"));
        createButton.click();

    }

    @When("User should be able to enter {string} into input box and click save button")
    public void userShouldBeAbleToEnterIntoInputBoxAndClickSaveButton(String enteredName) {
       WebElement inputBox = Driver.getDriver().findElement(By.id("o_field_input_479"));
       inputBox.sendKeys(enteredName);
       WebElement saveButton = Driver.getDriver().findElement(By.xpath("//button[@accesskey='s']"));
       saveButton.click();

    }
    @And("User goes back to Products by clicking Products button and search {string}")
    public void userGoesBackToProductsByClickingProductsButtonAndSearch(String enteredName) {
        inventoryModulePage.productsButton.click();
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@class='o_searchview_input']"));
        searchBox.sendKeys(enteredName + Keys.ENTER);

    }
    @Then("The {string} of the customer which the user entered should be displayed")
    public void theOfTheCustomerWhichTheUserEnteredShouldBeDisplayed(String expectedToBeDisplayed) {
    WebElement displayedElement = Driver.getDriver().findElement(By.xpath("//strong[@class='o_kanban_record_title'][1]/span[.="+expectedToBeDisplayed+"]"));

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(displayedElement));
        Assert.assertTrue(displayedElement.isDisplayed());


    }
















    @When("User click on product")
    public void user_click_on() {
        WebElement anyProduct = Driver.getDriver().findElement(By.xpath("(//strong[@class='o_kanban_record_title'])[3]"));
        anyProduct.click();


    }
    @When("User click Edit button")
    public void user_click_edit_button() {
    WebElement editButton = Driver.getDriver().findElement(By.xpath("//button[@accesskey='a']"));
    editButton.click();


    }


        @Then("User should be able to change the Name of the product field")
        public void userShouldBeAbleToChangeTheNameOfTheProductField() {
            WebElement productName = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Product Name']"));
            productName.clear();
            productName.sendKeys("Changes Made");
        }

    @Then("User should be able to edit check boxes")
    public void userShouldBeAbleToEditCheckBoxes() {
        WebElement canBeSold = Driver.getDriver().findElement(By.xpath("//div[@name='sale_ok']/input"));
        canBeSold.click();
        WebElement canBePurchase = Driver.getDriver().findElement(By.xpath("//div[@name='purchase_ok']/input"));
        canBePurchase.click();
        WebElement canBeExpensed = Driver.getDriver().findElement(By.xpath("//div[@name='can_be_expensed']/input"));
        canBeExpensed.click();



    }


    @Then("User should be able to edit Product Type dropdown")
    public void userShouldBeAbleToEditProductTypeDropdown() {
        WebElement productTypeDropdown = Driver.getDriver().findElement(By.xpath("//select[@name='type']"));
        Select select = new Select(productTypeDropdown);
        select.selectByIndex(3);
        //WebElement categoryList = Driver.getDriver().findElement(By.id("o_field_input_1322"));
    }

    @Then("User should be able to edit Internal Reference and Barcode")
    public void userShouldBeAbleToEditInternalReferenceAndBarcode() {
        WebElement internalReference = Driver.getDriver().findElement(By.xpath("//input[@name='default_code']"));
        internalReference.clear();
        internalReference.sendKeys("Test 1");
        WebElement barcode = Driver.getDriver().findElement(By.xpath("//input[@name='barcode']"));
        barcode.clear();
        barcode.sendKeys("Test 1");
    }

    @Then("User should be able to edit Sales Price and Cost fields")
    public void userShouldBeAbleToEditSalesPriceAndCostFields() {
        WebElement salesPrice = Driver.getDriver().findElement(By.xpath("//div[@name='list_price']//input"));
        BrowserUtils.sleep(3);
        salesPrice.click();
        salesPrice.sendKeys(Keys.HOME);
        salesPrice.sendKeys(Keys.DELETE);
        salesPrice.sendKeys(Keys.DELETE);
        salesPrice.sendKeys(Keys.DELETE);
        salesPrice.sendKeys(Keys.DELETE);
        salesPrice.sendKeys(Keys.DELETE);
        salesPrice.sendKeys(Keys.DELETE);
        salesPrice.sendKeys(Keys.DELETE);
        salesPrice.sendKeys(Keys.DELETE+"200");


        WebElement cost = Driver.getDriver().findElement(By.xpath("//div[@name='standard_price']//input"));
        cost.clear();
        cost.sendKeys("250.00");
        WebElement saveButton = Driver.getDriver().findElement(By.xpath("//button[@accesskey='s']"));
        saveButton.click();

    }






}
