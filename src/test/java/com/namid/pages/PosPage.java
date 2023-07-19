package com.namid.pages;

import com.namid.utilities.Driver;
import org.apache.poi.ss.formula.functions.Columns;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PosPage {


    public PosPage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//span[.='POSManager10']")
    public  WebElement posManagerDisplayName;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public WebElement Sales;
@FindBy(xpath = "//th[.='Quotation Number']")
    public WebElement QuotationNumber;
@FindBy(xpath = "//th[.='Quotation Date']")
    public WebElement QuotationDate;
@FindBy(xpath = "//th[.='Customer']")
    public WebElement Customer;
@FindBy(xpath = "//th[.='Salesperson']")


    public WebElement Salesperson;

@FindBy(xpath = "//th[.='Total']")
    public WebElement Total;
@FindBy(xpath = "//th[.='Status']")
    public WebElement Status;
@FindBy(xpath = "//thead//tr")

public  List<WebElement> Columns;
}

