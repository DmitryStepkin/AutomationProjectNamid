package com.namid.step_definition;

import com.namid.pages.DashboardPage;
import com.namid.pages.DashboardPagePOS_Mng;
import com.namid.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US13_Jelena_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPagePOS_Mng dashboardPagePOS_mng = new DashboardPagePOS_Mng();

    @Given("User logs in as POS manager")
    public void userLogsInAsPOSManager() {

        loginPage.loginAsPostManager();

    }

    @Then("User sees twenty two modules on top of the page")
    public void userSeesTwentyTwoModulesOnTopOfThePage(List<String>expectedMod) {

        List<String> actualMod =new ArrayList<>();
        for (WebElement each : dashboardPagePOS_mng.allModules){
            actualMod.add(each.getText());
        }
        System.out.println("actualMod = " + actualMod);
        System.out.println("expectedMod = " + expectedMod);
        Assert.assertEquals(actualMod, expectedMod);

    }
}
