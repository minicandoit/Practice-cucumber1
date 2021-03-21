package com.cybertek.step_definitions;

import com.cybertek.pages.SmartPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;

public class SmartBear_StepDefinitions {
SmartPage smartPage=new SmartPage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
       String url= ConfigurationReader.getProperty("smartUrl");
        Driver.getDriver().get(url);
smartPage.userInputBox.sendKeys("Tester");
        BrowserUtils.sleep(1);
smartPage.passwordInputBox.sendKeys("test");
        BrowserUtils.sleep(1);
smartPage.loginButton.click();
        BrowserUtils.sleep(3);
        smartPage.orderButton.click();
    }

/*
    @When("User fills out the form as followed from the table below: User selects “product” from product dropdown")
    public void userFillsOutTheFormAsFollowedFromTheTableBelowUserSelectsProductFromProductDropdown() {
        BrowserUtils.sleep(1);
       // Select select=new Select(smartPage.product);
       // select.selectByIndex(2);
    }


    @When("User enters “quantity” to quantity")
    public void user_enters_quantity_to_quantity() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enters “customer name” to costumer name")
    public void user_enters_customer_name_to_costumer_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enters “street” to street")
    public void user_enters_street_to_street() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enters “city” to city")
    public void user_enters_city_to_city() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enters “state” to state")
    public void user_enters_state_to_state() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enters “zip” to zip")
    public void user_enters_zip_to_zip() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User selects “cardType” as card type")
    public void user_selects_card_type_as_card_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enters “card number” to card number {int}.User enters “expiration date” to expiration date {int}.User clicks process button")
    public void user_enters_card_number_to_card_number_user_enters_expiration_date_to_expiration_date_user_clicks_process_button(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies “costumer name” is in the list")
    public void user_verifies_costumer_name_is_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Pass the following table in Scenario outline.")
    public void pass_the_following_table_in_scenario_outline() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


 */

}
