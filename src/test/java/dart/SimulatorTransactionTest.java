package test.java.dart;

import main.java.dart.pageEvents.LoginPageEvents;
import main.java.dart.pageEvents.SimulatorTransactionEvents;
import main.java.utils.DatabaseConnection;
import org.testng.annotations.Test;


import java.io.IOException;

public class SimulatorTransactionTest extends LoginTest {

    @Test
    public void SimulatorTransactionMethod() throws InterruptedException, IOException {
        LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
        loginPageEvents.loginMethod();

        SimulatorTransactionEvents simulatorTransactionEvents = new SimulatorTransactionEvents(driver);
        simulatorTransactionEvents.dbQuery(DatabaseConnection.connectDB());
    }
}
