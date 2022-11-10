package test.java.dart;


import main.java.dart.pageEvents.SimulatorTransactionEvents;
import main.java.utils.XLUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;

public class SimulatorTransactionTest extends LoginTest {

    @Test(dataProvider = "cardData")
    public void SimulatorTransactionMethod(String cardIDs) throws InterruptedException {

        SimulatorTransactionEvents simulatorTransactionEvents = new SimulatorTransactionEvents(driver);
        simulatorTransactionEvents.OpenSimulator(cardIDs);

    }
    @DataProvider(name="cardData")
    Object[][] getData() throws IOException {
        String path=System.getProperty("user.dir")+"/datafiles/"+"cardData.xlsx";
        int rownum= XLUtils.getRowCount(path, "Sheet1");
        int colcount= XLUtils.getCellCount(path, "Sheet1", 1);

        String[][] logindata =new String[rownum][colcount];

        for(int i=1; i<=rownum; i++){ /* only for the 5 users else i<= rownum*/
            for(int j=0;j<colcount;j++){
                logindata[i-1][j]= XLUtils.getCellData(path,"Sheet1",i,j);
            }
        }
        return logindata;
    }
}
