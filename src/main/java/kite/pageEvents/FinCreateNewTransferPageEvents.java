package main.java.kite.pageEvents;

import main.java.kite.pageObjects.CreateNewTransferPageElements;
import main.java.utils.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class FinCreateNewTransferPageEvents extends CreateNewTransferPageElements {

    WebDriver ldriver;

    public FinCreateNewTransferPageEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void newTransfer(String EnterpriseName, String Program, String FinancialProduct
            , String BankName
            , String AccountType
            , String TransactionDate
            , String Amount
            , String mUTRNumber
            , String mMMTicketNumber) throws InterruptedException {

        selectForCompany.click();
        searchCompany.sendKeys(EnterpriseName);
        selectCompany.click();
        Thread.sleep(2000);
        SelectkitePrePaid.click();
        GPR.click();
        yesBank.click();
        enterPrisePoolAccount.click();
        String simpleformat = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        System.out.println("Transaction Date for create New :-----> "+ simpleformat);
       // transactionDate.sendKeys(simpleformat);
        String mAmount = String.valueOf(RandomString.generateNumber(4));
        transactionAmount.sendKeys(mAmount);
        UTRnumber.sendKeys(RandomString.getAlphaNumericString(16));
         MMTicketNumber.sendKeys("50000"+EnterpriseName);


        initiatePayment.click();
        Thread.sleep(4000);
        /* ****************************** Check for error messages ****************************** */

        try {
            checkErr(TRerrorMsg);
            checkErr(AmounterrorMsg);
            checkErr(UTRerrorMsg);
            checkErr(MMerrorMsg);
            String Msg = transactionMsg.getText();
            logger.info(Msg);
        } catch (Exception e) {
            logger.info("Got some Exception: " + e.getMessage());
        }

    }

    public void checkErr(WebElement err) {
        try {
            Thread.sleep(2000);
            String errMsg = err.getText();
           // logger.info(errMsg);
            Thread.sleep(2000);
            if (errMsg == null){
                System.out.println("");
            }
            else {
                logger.info("Error Found on page::::::::::::" + errMsg);
            }

        } catch (Exception e) {
            logger.info("No Error Found on page for Transaction Amount:::::::::" + e.getMessage());

        }

    }


}
