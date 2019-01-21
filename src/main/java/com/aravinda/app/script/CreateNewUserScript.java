package com.aravinda.app.script;

import com.aravinda.app.page.CreateUserPage;
import com.aravinda.app.page.MainPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class CreateNewUserScript extends Script {
    @Page(page = {MainPage.class, CreateUserPage.class})
    public void script() {
        execute("MainPage", "clickCreate");
        execute("CreateUserPage", "fname", data.get("firstName"));
        execute("CreateUserPage", "lname", data.get("lastName"));
        execute("CreateUserPage", "date", data.get("date"));
        execute("CreateUserPage", "email", data.get("email"));
        execute("CreateUserPage", "clickAdd");
        Assert.assertEquals(get("MainPage", "result"), data.get("mainPageUserName"));
        Assert.assertEquals(get("MainPage", "findUser", data.get("newUserName")), data.get("newUserName"));
    }
}
