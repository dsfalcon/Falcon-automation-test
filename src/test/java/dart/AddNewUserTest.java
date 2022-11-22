package test.java.dart;

import main.java.dart.pageEvents.EndUserPageEvents;
import main.java.dart.pageEvents.LoginPageEvents;
import main.java.dart.pageEvents.SideBarEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddNewUserTest extends LoginTest {



    @Test(dataProvider = "endUserData")
    public void AddNewUserMethod(String fName, String lName, String mNumber, String email) throws InterruptedException, IOException {

        /*Add new user to portal */
        LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
        loginPageEvents.loginMethod();


        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToEndUser();
        logger.info("Clicked on SideBar");
        System.out.println("/* ****************** Clicked on SideBar ****************** */");
        logger.info(fName+lName+mNumber);
        System.out.println("First Name: "+fName+"--->"+"Last Name: "+lName+"--->"+"Mobile Number: "+mNumber);

        EndUserPageEvents endUserEvents = new EndUserPageEvents(driver);
        Thread.sleep(2000);
        endUserEvents.addNewUser(fName,lName,mNumber,email);
        System.out.println("First Name: "+fName+"--->"+"Last Name: "+lName+"--->"+"Mobile Number: "+mNumber+"Email: "+email);

        endUserEvents.btnSubmit();
        logger.addScreenCaptureFromPath("../screenshots/AddNewUserMethod.png");
        System.out.println(" /* ****************** LoginMethodDart DONE ****************** */ ");

    }



    @DataProvider(name="endUserData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"enduserdata1.xlsx";
       // logger.info(path);
        int rownum= XLUtils.getRowCount(path, "Sheet5");
        int colcount= XLUtils.getCellCount(path, "Sheet5", 1);

        String[][] logindata =new String[rownum][colcount];

        for(int i=1; i<=rownum; i++){
            for(int j=0;j<colcount;j++){
                logindata[i-1][j]= XLUtils.getCellData(path,"Sheet5",i,j);
            }
        }
        return logindata;
    }

}
