package com.aravinda.app.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumx.util.PageObject;

public class CreateUserPage extends PageObject {
    @FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[1]/input")
    private WebElement fname;

    @FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[2]/input")
    private WebElement lnmae;

    @FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[3]/input")
    private WebElement date;

    @FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[4]/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/div/div/div/form/fieldset/div/button[2]")
    private WebElement add;

    @FindBy(xpath = "/html/body/div/div/div/form/fieldset/div/button[1]")
    private WebElement update;


    public void fname(String firstName) {
        fname.sendKeys(firstName);
    }

    public void lname(String lastName) {
        lnmae.sendKeys(lastName);
    }

    public void date(String d) {
        date.sendKeys(d);
    }

    public void email(String em) {
        email.sendKeys(em);
    }

    public void clickAdd() {
        add.submit();
    }

    public void clickUpdate() {
        update.submit();
    }

    public WebElement getFname() {
        return fname;
    }

    public void setFname(WebElement fname) {
        this.fname = fname;
    }

    public WebElement getLnmae() {
        return lnmae;
    }

    public void setLnmae(WebElement lnmae) {
        this.lnmae = lnmae;
    }

    public WebElement getDate() {
        return date;
    }

    public void setDate(WebElement date) {
        this.date = date;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }
}