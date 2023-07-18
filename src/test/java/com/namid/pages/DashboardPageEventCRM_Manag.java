package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPageEventCRM_Manag {

    public DashboardPageEventCRM_Manag(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//li[@style='display: block;']//span")
    public List<WebElement> modulesBtn;
}
