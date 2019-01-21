package com.aravinda.app.script;

import com.aravinda.app.page.CreateUserPage;
import com.aravinda.app.page.MainPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class DeleteUserScript extends Script {
    @Page(page = {MainPage.class, CreateUserPage.class})
    public void script() {
        execute("MainPage", "clickUserToEdit", data.get("userToDelete"));
        execute("MainPage", "clickDelete");
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(get("MainPage", "result"), data.get("mainPageUserName"));
    }
}
