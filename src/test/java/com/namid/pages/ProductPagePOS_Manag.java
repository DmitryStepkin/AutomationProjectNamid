package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPagePOS_Manag {

    public ProductPagePOS_Manag(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    public WebElement createProductBtn;

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    public WebElement productNameInput;

    @FindBy(xpath = "//div/button[contains(text(),'Save')]")
    public WebElement saveBtn;

    @FindBy(xpath = "//h1/span[@name='name']")
    public WebElement actualProductName;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement searchBth;

    public String locator="(//span[.='TEXT'])[1]";

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editBtn;


}
