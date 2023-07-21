package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairsPage {

    public RepairsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //th[@class='o-sort-down o_column_sortable']
    @FindBy(xpath = "//span[ contains(text(),'Repairs')]")
    public WebElement repairsBtn;


    @FindBy(xpath = "(//th[@class='o_column_sortable'])")
    public List<WebElement> topNavigationBar;


   // @FindBy(xpath = "//th[@class='o-sort-down o_column_sortable']")
   // public WebElement columnOfWarranty;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;


   @FindBy(xpath="//td[@class='o_data_cell o_required_modifier']")
    public WebElement iceCream;


    @FindBy(xpath = "//th//input[@type='checkbox']")
    public WebElement RepairReferenceCheckbox;

    @FindBy(xpath = "//table//input[@type='checkbox']")
    public List<WebElement> allCheckBox;


}
