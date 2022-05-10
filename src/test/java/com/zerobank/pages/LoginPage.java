package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = "li #signin_button")
    public WebElement signinBtn;

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement signingInBtn;


    public void login(String username, String password) {

        signinBtn.click();
        BrowserUtils.waitFor(2);

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signingInBtn.click();
    }


}
