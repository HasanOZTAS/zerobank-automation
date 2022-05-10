package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.Homepage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountActNavStepDefs {


    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String expectedLink) {


        switch (expectedLink) {
            case "Savings":
                new AccountSummaryPage().savingsLink.click();
                BrowserUtils.waitFor(2);
                break;
            case "Brokerage":
                new AccountSummaryPage().brokearageLink.click();
                BrowserUtils.waitFor(2);
                break;
            case "Checking":
                new AccountSummaryPage().checkingLink.click();
                BrowserUtils.waitFor(2);
                break;
            case "Credit Card":
                new AccountSummaryPage().creditCardLink.click();
                BrowserUtils.waitFor(2);
                break;
            case "Loan":
                new AccountSummaryPage().loanLink.click();
                BrowserUtils.waitFor(2);
                break;
        }


    }

    @Then("the Account Activity page should be displayed")
    public void the_page_should_be_displayed() {


        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Activity", actualTitle);
        System.out.println(actualTitle);
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedSelection) {

        AccountActivityPage accountActivityPage = new AccountActivityPage();

        Select dropdownOptions = new Select(accountActivityPage.accountDropdown);
        String actualOption = dropdownOptions.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedSelection, actualOption);
        System.out.println(actualOption);

    }
}
