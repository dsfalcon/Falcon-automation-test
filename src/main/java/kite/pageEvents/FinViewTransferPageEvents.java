package main.java.kite.pageEvents;

import main.java.kite.pageObjects.ViewTransferElements;
import main.java.utils.XLUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static test.java.BaseTest.logger;

public class FinViewTransferPageEvents extends ViewTransferElements {

    WebDriver ldriver;
    public FinViewTransferPageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void approveTransfer() throws InterruptedException, IOException {
        Thread.sleep(2000);
        seachCompany.click();
        Thread.sleep(4000);
        String path=System.getProperty("user.dir")+"/datafiles/"+"test.xlsx";
        XLUtils.setCellData(path,"Sheet1",1,2,"TestDat in file");
        enterCompany.sendKeys("gouravqa10");
        selectCompany.click();
        Thread.sleep(2000);
        selectYesBank.click();
        selectKitePrepaid.click();
        selectEnterprisePoolAccount.click();
        approveTransaction.click();
        String ftMsg = fundTransferMsg.getText();
        logger.info("Fund TransferMessage: "+ftMsg);
        Thread.sleep(3000);
       // confirmButton.click();
        Thread.sleep(3000);
        try{
            String pageMsg = transMessage.getText();
            logger.info(pageMsg);

        }catch (Exception e){
            logger.info("Got some Exception: "+e);
        }

    }


}
