package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairsPage {
    public RepairsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th//input[@type='checkbox']")
    public WebElement RepairReferenceCheckbox;

    @FindBy(xpath = "//table//input[@type='checkbox']")
    public List<WebElement> allCheckBox;


}
