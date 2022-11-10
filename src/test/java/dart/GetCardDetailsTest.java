package test.java.dart;

import main.java.dart.pageEvents.GetCardDetailsEvents;
import main.java.dart.pageEvents.SimulatorTransactionEvents;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;


public class GetCardDetailsTest extends BaseTest {

   @Test
    public void GetCardDetailsTestMethod () throws InterruptedException, IOException {
        GetCardDetailsEvents getCardDetailsEvents = new GetCardDetailsEvents(driver);
        getCardDetailsEvents.GetCardData();

    }
}
