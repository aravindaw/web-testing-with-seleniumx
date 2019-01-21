package com.aravinda.app.script;

import com.aravinda.app.page.CreateUserPage;
import com.aravinda.app.page.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class EditUserScript extends Script {
    @Page(page = {MainPage.class, CreateUserPage.class})
    public void script() {
        CreateUserPage page = PageFactory.initElements(driver, CreateUserPage.class);
        execute("MainPage", "clickUserToEdit", data.get("userToEdit"));
        execute("MainPage", "clickEdit");
        page.getFname().clear();
        execute("CreateUserPage", "fname", data.get("firstName"));
        page.getLnmae().clear();
        execute("CreateUserPage", "lname", data.get("lastName"));
        page.getDate().clear();
        execute("CreateUserPage", "date", data.get("date"));
        page.getEmail().clear();
        execute("CreateUserPage", "email", data.get("email"));
        execute("CreateUserPage", "clickAdd");
        Assert.assertEquals(get("MainPage", "result"), data.get("mainPageUserName"));
        Assert.assertEquals(get("MainPage", "findUser", data.get("newUserName")), data.get("newUserName"));
    }
}
