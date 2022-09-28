package test.java.kite;

import main.java.kite.pageEvents.FinLoginPageEvents;
import main.java.kite.pageEvents.FinSideBarEvents;
import main.java.kite.pageEvents.ViewTransferPageEvents;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class FinViewTransferTest extends BaseTest {

    @Test
    public void FinViewTransferMethod() throws InterruptedException {
        FinLoginPageEvents finLoginPageEvents = new FinLoginPageEvents(driver);
        finLoginPageEvents.loginMethod();

        FinSideBarEvents finSideBarEvents = new FinSideBarEvents(driver);
        finSideBarEvents.goToViewTransfer();

        ViewTransferPageEvents viewTransferPageEvents = new ViewTransferPageEvents(driver);
        viewTransferPageEvents.approveTransfer();
        Thread.sleep(5000);
    }
}
