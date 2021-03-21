package com.cybertek.step_definitions;

import com.cybertek.pages.WikiPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiSearch_StepDefinitions {
WikiPage wikiPage=new WikiPage();
    @When("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
       String url= ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }




    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
wikiPage.searchBox.sendKeys("Steve Jobs"+ Keys.ENTER);

    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
String expectedTitle="Steve Jobs - Wikipedia";
        System.out.println(expectedTitle);
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {
        String actualMainHeader=wikiPage.mainHeader.getText();
        String expectedMainHeader="Steve Jobs";
        Assert.assertTrue(actualMainHeader.equals(expectedMainHeader));
    }

    @And("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikiPage.searchBox.sendKeys(arg0+ Keys.ENTER);
        
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {

        String actualMainHeader=wikiPage.mainHeader.getText();
        String expectedMainHeader=arg0;
        Assert.assertTrue(actualMainHeader.equals(expectedMainHeader));
    }


    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle=arg0+" - Wikipedia";
        System.out.println(expectedTitle);
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }

    @Then("User sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        String actual=wikiPage.imageHeader.getText();
        String expected="Steve Jobs";
        Assert.assertTrue(actual.equals(expected));
    }
}
