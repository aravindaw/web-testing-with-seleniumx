package com.aravinda.app.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumx.util.PageObject;

public class MainPage extends PageObject {
    @FindBy(xpath = "//*[@id='greetings']")
    private WebElement result;

    @FindBy(xpath = "//*[@id='bAdd']")
    private WebElement create;

    @FindBy(xpath = "//*[@id='bEdit']")
    private WebElement edit;

    @FindBy(xpath = "//*[@id='bDelete']")
    private WebElement delete;

    @FindBy(xpath = "//*[@id='employee-list']/li[1]")
    private WebElement user;

    public String result() {
        return result.getText();
    }

    public void clickCreate() {
        create.click();
    }

    public void clickEdit() {
        edit.click();
    }

    public void clickDelete() {
        delete.click();
    }

    public void clickUser() {
        user.click();
    }

    public String getUser() {
        return user.getText();
    }

    public String findUser(String user) {
        return driver.findElement(By.xpath("//li[contains(text(),'" + user + "')]")).getText();
    }

    public void clickUserToEdit(String user) {
        driver.findElement(By.xpath("//li[contains(text(),'" + user + "')]")).click();
    }

//    public void clickUserToDelete(String user) {
//        driver.findElement(By.xpath("//li[contains(text(),'" + user + "')]")).click();
//    }
}
