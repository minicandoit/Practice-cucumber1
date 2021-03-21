package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsySearch_StepDefinitions {
    EtsySearchPage etsySearchPage=new EtsySearchPage();
    @Given("User is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {

       String url= ConfigurationReader.getProperty("EtsyUrl");
        Driver.getDriver().get(url);
    }




    @When("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }


    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String arg0) {

        etsySearchPage.searchBox.sendKeys(arg0+ Keys.ENTER);

    }

//  #  String actualTitle=Driver.getDriver().getTitle();
//        String expectedTitle=arg0+" | Etsy";
//
//        Assert.assertTrue(actualTitle.equals(expectedTitle));


    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String arg0) {
        String actual = Driver.getDriver().getTitle();
        System.out.println(actual);
        String expected = arg0+" | Etsy";
        System.out.println(expected);

        Assert.assertTrue(actual.equals(expected));

    }
}
