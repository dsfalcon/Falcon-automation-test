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

    public void createAdmin(String cmpnyName) throws InterruptedException, IOException {
        /* **************** Create Admin Information****************/

       String firstName =  faker.address().firstName();
       String lastName = faker.address().lastName();
       String emailID =  RandomString.getAlphaNumericString(5)+"mailinator.com";
       String mobNumber = "98260"+RandomString.generateNumber(5);

        String path=System.getProperty("user.dir")+"/datafiles/"+"addEnterprise.xlsx";
        XLUtils.setCellData(path,"Sheet2",1,0,firstName);
        XLUtils.setCellData(path,"Sheet2",1,1,lastName);
        XLUtils.setCellData(path,"Sheet2",1,2,emailID);
        XLUtils.setCellData(path,"Sheet2",1,3,mobNumber);


        logger.info("Page Title is " + driver.getTitle());
        logger.info("Current Page URL "+ driver.getCurrentUrl());
        clickToSlctEP.click();
        Thread.sleep(3000);
        EnterEpName.sendKeys(cmpnyName);
        Thread.sleep(3000);
        slctEP.click();
        Thread.sleep(3000);
        programName.click();
        roleSuAdmin.click();
        fstName.sendKeys(firstName);
        lstName.sendKeys(lastName);
        email.sendKeys(emailID);
        moNumber.sendKeys(mobNumber);
    //    submitButton.click();

    }
}
