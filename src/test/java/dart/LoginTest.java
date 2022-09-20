package test.java.dart;

import main.java.dart.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;
import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    @Test()
    public void LoginMethodDart() throws InterruptedException, IOException {

        /* for Login User in Dart portal */
        try {
            LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
            logger.info(driver.getCurrentUrl());
            loginPageEvents.loginMethod();
            logger.addScreenCaptureFromPath("../screenshots/LoginMethodDart.png");
        }catch (Exception e){
            logger.info(""+e.getMessage());
        }



    }


}
