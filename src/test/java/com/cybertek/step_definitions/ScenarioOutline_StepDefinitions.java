package com.cybertek.step_definitions;

import com.cybertek.pages.ListOfAllOrdersPage;
import com.cybertek.pages.SBearOrderPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ScenarioOutline_StepDefinitions {
SBearOrderPage sBearOrderPage=new SBearOrderPage();
    @When("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {
sBearOrderPage.Order.click();
    }



Select select;
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
   select =new Select(sBearOrderPage.product);
   select.selectByVisibleText(string);



    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
sBearOrderPage.quantity.sendKeys(Keys.BACK_SPACE+ string);

    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        sBearOrderPage.customerName.sendKeys(string);

    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        sBearOrderPage.street.sendKeys(string);

    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        sBearOrderPage.inputCity.sendKeys(string);

    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        sBearOrderPage.inputState.sendKeys(string);

    }
    @When("User enters {string} to zip")
    public void user_enters_to_zip(String string) {
        sBearOrderPage.inputZip.sendKeys(string);

    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
/*
        for (WebElement each : sBearOrderPage.CreditCards) {
            if(each.getText().equals(string)){
              BrowserUtils.waitForVisibility(each,10);
                each.click();
                System.out.println(each);
            }
             }

 */




sBearOrderPage.visaCard.click();

    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
BrowserUtils.waitForVisibility(sBearOrderPage.inputCardNumber,10);
        sBearOrderPage.inputCardNumber.sendKeys(string);


    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {

        sBearOrderPage.inputExpireDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        sBearOrderPage.processButton.click();

    }
    ListOfAllOrdersPage listOfAllOrdersPage=new ListOfAllOrdersPage();
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        listOfAllOrdersPage.viewAllOrders.click();

        Assert.assertEquals(listOfAllOrdersPage.actualName.getText(),string);

    }

}
