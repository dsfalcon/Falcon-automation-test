package test.java.dart;

import main.java.dart.pageEvents.CompanyAccountStatementPageEvents;
import main.java.dart.pageEvents.LoginPageEvents;
import main.java.dart.pageEvents.SideBarEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class CompanyAccountStatementTest extends  LoginTest{

    @Test(dataProvider = "endUserData")
    public void CompanyAccountStatementPageMethod(String exDay, String exMonth, String exYear,String exDay2, String exMonth2, String exYear2) throws InterruptedException, IOException {

        /*Add new user to portal */
        LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
        loginPageEvents.loginMethod();

        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToCompanyAccountStatement();
        logger.info("Clicked on SideBar");
        logger.info(exDay+exMonth+exYear);

        CompanyAccountStatementPageEvents companyAccountStatementPageEvents = new CompanyAccountStatementPageEvents(driver);
        companyAccountStatementPageEvents.filterData();
        companyAccountStatementPageEvents.selectFromDate(exDay,exMonth,exYear);
        companyAccountStatementPageEvents.selectToDate(exDay2,exMonth2,exYear2);
        companyAccountStatementPageEvents.amount();
        companyAccountStatementPageEvents.transactionTypesFilter();
        companyAccountStatementPageEvents.btnSubmit();
        logger.addScreenCaptureFromPath("../screenshots/CompanyAccountStatementPageMethod.png");
    }


    @DataProvider(name="endUserData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"companyAccountStatement.xlsx";
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
