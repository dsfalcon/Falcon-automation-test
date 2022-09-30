package main.java.kite.pageEvents;

import main.java.kite.pageObjects.AddEnterprisePageElements;
import main.java.utils.RandomString;
import main.java.utils.XLUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Random;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

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
        String randomString = RandomString.getAlphaNumericString(5);
        String lowerString = randomString.toLowerCase();
        String path=System.getProperty("user.dir")+"/datafiles/"+"addEnterprise.xlsx";
        XLUtils.setCellData(path,"Sheet1",0,0,lowerString);


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

        /* *******************Tax Related Details******************** */

       // panNumber.sendKeys("GOUPV"+RandomString.generateNumber(4)+"G");

        /* *******************Contact Details******************** */

        contactPersonName.sendKeys("Rohit suri");
        contactPersonNumber.sendKeys("90"+RandomString.generateNumber());

        submitButton.click();
        Thread.sleep(3000);
        String BoxText = accessPopUp.getText();

        //String alertMessage= driver.switchTo().alert().getText(); // capture alert message

        logger.info(BoxText);
        Thread.sleep(3000);
        //confirmButton.click();
        Thread.sleep(7000);
    }
}
