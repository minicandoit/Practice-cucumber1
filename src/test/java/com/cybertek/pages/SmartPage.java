package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SmartPage {
    public SmartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="ctl00_MainContent_username")
    public WebElement userInputBox;
    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordInputBox;
    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;
    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderButton;
    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;

}
