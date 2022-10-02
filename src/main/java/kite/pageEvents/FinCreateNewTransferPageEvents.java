package main.java.kite.pageEvents;

import main.java.kite.pageObjects.CreateNewTransferPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static test.java.BaseTest.logger;

public class FinCreateNewTransferPageEvents extends CreateNewTransferPageElements {

    WebDriver ldriver;
    public FinCreateNewTransferPageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void newTransfer () throws InterruptedException {

        selectForCompany.click();
        searchCompany.sendKeys("gouravqa10");
        selectCompany.click();
        Thread.sleep(2000);
        SelectkitePrePaid.click();
        GPR.click();
        yesBank.click();
        enterPrisePoolAccount.click();
        transactionDate.sendKeys();
        transactionAmount.sendKeys("50");
        UTRnumber.sendKeys("50000Gourav99999");
        MMTicketNumber.sendKeys("50000Goura");
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
