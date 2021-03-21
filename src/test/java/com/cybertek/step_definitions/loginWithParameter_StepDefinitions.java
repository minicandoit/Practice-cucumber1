package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginWithParameter_StepDefinitions {
LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
   loginPage.getEnvironment();

    }

    @When("user login as a librarian")
    public void user_login_as_a_librarian() {
        loginPage.loginAsLibrarian();
    }

    @Then("user should see the dashboard in the url")
    public void user_should_see_the_dashboard_in_the_url() {
        loginPage.dashboardIsDisplayed("dashboard");
    }

    // Logging in as a librarian
    @When("user login as a student")
    public void user_login_as_a_student() {
        loginPage.loginAsStudent();
    }

    @Then("user should see the books in the url")
    public void user_should_see_the_books_in_the_url() {
        loginPage.booksIsDisplayed("books");
    }




    @Then("user should see the {string} in the url")
    public void userShouldSeeTheInTheUrl(String arg0) {

loginPage.booksIsDisplayed(arg0);


        }


    @Then("user should see the word{string} in the url")
    public void userShouldSeeTheWordInTheUrl(String arg0) {

        loginPage.dashboardIsDisplayed(arg0);

    }


}

