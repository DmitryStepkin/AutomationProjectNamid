package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.By;
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
    @FindBy(xpath = "//span[.='SalesManager10']")
    public WebElement SalesManagerDisplayName;
    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public static WebElement Sales;

    @FindBy(xpath = "//thead//tr")
    public  List<WebElement> Columns;
    @FindBy(xpath = "(//td[@class='o_data_cell o_readonly_modifier o_required_modifier'])[1]")
    public WebElement QuotationNumber;
    @FindBy(xpath = "(//td[@class='o_data_cell o_readonly_modifier o_required_modifier'])[2]")
    public WebElement QuotationDate;

@FindBy(xpath = "(//td[@class='o_data_cell o_readonly_modifier o_required_modifier'])[3]")

    public WebElement Customer;

    @FindBy(xpath = "//td[.='EventsCRM_User3']")
    public WebElement Salesperson;

    @FindBy(xpath = "//td[@class='o_data_cell o_list_number o_monetary_cell o_readonly_modifier']")
    public WebElement Total;

    @FindBy(xpath = "//td[.='Sales Order']")
    public WebElement Status;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public static WebElement SearchBox;

    @FindBy(xpath = "//ul[@style='display: none;']")
    public WebElement SearchBoxDropdown;

    @FindBy(xpath = "//li[@class='o-selection-focus']")
    public static WebElement FirstOption;
    @FindBy(xpath = "//tr[@class='o_data_row']")
    public List <WebElement> ListOfResult;

















}
