package test.java.kite;

import main.java.kite.pageEvents.CreateAdminPageEvents;
import main.java.kite.pageEvents.SideBarEvents;

import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;

public class CreateAdminTest extends BaseTest {

    @Test(dataProvider = "enterpriseData")
    public void CreateAdminMethod(String cmpnyName,String email, String pan, String contactP, String contactPNumbr) throws IOException, InterruptedException {
        super.LoginMethod();
        Thread.sleep(5000);


        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToCreateAdmin();
        Thread.sleep(3000);

        CreateAdminPageEvents createAdminEvents =new CreateAdminPageEvents(driver);
        createAdminEvents.createAdmin(cmpnyName);
        logger.addScreenCaptureFromPath("../screenshots/CreateAdminMethod.png");
    }


    @DataProvider(name="enterpriseData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"addEnterprise.xlsx";
        logger.info(path);
        int rownum= XLUtils.getRowCount(path, "Sheet1");
        int colcount= XLUtils.getCellCount(path, "Sheet1", 1);

        String[][] epdata =new String[rownum][colcount];

        for(int i=1; i<=rownum; i++){
            for(int j=0;j<colcount;j++){
                epdata[i-1][j]= XLUtils.getCellData(path,"Sheet1",i,j);
            }
        }
        logger.info(String.valueOf(epdata));
        return epdata;
    }

}
