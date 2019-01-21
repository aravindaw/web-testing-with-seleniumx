package com.aravinda.app.script;

import com.aravinda.app.page.LoginPage;
import com.aravinda.app.page.MainPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class LoginTestScript extends Script {
    @Page(page = {LoginPage.class, MainPage.class})
    public void script() {
        execute("LoginPage", "putUserName", data.get("user"));
        execute("LoginPage", "putPassword", data.get("password"));
        execute("LoginPage", "clickLogin");
        Assert.assertEquals(get("MainPage", "result"), data.get("mainPageUserName"));
    }
}
