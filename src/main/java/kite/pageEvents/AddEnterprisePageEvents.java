package main.java.kite.pageEvents;

import com.github.javafaker.Faker;
import main.java.kite.pageObjects.AddEnterprisePageElements;
import main.java.utils.RandomString;
import main.java.utils.XLUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Random;

import static test.java.BaseTest.*;

public class AddEnterprisePageEvents extends AddEnterprisePageElements {
    WebDriver ldriver;
    public AddEnterprisePageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public  void addEnterprise () throws InterruptedException, IOException {
        /* ****************Basic Information****************/

        logger.info("Page Title is " + driver.getTitle());
        /*
        * Randam string name gen
        * name get
        * set excel
        *
        * */
        String companyName = faker.address().firstName();
        String lowerString = companyName.toLowerCase();
        String path=System.getProperty("user.dir")+"/datafiles/"+"addEnterprise.xlsx";
        XLUtils.setCellData(path,"Sheet1",1,0,lowerString);


        companyCode.sendKeys(lowerString);
        enterpriseName.sendKeys(lowerString);
        displayName.sendKeys(lowerString);
        programPrepaidButton.click();
        planGprCardard.click();
        planGiftCard.click();
        nonJITButton.click();
        loadMoneyYesButton.click();
        impsPayOutYesButton.click();
        issuerButton.click();
        String authTokenEmailIDText = lowerString+"@mailinator.com";
        authTokenEmailID.sendKeys(authTokenEmailIDText);
        XLUtils.setCellData(path,"Sheet1",1,1,authTokenEmailIDText);

        /* *******************Tax Related Details******************** */

        String pan = "GORAV"+RandomString.generateNumber(4)+"G";
        panNumber.sendKeys(pan);
        XLUtils.setCellData(path,"Sheet1",1,2,pan);

        /* *******************Contact Details******************** */


        String name = faker.name().fullName();
        contactPersonName.sendKeys(name);
        XLUtils.setCellData(path,"Sheet1",1,3,name);

        String number = "9009"+RandomString.generateNumber(6);
        contactPersonNumber.sendKeys(number);
        XLUtils.setCellData(path,"Sheet1",1,4,number);

        submitButton.click();
        Thread.sleep(3000);
        String BoxText = accessPopUp.getText();

        //String alertMessage= driver.switchTo().alert().getText(); // capture alert message

        logger.info(BoxText);
        Thread.sleep(3000);
        confirmButton.click();
        Thread.sleep(7000);
    }
}
