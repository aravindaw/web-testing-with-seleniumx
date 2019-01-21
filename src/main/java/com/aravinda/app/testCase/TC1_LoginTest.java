package com.aravinda.app.testCase;

import com.aravinda.app.script.LoginTestScript;
import org.seleniumx.annotations.DriverSettings;
import org.seleniumx.annotations.Script;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC1_LoginTest extends TestCase {
    @DriverSettings(
            OS = Set.OS.MAC,
            WINDOW_SIZE = Set.WINDOW_SIZE.FULLSCREEN,
            BROWSER = Set.BROWSER.CHROME,
            BASE_URL = "https://cafetownsend-angular-rails.herokuapp.com/login",
            IMPLICIT_WAIT = 10000
    )
    @Script(script = LoginTestScript.class)
    public void testCase() {
        data.put("user", "Luke");
        data.put("password", "Skywalker");
        data.put("mainPageUserName", "Hello Luke");
        testCase(data);
    }
}

