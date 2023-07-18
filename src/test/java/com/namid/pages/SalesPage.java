package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage {
    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//th[@width='1']//input")
    public WebElement firstCheckbox;

    @FindBy(xpath = "//tr//input[@type='checkbox']")
    public List<WebElement> AllCheckbox;
}
