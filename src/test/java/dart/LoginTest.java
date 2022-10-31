package test.java.dart;

import main.java.dart.pageEvents.LoginPageEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;
import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "ram")
    public void LoginMethodDart(String CompanyCode) {

        /* for Login User in Dart portal */
        try {
            LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
            logger.info(driver.getCurrentUrl());
            loginPageEvents.loginMethod(CompanyCode);
            logger.addScreenCaptureFromPath("../screenshots/LoginMethodDart.png");
        }catch (Exception e){
            logger.info(""+e.getMessage());
        }



    }


    @DataProvider(name = "ram")
    Object[][] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/datafiles/" + "kiteDDT.xlsx";
        int rownum = XLUtils.getRowCount(path, "AddEnterprise");
        int colcount = XLUtils.getCellCount(path, "AddEnterprise", 1);

        String[][] logindata = new String[rownum][colcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {
                logindata[i - 1][j] = XLUtils.getCellData(path, "AddEnterprise", i, j);
            }
        }       // logger.info(String.valueOf(logindata));
        return logindata;
    }
}


