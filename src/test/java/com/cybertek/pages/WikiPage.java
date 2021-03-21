package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {
    public WikiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="searchInput")
    public WebElement searchBox;
    @FindBy(id="firstHeading")
    public  WebElement mainHeader;
    @FindBy(xpath = "//div[.='Steve Jobs']")
    public WebElement imageHeader;
}
