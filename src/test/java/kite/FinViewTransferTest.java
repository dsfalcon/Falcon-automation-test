package test.java.kite;

import main.java.kite.pageEvents.FinLoginPageEvents;
import main.java.kite.pageEvents.FinSideBarEvents;
import main.java.kite.pageEvents.FinViewTransferPageEvents;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;

public class FinViewTransferTest extends BaseTest {

    @Test
    public void FinViewTransferMethod() throws InterruptedException, IOException {
        FinLoginPageEvents finLoginPageEvents = new FinLoginPageEvents(driver);
        finLoginPageEvents.loginMethod();

        FinSideBarEvents finSideBarEvents = new FinSideBarEvents(driver);
        finSideBarEvents.goToViewTransfer();

        FinViewTransferPageEvents finViewTransferPageEvents = new FinViewTransferPageEvents(driver);
        finViewTransferPageEvents.approveTransfer();

        Thread.sleep(5000);
    }

}
