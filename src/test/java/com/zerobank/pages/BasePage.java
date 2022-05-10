package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage{


    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBankingMenu;

    @FindBy(id = "account_summary_link")
    public WebElement accountSummaryTab;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }




}


