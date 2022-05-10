package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountSummaryPage extends BasePage{



    @FindBy(xpath = "(//a[.='Savings'])[1]")
    public WebElement savingsLink;

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement brokearageLink;

    @FindBy(xpath = "//a[.='Checking']")
    public WebElement checkingLink;

    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[.='Loan']")
    public WebElement loanLink;




}
