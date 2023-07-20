package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPagePOS_Mng {

    public DashboardPagePOS_Mng() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@data-menu='484']")
    public WebElement pointOfSale;

















    @FindBy(xpath = "(//span[ contains(text(),'Inventory')])[1]")
    public WebElement inventoryBtn;

    @FindBy(xpath = "//a[@data-menu='378']/span")
    public WebElement productBtn;
}
