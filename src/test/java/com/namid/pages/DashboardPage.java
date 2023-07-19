package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userName;

    @FindBy(xpath ="//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span[@class='oe_menu_text']")
    public List<WebElement> topNavigationBar;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement inventoryManagerDisplayName;

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement inventoryModule;
}
