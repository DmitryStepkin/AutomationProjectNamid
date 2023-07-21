package com.namid.step_definition;

import com.namid.pages.DashboardPagePOS_Mng;
import com.namid.pages.DocumentationPage;
import com.namid.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class US10_Dmitrii_StepDefs {

    DashboardPagePOS_Mng dashboardPage=new DashboardPagePOS_Mng();
    DocumentationPage documentationPage=new DocumentationPage();



    @When("User clicks on his name")
    public void user_clicks_on_his_name() {
        dashboardPage.userName.click();
    }
    @When("User clicks on documentation button")
    public void user_clicks_on_documentation_button() {
        dashboardPage.documentationBtn.click();
    }
    @Then("User should jump in a new window")
    public void user_should_jump_in_a_new_window_and_sees_message() {

        for (String eachWindow : Driver.getDriver().getWindowHandles()) {
            if (Driver.getDriver().switchTo().window(eachWindow).getTitle().contains("Odoo Documentation")){
                Driver.getDriver().switchTo().window(eachWindow);
            }
        }




    }

    @And("User sees {string} message")
    public void userSeesMessage(String expectedMessage) {
        String actualMessage = documentationPage.documentationMessage.getText();

        Assert.assertEquals(expectedMessage,actualMessage);

    }



    @And("User sees {int} main document topics")
    public void userSeesMainDocumentTopics(int expectedTopicsQuantity) {

        int actualsTopicsQuantity = documentationPage.documentTopics.size();

        Assert.assertEquals(expectedTopicsQuantity,actualsTopicsQuantity);
    }
}
