package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage2 {


    public SalesPage2(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][normalize-space()='Sales']")
    public WebElement salesModuleBtn;

    @FindBy(xpath = "//li[contains(text(),'Quotations')]")
    public WebElement quotationText;

    @FindBy(xpath = "//body//ul[1]/li[3]/a//span[@class='oe_menu_text'][normalize-space()='Customers']")
    public WebElement customerBtn;

    @FindBy(xpath = "//li[contains(text(),'Customers')]")
    public WebElement customersText;

    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;

    @FindBy(xpath = "//body/div//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createBtnNameField;

    @FindBy(xpath = "//table//tbody//tr//td[2]//input[@name='name']")
    public WebElement contactNameField;

    @FindBy(xpath = "//body//div/div/div[3]/button[1][@type='button']")
    public WebElement saveCloseBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement primarySaveBtn;

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//table/tbody/tr//td/input[@name='function']")
    public WebElement jobPosition;

    @FindBy(xpath = "//span[normalize-space()='1111111']")
    public WebElement customerFromList;

    @FindBy(xpath = "//body//table[2]/tbody/tr[2]/td[2]/div/input[@name='phone']")
    public WebElement newCustomerPhoneNum;



}