package com.cybertek.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public  class BrowserUtils {

   public static WebElement waitForVisibility(WebElement element,int timeToWaitInSec){
       WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeToWaitInSec);
       return wait.until(ExpectedConditions.visibilityOf(element));
   }

public static List<String> getElementsText(List<WebElement>list){
      List<String>elemTexts=new ArrayList<>();
      for(WebElement el: list){
          elemTexts.add(el.getText());
      }
      return elemTexts;
}

    //create method name: wait
    //converting milliseconds to seconds
    //handle checked exception

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }
}
