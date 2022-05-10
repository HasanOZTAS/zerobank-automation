package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.Homepage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }


    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {

        String expectedTitle = Driver.get().getTitle();

        Assert.assertEquals("Zero - Account Summary", expectedTitle);


    }

}
