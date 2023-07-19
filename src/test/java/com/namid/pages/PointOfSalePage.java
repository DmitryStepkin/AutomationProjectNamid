package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PointOfSalePage {

    public PointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@data-menu='489']")
    public WebElement Order;

    @FindBy (xpath = "//tr//input[@type='checkbox']")
    public List<WebElement> checkbox;

    @FindBy (xpath = "(//input[@type='checkbox'])[3]")
    public WebElement mainCheckbox;
}
