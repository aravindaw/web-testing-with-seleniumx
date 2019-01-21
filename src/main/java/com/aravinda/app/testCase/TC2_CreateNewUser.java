package com.aravinda.app.testCase;

import com.aravinda.app.Preconditions.LoginPrecon;
import com.aravinda.app.script.CreateNewUserScript;
import org.seleniumx.annotations.DriverSettings;
import org.seleniumx.annotations.Precondition;
import org.seleniumx.annotations.Script;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

import java.sql.Date;

public class TC2_CreateNewUser extends TestCase {
    @DriverSettings(
            OS = Set.OS.MAC,
            WINDOW_SIZE = Set.WINDOW_SIZE.FULLSCREEN,
            BROWSER = Set.BROWSER.CHROME,
            BASE_URL = "https://cafetownsend-angular-rails.herokuapp.com/login",
            IMPLICIT_WAIT = 10000
    )
    @Precondition(precondition = LoginPrecon.class, data = {"Luke", "Skywalker", "Hello Luke"})
    @Script(script = CreateNewUserScript.class)
    public void testCase() {
        data.put("firstName", "Test");
        data.put("lastName", "user222");
        data.put("date", "2019-02-01");
        data.put("email", "testuser222@email.com");
        data.put("mainPageUserName", "Hello Luke");
        data.put("newUserName", "Test user222");
        testCase(data);
    }
}
