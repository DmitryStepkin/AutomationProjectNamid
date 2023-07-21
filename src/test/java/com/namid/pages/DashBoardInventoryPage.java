package com.namid.pages;

import com.namid.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardInventoryPage {
        public DashBoardInventoryPage() {

            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//li[@style='display: block;']//span")
        public List<WebElement> topNavigationBar;

        @FindBy(xpath = "//span[@class='oe_topbar_name']")
        public WebElement inventoryManagerDisplayName;

    }

