package com.namid.step_definition;

import com.github.javafaker.Faker;
import com.namid.pages.DashboardPagePOS_Mng;
import com.namid.pages.LoginPage;
import com.namid.pages.ProductEditPage;
import com.namid.pages.ProductPagePOS_Manag;
import com.namid.utilities.BrowserUtils;
import com.namid.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class US06_Dmitrii_StepDefs {

    LoginPage loginPage=new LoginPage();
    DashboardPagePOS_Mng dashboardPage=new DashboardPagePOS_Mng();
    ProductPagePOS_Manag productPage=new ProductPagePOS_Manag();
    ProductEditPage productEditPage=new ProductEditPage();
    Faker faker=new Faker();

    @Given("User successfully logged in as POS manager")
    public void user_successfully_logged_in_as_pos_manager() {
        loginPage.loginAsPostManager();
    }
    @Then("User clicks on Inventory Button at the dashboard")
    public void user_clicks_on_inventory_button_at_the_dashboard() {
        dashboardPage.inventoryBtn.click();
    }
    @Then("User clicks on Product button")
    public void user_clicks_on_product_button() {
       dashboardPage.productBtn.click();
    }
    @Then("User clicks on create button")
    public void user_clicks_on_create_button() {
        productPage.createProductBtn.click();
    }
    @Then("User should write a {string} of the product")
    public void user_should_write_a_of_the_product(String name) {
        productPage.productNameInput.sendKeys(name);
    }
    @Then("User clicks on save button")
    public void user_clicks_on_save_button() {
        productPage.saveBtn.click();

    }

    @And("User should sees the {string} item name which he entered on the product.")
    public void userShouldSeesTheNameWhichHeEnteredOnTheProduct(String expectedName) {
        String actualName=productPage.actualProductName.getText();

        Assert.assertEquals(expectedName,actualName);
    }

    @Given("User as a PosManager is on the Product page")
    public void userAsAPosManagerIsOnTheProductPage() {
        loginPage.loginAsPostManager();
        dashboardPage.inventoryBtn.click();
        dashboardPage.productBtn.click();

    }

    @Then("User write in a search box desire item {string}")
    public void userWriteInASearchBoxDesireItem(String name) {
        productPage.searchBox.sendKeys(name);
        productPage.searchBth.click();
    }


    @And("User can click on this {string} item")
    public void userCanClickOnThisItem(String name) {

        String nameLocator = productPage.locator.replace("TEXT",name);
        WebElement item = Driver.getDriver().findElement(By.xpath(nameLocator));
        item.click();
 }

    @And("User clicks on edit button")
    public void userClicksOnEditButton() {
        productPage.editBtn.click();
    }


    @Then("User can edit check box on this product")
    public void verifyUserCanEditCheckBoxOnThisProduct() {

        productEditPage.canBeSoldBth.click();
        productEditPage.canBePurchasedBth.click();
        productEditPage.canBeExpensedBth.click();

    }



    @And("User can select any product type in dropdown")
    public void verifyUserCanSelectProductTypeInDropdown() {

        Select select=new Select(productEditPage.productTypeDropdown);
        select.selectByIndex(3);

    }

    @And("User can edit Internal Reference information")
    public void userCanEditInternalReferenceInformation() {
        productEditPage.internalReferenceInput.clear();

        productEditPage.internalReferenceInput.sendKeys(faker.harryPotter().spell());
    }

    @And("User can edit Barcode information")
    public void userCanEditBarcodeInformation() {
        productEditPage.barcodeInput.clear();

        productEditPage.barcodeInput.sendKeys(Keys.CLEAR+faker.hipster().word());
    }

    @And("User can change sales price")
    public void userCanChangeSalesPrice() {

        productEditPage.salesPriceInput.click();

        productEditPage.salesPriceInput.sendKeys(Keys.HOME);
        productEditPage.salesPriceInput.sendKeys(Keys.DELETE);
        productEditPage.salesPriceInput.sendKeys(Keys.DELETE);
        productEditPage.salesPriceInput.sendKeys(Keys.DELETE);
        productEditPage.salesPriceInput.sendKeys(Keys.DELETE);
        productEditPage.salesPriceInput.sendKeys(Keys.DELETE);
        productEditPage.salesPriceInput.sendKeys(Keys.DELETE+(faker.number().numberBetween(1,3000)+""));



    }

    @And("User can change cost")
    public void userCanChangeCost() {

        productEditPage.costInput.click();
        productEditPage.costInput.sendKeys(Keys.HOME);
        productEditPage.costInput.sendKeys(Keys.DELETE);
        productEditPage.costInput.sendKeys(Keys.DELETE);
        productEditPage.costInput.sendKeys(Keys.DELETE);
        productEditPage.costInput.sendKeys(Keys.DELETE);
        productEditPage.costInput.sendKeys(Keys.DELETE);
        productEditPage.costInput.sendKeys(Keys.DELETE+(faker.number().numberBetween(1,3000)+""));


    }
}
