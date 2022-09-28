package test.java.kite;

import main.java.kite.pageEvents.SideBarEvents;
import main.java.kite.pageEvents.AddEnterprisePageEvents;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddEnterpriseTest extends BaseTest {

    @Test
    public void AddEnterpriseMethod() throws InterruptedException, IOException {
        super.LoginMethod();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToAddEnterprise();

        AddEnterprisePageEvents addEnterpriseEvents = new AddEnterprisePageEvents(driver);
        addEnterpriseEvents.addEnterprise();

        logger.addScreenCaptureFromPath("../screenshots/AddEnterpriseMethod.png");

        Thread.sleep(5000);
        /* ****************** Page Code ****************** */
    }
}
