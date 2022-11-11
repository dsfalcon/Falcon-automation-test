package test.java.dart;

import main.java.dart.pageEvents.LoginPageEvents;
import main.java.utils.XLUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    @Test/*(dataProvider = "ram")*/
    public void LoginMethodDart() {

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


