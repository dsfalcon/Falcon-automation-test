package main.java.kite.pageEvents;

import main.java.kite.pageObjects.CreateAdminPageElements;
import main.java.utils.RandomString;
import main.java.utils.XLUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import static test.java.BaseTest.*;

public class CreateAdminPageEvents extends CreateAdminPageElements {

    static Properties prop = new Properties();
    WebDriver ldriver;
    public CreateAdminPageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void createAdmin(String EnterpriseName, String MobileNumber) throws InterruptedException, IOException {
        /* **************** Create Admin Information****************/

       String firstName =  faker.address().firstName();
       String lastName = faker.address().lastName();
       String emailID =  RandomString.getAlphaNumericString(5)+"@mailinator.com";
       String mobNumber = "98260"+RandomString.generateNumber(5);
        /* ****************** Set Data in Excel***************************** */
          String path=System.getProperty("user.dir")+"/datafiles/"+"kiteDDT.xlsx";
        /* ****************** Set Data in Excel***************************** */

       // String configPath = System.getProperty("user.dir") + "/resources/" + "Newconf.properties";
        String configPath = System.getProperty("user.dir") + "/resources/" + "FrameworkConfig.properties";
        try {
            XLUtils.setCellData(path,"DartLogin",1,1,mobNumber);
            OutputStream output = new FileOutputStream(configPath);
            prop.setProperty("environment","qa");
            prop.setProperty("qa.email","superadmin@kite.work");
            prop.setProperty("qa.pass","Kite@135#");
            prop.setProperty("qa.kite","http://admin.kiteqa.com/");
            prop.setProperty("qa.finemail","finadmin1@yopmail.com");
            prop.setProperty("qa.finpass","Kite@135#");
            prop.setProperty("qa.simulator","https://simulator.qa.kitetest.me/");
           // prop.setProperty("*********************Sepretor","********************************");
            prop.setProperty("qa.dart","http://prepaid.kiteqa.com/");
            prop.setProperty("qa.enterpriseId",EnterpriseName+"11");;
            prop.setProperty("qa.username",mobNumber);
            prop.setProperty("otp","111111");
            prop.store(output,null);


        }catch (Exception e){
            logger.info(e);
        }
       /* XLUtils.setCellData(path,"CreateAdmin",1,4,lastName);
        XLUtils.setCellData(path,"CreateAdmin",1,5,emailID);*/


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
        System.out.println(mobNumber);
        Thread.sleep(3000);
        submitButton.click();
        Thread.sleep(5000);

    }
    public  static  void writeProperties() throws IOException {
        String configPath = System.getProperty("user.dir") + "/resources/" + "Newconf.properties";
        try {
            OutputStream output = new FileOutputStream(configPath);
            prop.setProperty("qa.enterpriseId","EnterpriseName+'11'");
            prop.setProperty("qa.username","mobNumber");
            prop.setProperty("test","test");
            prop.setProperty("test","1232323");
            prop.store(output, null);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}