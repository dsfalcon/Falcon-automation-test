package test.java.kite;

import main.java.kite.pageEvents.SideBarEvents;
import main.java.kite.pageEvents.AddEnterprisePageEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddEnterpriseTest extends BaseTest {

    @Test(dataProvider = "palash")
    public void AddEnterpriseMethod(
                                    String CompanyCode,
                                    String EnterpriseName,
                                    String DisplayName,
                                    String Program,
                                    String ExpensePlan,
                                    String PrepaidPlan,
                                    String FundingSource,
                                    String AllowMoney,
                                    String IMPSPayout,
                                    String UPIPPI,
                                    String Issuer,
                                    String AuthTokenEmailID,
                                    String PartnerKey,
                                    String IssureCode,
                                    String IssuerSecret,
                                    String PSK,
                                    String NatureOfBusiness,
                                    String DateOfIncorporation,
                                    String CompanyURL,
                                    String TAN,
                                    String PAN,
                                    String GSTIN,
                                    String ContactPersonName,
                                    String ContactPersonPhoneNumber,
                                    String AlternatePhoneNumber,
                                    String Email_ID,
                                    String Address_1,
                                    String Address_2,
                                    String City,
                                    String State,
                                    String ZipCode

    ) throws InterruptedException, IOException {
        super.LoginMethod();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToAddEnterprise();

        AddEnterprisePageEvents addEnterpriseEvents = new AddEnterprisePageEvents(driver);
        addEnterpriseEvents.addEnterprise(
                CompanyCode,
                EnterpriseName,
                DisplayName,
                Program,
                ExpensePlan,
                PrepaidPlan,
                FundingSource,
                AllowMoney,
                IMPSPayout,
                UPIPPI,
                Issuer,
                AuthTokenEmailID,
                PartnerKey,
                IssureCode,
                IssuerSecret,
                PSK,
                NatureOfBusiness,
                DateOfIncorporation,
                CompanyURL,
                TAN,
                PAN,
                GSTIN,
                ContactPersonName,
                ContactPersonPhoneNumber,
                AlternatePhoneNumber,
                Email_ID,
                Address_1,
                Address_2,
                City,
                State,
                ZipCode);

      //  logger.addScreenCaptureFromPath("../screenshots/AddEnterpriseMethod.png");

        Thread.sleep(5000);
        /* ****************** Page Code ****************** */
    }


    @DataProvider(name = "palash")
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
