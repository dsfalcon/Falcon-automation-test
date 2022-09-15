package test.java.dart;

import main.java.dart.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test()
    public void LoginMethodDart() throws InterruptedException, IOException {

        /* for Login User in Dart portal */
        LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
        logger.info(driver.getCurrentUrl());
        loginPageEvents.loginMethod();
        logger.addScreenCaptureFromPath("../screenshots/LoginMethodDart.png");

    }

}
