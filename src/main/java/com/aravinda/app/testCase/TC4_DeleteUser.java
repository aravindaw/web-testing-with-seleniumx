package com.aravinda.app.testCase;

import com.aravinda.app.Preconditions.LoginPrecon;
import com.aravinda.app.script.DeleteUserScript;
import com.aravinda.app.script.EditUserScript;
import org.seleniumx.annotations.DriverSettings;
import org.seleniumx.annotations.Precondition;
import org.seleniumx.annotations.Script;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC4_DeleteUser extends TestCase {
    @DriverSettings(
            OS = Set.OS.MAC,
            WINDOW_SIZE = Set.WINDOW_SIZE.FULLSCREEN,
            BROWSER = Set.BROWSER.CHROME,
            BASE_URL = "https://cafetownsend-angular-rails.herokuapp.com/login",
            IMPLICIT_WAIT = 10000
    )
    @Precondition(precondition = LoginPrecon.class, data = {"Luke", "Skywalker", "Hello Luke"})
    @Script(script = DeleteUserScript.class)
    public void testCase() {
        data.put("userToDelete","Test user222");
        data.put("mainPageUserName", "Hello Luke");
        testCase(data);
    }
}
