package com.namid.pages;

import com.namid.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardExpensesPage {
    public DashBoardExpensesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//li[@style='display: block;']//span" )
    public List<WebElement> expensesModules;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement expensesManagerDisplayName;

}
