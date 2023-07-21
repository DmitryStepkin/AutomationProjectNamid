package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPagePOS_Mng {

    public DashboardPagePOS_Mng() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@data-menu='484']")
    public WebElement pointOfSale;

    @FindBy (xpath = "//nav[@class='navbar navbar-inverse']")
    public List<WebElement> allModules;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userName;

    @FindBy(xpath = "//a[.='Documentation']")
    public WebElement documentationBtn;















    @FindBy(xpath = "(//span[ contains(text(),'Inventory')])[1]")
    public WebElement inventoryBtn;

    @FindBy(xpath = "//a[@data-menu='378']/span")
    public WebElement productBtn;

}
