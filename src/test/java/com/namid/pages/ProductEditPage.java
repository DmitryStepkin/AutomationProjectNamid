package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductEditPage {

    public ProductEditPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@name='sale_ok']/input")
    public WebElement canBeSoldBth;



    @FindBy(xpath = "//div[@name='purchase_ok']/input")
    public WebElement canBePurchasedBth;

    @FindBy(xpath = "//div[@name='can_be_expensed']/input")
    public WebElement canBeExpensedBth;

    @FindBy(xpath = "(//td[@style='width: 100%;']/select)[1]")
    public WebElement productTypeDropdown;

    @FindBy(xpath = "//input[@name='default_code']")
    public WebElement internalReferenceInput;

    @FindBy(xpath = "//input[@name='barcode']")
    public WebElement barcodeInput;

    @FindBy(xpath = "//div[@name='list_price']//input")
    public WebElement salesPriceInput;

    @FindBy(xpath = "//div[@name='standard_price']//input")
    public WebElement costInput;


}
