package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement calendarLink;
    @FindBy(xpath = "//button[@class='o_calendar_button_today btn btn-sm btn-primary']")
    public WebElement calendarPage;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement day;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement week;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement month;






}
