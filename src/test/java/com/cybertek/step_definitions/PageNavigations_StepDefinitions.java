package com.cybertek.step_definitions;

import com.cybertek.pages.LandingPage;
import com.cybertek.pages.TableRowPage;
import com.cybertek.pages.UsersPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PageNavigations_StepDefinitions {
UsersPage usersPage=new UsersPage();
LandingPage landingPage=new LandingPage();

Select select;
    @When("I click on {string} link")
    public void i_click_on_link(String link) {
BrowserUtils.waitForVisibility(landingPage.dashboardPageLink,5);
        switch ((link.toLowerCase())){
            case"dashboard":
                landingPage.dashboardPageLink.click();
                break;
            case"users":
                landingPage.UsersPageLink.click();
                break;
            case"books":
                landingPage.booksPageLink.click();
                break;
        }


    }




    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
       BrowserUtils.waitForVisibility(usersPage.showRecordsDropDown,5);
        select=new Select(usersPage.showRecordsDropDown);
      //  System.out.println(select.getFirstSelectedOption().getText());
      String actual=  select.getFirstSelectedOption().getText();
       // Assert.assertEquals(actual,String.valueOf(expected));
        Assert.assertEquals(expected+"",actual);




    }
    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String>options) {
      //  System.out.println("options.size() = " + options.size());
      //  System.out.println("options = " + options);
        select=new Select(usersPage.showRecordsDropDown);
      //  select.getOptions();//options +enter
        List<WebElement> webElements = select.getOptions();
       List<String>actualTexts= BrowserUtils.getElementsText(webElements);
       Assert.assertEquals(options,actualTexts);




    }
TableRowPage tableRowPage=new TableRowPage();
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String>columnNames) {
List<String>result=new ArrayList<>();
   for (WebElement each:tableRowPage.columns){

       result.add(each.getText());

      // System.out.println(columnNames);
      // System.out.println(result);
   }
        Assert.assertEquals(columnNames,result);
    }




}
