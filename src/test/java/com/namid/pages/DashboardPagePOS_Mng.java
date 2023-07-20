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

}
