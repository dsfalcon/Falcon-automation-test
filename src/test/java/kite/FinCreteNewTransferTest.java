package test.java.kite;

import main.java.kite.pageEvents.*;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FinCreteNewTransferTest extends BaseTest {

    @Test(dataProvider = "finData")
    public void FinCreteNewTransferMethod(String cmpnyName,String email, String pan, String contactP, String contactPNumbr) throws InterruptedException, IOException {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        FinLoginPageEvents finLoginPageEvents = new FinLoginPageEvents(driver);
        finLoginPageEvents.loginMethod();

        FinSideBarEvents finSideBarEvents = new FinSideBarEvents(driver);
        finSideBarEvents.goToNewTransfer();

        FinCreateNewTransferPageEvents finCreateNewTransferPageEvents = new FinCreateNewTransferPageEvents(driver);
        finCreateNewTransferPageEvents.newTransfer(cmpnyName);

 //       logger.addScreenCaptureFromPath("../screenshots/FinCreteNewTransferMethod.png");

        Thread.sleep(5000);
        /* ****************** Page Code ****************** */
    }




    @DataProvider(name="finData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"addEnterprise.xlsx";
//        logger.info(path);
        int rownum= XLUtils.getRowCount(path, "Sheet1");
        int colcount= XLUtils.getCellCount(path, "Sheet1", 1);

        String[][] logindata =new String[rownum][colcount];

        for(int i=1; i<=rownum; i++){
            for(int j=0;j<colcount;j++){
                logindata[i-1][j]= XLUtils.getCellData(path,"Sheet1",i,j);
            }
        }
    // logger.info(String.valueOf(logindata));

        return logindata;
    }
  
}
