package main.java.kite.pageEvents;

import main.java.kite.pageObjects.CreateAdminPageElements;
import main.java.utils.RandomString;
import main.java.utils.XLUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static test.java.BaseTest.*;

public class CreateAdminPageEvents extends CreateAdminPageElements {

    WebDriver ldriver;
    public CreateAdminPageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void createAdmin(String EnterpriseName) throws InterruptedException, IOException {
        /* **************** Create Admin Information****************/

       String firstName =  faker.address().firstName();
       String lastName = faker.address().lastName();
       String emailID =  RandomString.getAlphaNumericString(5)+"@mailinator.com";
       String mobNumber = "98260"+RandomString.generateNumber(5);
        /* ****************** Set Data in Excel***************************** */
        String path=System.getProperty("user.dir")+"/datafiles/"+"kiteDDT.xlsx";
        /* ****************** Set Data in Excel***************************** */
        try {
            XLUtils.setCellData(path,"CreateAdmin",1,3,firstName);
        }catch (Exception e){
            logger.info(e);
        }

        XLUtils.setCellData(path,"CreateAdmin",1,4,lastName);
        XLUtils.setCellData(path,"CreateAdmin",1,5,emailID);
        XLUtils.setCellData(path,"CreateAdmin",1,6,mobNumber);


        logger.info("Page Title is " + driver.getTitle());
        logger.info("Current Page URL "+ driver.getCurrentUrl());
        clickToSlctEP.click();
        Thread.sleep(3000);
        EnterEpName.sendKeys(EnterpriseName);
        Thread.sleep(3000);
        slctEP.click();
        Thread.sleep(3000);
        programName.click();
        Thread.sleep(1000);
        roleSuAdmin.click();
        fstName.sendKeys(firstName);
        lstName.sendKeys(lastName);
        email.sendKeys(emailID);
        moNumber.sendKeys(mobNumber);
        submitButton.click();
        Thread.sleep(5000);

    }
}
