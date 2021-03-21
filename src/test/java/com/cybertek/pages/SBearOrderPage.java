package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SBearOrderPage extends SBearBasePage {
    public SBearOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;
    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement inputCity;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement inputState;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement inputZip;
    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> CreditCards;
    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaCard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement inputCardNumber;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement inputExpireDate;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

}
