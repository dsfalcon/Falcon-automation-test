package test.java.dart;

import main.java.dart.pageEvents.AddGiftCardEvents;
import main.java.dart.pageEvents.LoginPageEvents;
import main.java.dart.pageEvents.SideBarEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;

public class AddNewGiftCardTest extends BaseTest {

    @Test(dataProvider = "endUserData")
    public void AddNewGiftCardMethod(String FirstName, String LastName, String mNumber, String email) throws InterruptedException {
        /*Add new user to portal */
        LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
        loginPageEvents.loginMethod();

        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToEndUser();



        AddGiftCardEvents addGiftCardEvents = new AddGiftCardEvents(driver);
        addGiftCardEvents.selectUserToAddCard(FirstName);

    }

    @DataProvider(name="endUserData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"enduserdata1.xlsx";
        int rownum= XLUtils.getRowCount(path, "Sheet5");
        int colcount= XLUtils.getCellCount(path, "Sheet5", 1);

        String[][] logindata =new String[rownum][colcount];

        for(int i=1; i<=rownum; i++){ /* only for the 5 users else i<= rownum*/
            for(int j=0;j<colcount;j++){
                logindata[i-1][j]= XLUtils.getCellData(path,"Sheet5",i,j);
            }
        }
        return logindata;
    }
}
