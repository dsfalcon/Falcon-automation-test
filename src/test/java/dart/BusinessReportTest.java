package test.java.dart;

import main.java.dart.pageEvents.BusinessReportPageEvents;
import main.java.dart.pageEvents.SideBarEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class BusinessReportTest extends LoginTest {


    @Test(dataProvider = "endUserData")
    public void BusinessReportPageMethod(
            String reportType,
            String exDay,
            String exMonth,
            String exYear,
            String exDay2,
            String exMonth2,
            String exYear2,
            String searchData,
            String reportFilter




    ) throws InterruptedException, IOException {
       super.LoginMethodDart();
        /*Add new user to portal */
        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToBusinessReport();
        logger.info("Clicked on SideBar");
        logger.info(reportType+searchData+reportFilter+exDay+exMonth+exYear+exDay2+exMonth2+exYear2);
        logger.info(reportType.getClass().getTypeName()+searchData.getClass()+reportFilter+exDay+exMonth+exYear+exDay2+exMonth2+exYear2);

        BusinessReportPageEvents businessReportPageEvents = new BusinessReportPageEvents(driver);
        businessReportPageEvents.selectReportType(reportType);
        businessReportPageEvents.selectFromDate(exDay, exMonth, exYear);
        businessReportPageEvents.selectToDate(exDay2, exMonth2, exYear2);
        businessReportPageEvents.btnSubmit();
        businessReportPageEvents.searchForData(searchData);

        logger.addScreenCaptureFromPath("../screenshots/BusinessReportPageMethod.png");
    }



    @DataProvider(name="endUserData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"businessReportData.xlsx";
        logger.info(path);
        int rownum= XLUtils.getRowCount(path, "Sheet2");
        int colcount= XLUtils.getCellCount(path, "Sheet2", 1);

        String[][] logindata =new String[rownum][colcount];

        for(int i=1; i<=rownum; i++){
            for(int j=0;j<colcount;j++){
                logindata[i-1][j]= XLUtils.getCellData(path,"Sheet2",i,j);
            }
        }
        logger.info(String.valueOf("Login Data value....."+logindata));
        return logindata;
    }


}
