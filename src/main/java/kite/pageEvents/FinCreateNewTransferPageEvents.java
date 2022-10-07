package main.java.kite.pageEvents;

import main.java.kite.pageObjects.CreateNewTransferPageElements;
import main.java.utils.RandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import static test.java.BaseTest.logger;

public class FinCreateNewTransferPageEvents extends CreateNewTransferPageElements {

    WebDriver ldriver;
    public FinCreateNewTransferPageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void newTransfer (String cmpnyName) throws InterruptedException {

        selectForCompany.click();
        searchCompany.sendKeys(cmpnyName);
        selectCompany.click();
        Thread.sleep(2000);
        SelectkitePrePaid.click();
        GPR.click();
        yesBank.click();
        enterPrisePoolAccount.click();
        String simpleformat = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        //String date = String.valueOf(simpleformat);
        transactionDate.sendKeys(simpleformat);
        String Amount = String.valueOf(RandomString.generateNumber(4));
        transactionAmount.sendKeys(Amount);
        //RandomString.getAlphaNumericString(16)
        UTRnumber.sendKeys(RandomString.getAlphaNumericString(16));
        MMTicketNumber.sendKeys("50000"+cmpnyName);
        initiatePayment.click();
        Thread.sleep(4000);
        try{
            String Msg = transactionMsg.getText();
            logger.info(Msg);
        }catch (Exception e){
            logger.info("Got some Exception: "+e);
        }



    }


}
