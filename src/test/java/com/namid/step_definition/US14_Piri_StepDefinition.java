package com.namid.step_definition;

import com.namid.pages.DashBoardInventoryPage;
import com.namid.pages.DashboardPage;
import com.namid.pages.LoginPage;
import com.namid.utilities.BrowserUtils;
import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_Piri_StepDefinition {

    LoginPage loginPage=new LoginPage();
    DashBoardInventoryPage dashboardPage = new DashBoardInventoryPage();

    @Given("User logs in as Inventory manager")
    public void user_logs_in_as_inventory_manager() throws InterruptedException {
        loginPage.loginAsInventoryManager();
        Thread.sleep(5000);
    }

    @Then("user should see sixteen modules at the top of the page")
    public void user_should_see_sixteen_modules_at_the_top_of_the_page(List<String> expectedModules) {
      //  System.out.println("locators list" +dashboardPage.topNavigationBar);
       // System.out.println("List length" + dashboardPage.topNavigationBar.size());

      List<String> actualModules = new ArrayList<>();
       for (WebElement i: dashboardPage.topNavigationBar){
           actualModules.add(i.getText());
        }
        Assert.assertTrue(expectedModules.equals(actualModules));



        //System.out.println("actualModules = " + actualModules);


    }
    @Then("user should see username on at the right to of the page")
    public void user_should_see_username_on_at_the_right_to_of_the_page() {

        String expectedTitle ="InventoryManager34";
        String actualTitle = dashboardPage.inventoryManagerDisplayName.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
