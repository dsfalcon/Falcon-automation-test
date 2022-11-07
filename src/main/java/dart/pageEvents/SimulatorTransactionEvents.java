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

    public void OpenSimulator(String cardIDs) throws InterruptedException {
        driver.get("http://simulator.qa.kitetest.me/");
        Thread.sleep(1000);
        cardID.sendKeys(cardIDs);
        merchantName.click();
        Safdarganj.click();
        paymentChannel.click();
        ECOM.click();
        Amount.sendKeys("101");
        submitButton.click();
        Thread.sleep(4000);

    }

}