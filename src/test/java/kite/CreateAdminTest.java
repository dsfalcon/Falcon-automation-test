package test.java.kite;

import main.java.kite.pageEvents.CreateAdminPageEvents;
import main.java.kite.pageEvents.SideBarEvents;

import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;

public class CreateAdminTest extends BaseTest {

    @Test
    public void CreateAdminMethod() throws IOException, InterruptedException {
        super.LoginMethod();
        Thread.sleep(5000);


        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToCreateAdmin();
        Thread.sleep(3000);
        logger.info("Testdwadhjwlsahdswjkhfrlkwsfhlkwshfklshfklsdflksdhfjlksdhfjsdhfkjdh");

        CreateAdminPageEvents createAdminEvents =new CreateAdminPageEvents(driver);
        createAdminEvents.createAdmin();
        logger.addScreenCaptureFromPath("../screenshots/CreateAdminMethod.png");
    }
}
