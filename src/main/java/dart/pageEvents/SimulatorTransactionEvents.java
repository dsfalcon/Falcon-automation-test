package main.java.dart.pageEvents;

import main.java.dart.pageObjects.SimulatorTransactionElements;
import main.java.utils.DatabaseConnection;
import main.java.utils.XLUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static test.java.BaseTest.driver;

public class SimulatorTransactionEvents extends SimulatorTransactionElements {

    WebDriver ldriver;

    public SimulatorTransactionEvents(WebDriver rdriver) throws InterruptedException {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    public void OpenSimulator(String cardIDs) throws IOException, InterruptedException {
        driver.get("http://simulator.qa.kitetest.me/");
        dbQuery(DatabaseConnection.connectDB());
        Thread.sleep(1000);
        cardID.sendKeys(cardIDs);
        merchantName.click();
        Safdarganj.click();
        paymentChannel.click();
        ECOM.click();
        Amount.sendKeys("101");
        submitButton.click();
        Thread.sleep(2000);

    }

    public void dbQuery(Connection con) throws IOException {

        Statement smt = null;
        String path=System.getProperty("user.dir")+"/datafiles/"+"cardData.xlsx";
        try {
            smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * from kite_card.card where enterprise_id='lalitgift15' and card_status='ACTIVE' and online_channel_status='ENABLED' and pos_channel_status='ENABLED'");
            // ResultSet rs = smt.executeQuery(dbQuery);


            int count = 0;
            while (rs.next()) {
                count++;
                System.out.println("Count of row "+count);
                System.out.print(rs.getString(1));
                XLUtils.setCellData(path,"Sheet1",count,0, rs.getString(1));
                System.out.println();



                //* ****************** Set Data in Excel***************************** *//
            }
//

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }


}
