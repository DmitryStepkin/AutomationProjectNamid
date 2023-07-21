package com.namid.pages;



import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Day']")
    public WebElement day;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement week;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement month;

    @FindBy(xpath = "//table/tbody[@class='fc-body']")
    public WebElement timeBoxPage;

    @FindBy(xpath = "//table//tbody//tr[27]//td[2]")
    public WebElement timeBoxes;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement eventNameInput;

    @FindBy(xpath = "//span[normalize-space()='Create']")
    public WebElement createEventBtn;


    @FindBy(xpath = "//table/tbody//td//a/div//div/div[@class='o_field_name o_field_type_char']")
    public WebElement linkDoctorAppointment;

    @FindBy(xpath = "//div[@class='o_group']")
    public WebElement eventDetails;

    @FindBy(xpath = "//span[normalize-space()='Delete']")
    public WebElement deleteBtn;











}
