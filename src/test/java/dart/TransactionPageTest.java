package test.java.dart;

import main.java.dart.pageEvents.SideBarEvents;
import main.java.dart.pageEvents.TransactionPageEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TransactionPageTest extends LoginTest {

    @Test(dataProvider = "endUserData")
    public void TransactionPageMethod(String exDay, String exMonth, String exYear,String exDay2, String exMonth2, String exYear2) throws InterruptedException, IOException {
        super.LoginMethodDart();
        logger.info("TransactionPageMethod"+exDay+"--------"+exMonth+"--------"+exYear);
        logger.info("Date Data -------> "+exDay2+"--------"+exMonth2+"--------"+exYear2);
        logger.info("AfterTransactionPageMethod");

        /*Add new user to portal */
        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToTransaction();
        logger.info("Clicked on SideBar");
        logger.info(exDay+exMonth+exYear);

        TransactionPageEvents transactionPageEvents = new TransactionPageEvents(driver);
        transactionPageEvents.filterData();
        transactionPageEvents.selectFromDate(exDay,exMonth,exYear);
        transactionPageEvents.selectToDate(exDay2,exMonth2,exYear2);
        transactionPageEvents.amountFilter();
        transactionPageEvents.transactionTypesFilter();
        transactionPageEvents.transactionChannelFilter();
        transactionPageEvents.cardTypeFilter();
        transactionPageEvents.btnSubmit();
        logger.addScreenCaptureFromPath("../screenshots/TransactionPageMethod.png");
    }


    @DataProvider(name="endUserData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"enduserdata1.xlsx";
        logger.info(path);
        int rownum= XLUtils.getRowCount(path, "Sheet3");
        int colcount= XLUtils.getCellCount(path, "Sheet3", 1);

        String[][] logindata =new String[rownum][colcount];

        for(int i=1; i<=rownum; i++){
            for(int j=0;j<colcount;j++){
                logindata[i-1][j]= XLUtils.getCellData(path,"Sheet3",i,j);
            }
        }
        logger.info(String.valueOf(logindata));
        return logindata;
    }

}



