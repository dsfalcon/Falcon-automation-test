package test.java.kite;

import main.java.kite.pageEvents.FinLoginPageEvents;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;

public class FinLoginTest extends BaseTest {

    @Test()
    public void FinLoginMethodKite() throws InterruptedException {

        /* for Login User  */
        FinLoginPageEvents loginPageEvents = new FinLoginPageEvents(driver);
        logger.info(driver.getCurrentUrl());
        loginPageEvents.loginMethod();

    }
}
