package com.namid.pages;

import com.namid.utilities.ConfigurationReader;
import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginBtn;

    public void loginAsPostManager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginInput.sendKeys(ConfigurationReader.getProperty("loginPostManager"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("passwordPostManager"));
        loginBtn.click();
    }
    public void loginAsCRM_Manager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginInput.sendKeys(ConfigurationReader.getProperty("loginCRMManager"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("passwordCRMManager"));
        loginBtn.click();
    }
    public void loginAsSalesManager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginInput.sendKeys(ConfigurationReader.getProperty("loginSalesManager"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("passwordSalesManager"));
        loginBtn.click();
    }

    public void loginAsInventoryManager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginInput.sendKeys(ConfigurationReader.getProperty("loginInventoryManager"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("passwordInventoryManager"));
        loginBtn.click();
    }
    public void loginAsExpensesManager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginInput.sendKeys(ConfigurationReader.getProperty("loginExpensesManager"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("passwordExpensesManager"));
        loginBtn.click();
    }
}
