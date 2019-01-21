package com.aravinda.app.Preconditions;


import com.aravinda.app.page.LoginPage;
import com.aravinda.app.page.MainPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class LoginPrecon extends Script {
    @Page(page = {LoginPage.class, MainPage.class})
    public void script() {
        execute("LoginPage", "putUserName", preConData.get("data1"));
        execute("LoginPage", "putPassword", preConData.get("data2"));
        execute("LoginPage", "clickLogin");
        Assert.assertEquals(get("MainPage", "result"), preConData.get("data3"));
    }
}
