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
    @FindBy(xpath = "//span[.='SalesManager10']")
    public WebElement SalesManagerDisplayName;
    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public WebElement Sales;

    @FindBy(xpath = "//thead//tr")
    public  List<WebElement> Columns;
    @FindBy(xpath = "//th[.='Quotation Number']")
    public WebElement QuotationNumber;
    @FindBy(xpath = "//th[.='Quotation Date']")
    public WebElement QuotationDate;

@FindBy(xpath = "//th[.='Customer']")

    public WebElement Customer;

@FindBy(xpath = "//th[.='Salesperson']")
public WebElement Salesperson;
@FindBy(xpath = "//th[@style='text-align: right;']")
public WebElement Total;
@FindBy(xpath = "//th[.='Status']")
public WebElement Status;







}
