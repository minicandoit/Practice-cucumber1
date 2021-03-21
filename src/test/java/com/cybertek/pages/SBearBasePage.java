package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class SBearBasePage {
    SBearBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrders;
    @FindBy(linkText = "View all products")
    public WebElement viewAllProducts;
    @FindBy(linkText = "Order")
    public WebElement Order;



}
