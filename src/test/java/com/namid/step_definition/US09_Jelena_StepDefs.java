package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.DashboardPagePOS_Mng;
import com.namid.pages.LoginPage;
import com.namid.pages.PointOfSalePage;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class US09_Jelena_StepDefs {

    LoginPage loginPage = new LoginPage();

    DashboardPagePOS_Mng dashboardPagePOSMng = new DashboardPagePOS_Mng();
    PointOfSalePage pointOfSalePage = new PointOfSalePage();

    @Given(": User logs in as POS manager")
    public void user_logs_in_as_pos_manager() {
        loginPage.loginAsPostManager();

    }

    @When(": User clicks on Point of sales page")
    public void user_clicks_on_point_of_sales_page() {
        dashboardPagePOSMng.pointOfSale.click();


    }

    @When(": User clicks on orders section")
    public void user_clicks_on_orders_section() {
        pointOfSalePage.Order.click();

    }

    @When(": User select Order Ref box")
    public void user_select_order_ref_box() {

        pointOfSalePage.mainCheckbox.click();


    }

    @Then(": User sees all order boxes checked")
    public void user_sees_all_order_boxes_checked() {

        List<WebElement> listCheckbox = Driver.getDriver().findElements(By.xpath("//tr//input[@type='checkbox']"));


        for (WebElement allCheckbox : pointOfSalePage.checkbox) {
            Assert.assertTrue(allCheckbox.isSelected());


        }


    }

    @When(": User clicks on Action button")
    public void userClicksOnActionButton() {

        pointOfSalePage.actionButton.click();
    }


    @Then(": User sees {string}, {string}, {string} options under Action Button")
    public void userSeesOptionsUnderActionButton(String expectedDrop1, String expectedDrop2, String expectedDrop3) {


        String actualDrop2 = pointOfSalePage.exportButton.getText();
        String actualDrop3 = pointOfSalePage.deleteButton.getText();

        Assert.assertEquals(actualDrop2,expectedDrop2);
        Assert.assertEquals(actualDrop3,expectedDrop3);

    }
}





