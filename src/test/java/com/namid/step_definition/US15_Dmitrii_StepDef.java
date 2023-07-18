package com.namid.step_definition;

import com.namid.pages.DashboardPageEventCRM_Manag;
import com.namid.pages.LoginPage;
import com.namid.utilities.BrowserUtils;
import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US15_Dmitrii_StepDef {

    LoginPage loginPage=new LoginPage();
    DashboardPageEventCRM_Manag dashboardPage=new DashboardPageEventCRM_Manag();

    @Given("User successfully logged in as CRM manager")
    public void user_successfully_logged_in_as_crm_manager() {
        loginPage.loginAsCRM_Manager();
        BrowserUtils.sleep(3);
    }


//    @Then("User can access to different {string}")
//    public void userCanAccessToDifferent(List<String> expectedTitle) {
//        /*List<String> actualTitle=new ArrayList<>();
//        for (WebElement eachModule : dashboardPage.modulesBtn) {
//            eachModule.click();
//            BrowserUtils.sleep(3);
//            String title=Driver.getDriver().getTitle();
//            title.replace(" - Odoo", "");
//            actualTitle.add(title);
//        }
//
//        Assert.assertEquals(expectedTitle, actualTitle);*/
//        for (WebElement eachModule : dashboardPage.modulesBtn) {
//            Assert.assertTrue(eachModule.isEnabled());
//
//        }
//
//    }


    @Then("Verify all the {string} names")
    public void verifyAllTheNames(String expectedModules) {
        List<String> actualModules=new ArrayList<>();

        for (WebElement eachModule : dashboardPage.modulesBtn) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules,actualModules);
    }
}
