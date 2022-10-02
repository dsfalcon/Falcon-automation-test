package test.java.kite;

import main.java.kite.pageEvents.*;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FinCreteNewTransferTest extends BaseTest {

    @Test
    public void FinCreteNewTransferMethod() throws InterruptedException, IOException {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        FinLoginPageEvents finLoginPageEvents = new FinLoginPageEvents(driver);
        finLoginPageEvents.loginMethod();

        FinSideBarEvents finSideBarEvents = new FinSideBarEvents(driver);
        finSideBarEvents.goToNewTransfer();

        FinCreateNewTransferPageEvents finCreateNewTransferPageEvents = new FinCreateNewTransferPageEvents(driver);
        finCreateNewTransferPageEvents.newTransfer();

        //logger.addScreenCaptureFromPath("../screenshots/FinCreteNewTransferMethod.png");

        Thread.sleep(5000);
        /* ****************** Page Code ****************** */
    }
}
