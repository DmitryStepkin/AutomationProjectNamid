package com.namid.step_definition;

import com.namid.pages.DashboardPageEventCRM_Manag;
import com.namid.pages.LoginPage;
import com.namid.utilities.BrowserUtils;
import com.namid.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US15_Dmitrii_StepDefs {

    LoginPage loginPage=new LoginPage();
    DashboardPageEventCRM_Manag dashboardPage=new DashboardPageEventCRM_Manag();

    @Given("User successfully logged in as CRM manager")
    public void user_successfully_logged_in_as_crm_manager() {
        loginPage.loginAsCRM_Manager();
       // BrowserUtils.sleep(3);
    }


    @Then("User should see on dashboard a list of modules as below")
    public void userShouldSeeAListOfModulesAsBelow(List<String> expectedModules) {

        List<String> actualModules=new ArrayList<>();

        for (WebElement eachModule : dashboardPage.modulesBtn) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules,actualModules);

    }

    @And("User can click and  access to different modules, check the title for each modules as below")
    public void userCanClickAndAccessToDifferentModules(List<String> expectedTitle) {


        List<String> actualTitle=new ArrayList<>();
        for (int i = 0; i < dashboardPage.modulesBtn.size(); i++) {    // using regular loop in order to get index numbers

            dashboardPage.modulesBtn.get(i).click();
            // wait until title is loading and contains expected title
            WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleContains(expectedTitle.get(i)));

            String title=Driver.getDriver().getTitle();
            title=title.replace(" - Odoo","");
            actualTitle.add(title);
        }

        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
