package com.aravinda.app.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumx.util.PageObject;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//*[@id='login-form']/fieldset/label[1]/input")
    private WebElement userName;

    @FindBy(xpath = "//*[@id='login-form']/fieldset/label[2]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login-form']/fieldset/button")
    private WebElement login;


    public void putUserName(String user) {
        userName.sendKeys(user);
    }

    public void putPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLogin() {
        login.submit();
    }
}
