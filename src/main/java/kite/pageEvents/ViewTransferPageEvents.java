package main.java.kite.pageEvents;

import main.java.kite.pageObjects.ViewTransferElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static test.java.BaseTest.logger;

public class ViewTransferPageEvents extends ViewTransferElements {

    WebDriver ldriver;
    public ViewTransferPageEvents (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void approveTransfer() throws InterruptedException {
        seachCompany.click();
        Thread.sleep(2000);
        enterCompany.sendKeys("gouravqa10");
        selectYesBank.click();
        selectKitePrepaid.click();
        selectEnterprisePoolAccount.click();
        approveTransaction.click();
        String ftMsg = fundTransferMsg.getText();
        logger.info("Fund TransferMessage: "+ftMsg);
        Thread.sleep(3000);
        confirmButton.click();
        Thread.sleep(3000);
        try{
            String pageMsg = transMessage.getText();
            logger.info(pageMsg);

        }catch (Exception e){
            logger.info("Got some Exception: "+e);
        }



    }


}
