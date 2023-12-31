package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DocumentationPage {

    public DocumentationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//h1[@class='text-white']")
    public WebElement documentationMessage;

    @FindBy(tagName = "h2")
    public List<WebElement> documentTopics;
}
