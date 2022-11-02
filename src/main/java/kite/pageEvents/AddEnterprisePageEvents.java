package main.java.kite.pageEvents;

import com.github.javafaker.Faker;
import main.java.kite.pageObjects.AddEnterprisePageElements;
import main.java.utils.RandomString;
import main.java.utils.XLUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static test.java.BaseTest.*;

public class AddEnterprisePageEvents extends AddEnterprisePageElements {
    WebDriver ldriver;
    public AddEnterprisePageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public  void addEnterprise (String CompanyCode,
                                String EnterpriseName,
                                String DisplayName,
                                String Program,
                                String ExpensePlan,
                                String PrepaidPlan,
                                String FundingSource,
                                String AllowMoney,
                                String IMPSPayout,
                                String UPIPPI,
                                String Issuer,
                                String AuthTokenEmailID,
                                String PartnerKey,
                                String IssureCode,
                                String IssuerSecret,
                                String PSK,
                                String NatureOfBusiness,
                                String DateOfIncorporation,
                                String CompanyURL,
                                String TAN,
                                String PAN,
                                String GSTIN,
                                String ContactPersonName,
                                String ContactPersonPhoneNumber,
                                String AlternatePhoneNumber,
                                String Email_ID,
                                String Address_1,
                                String Address_2,
                                String City,
                                String State,
                                String ZipCode) throws InterruptedException, IOException {
        /* ****************Basic Information****************/

        logger.info("Page Title is " + driver.getTitle());
        /*
        * Randam string name gen
        * name get
        * set excel
        *
        * */
    /*    String companyName = faker.address().firstName();
        String lowerString = companyName.toLowerCase();
        String path=System.getProperty("user.dir")+"/datafiles/"+"addEnterprise.xlsx";
        XLUtils.setCellData(path,"Sheet1",1,0,lowerString);
*/

        companyCode.sendKeys(CompanyCode);
        enterpriseName.sendKeys(EnterpriseName);
        displayName.sendKeys(DisplayName);
        programPrepaidButton.click();
        planGprCardard.click();
        planGiftCard.click();
        nonJITButton.click();
        loadMoneyYesButton.click();
        impsPayOutYesButton.click();
        issuerButton.click();

        authTokenEmailID.sendKeys(Email_ID);
    //    XLUtils.setCellData(path,"Sheet1",1,1,authTokenEmailIDText);

        /* *******************Tax Related Details******************** */

       // String pan = "GORAV"+RandomString.generateNumber(4)+"G";
        panNumber.sendKeys(PAN);
      //  XLUtils.setCellData(path,"Sheet1",1,2,pan);

        /* *******************Contact Details******************** */


      //  String name = faker.name().fullName();
        contactPersonName.sendKeys(ContactPersonName);
      //  XLUtils.setCellData(path,"Sheet1",1,3,name);

       // String number = "9009"+RandomString.generateNumber(6);
        contactPersonNumber.sendKeys(ContactPersonPhoneNumber);
     //   XLUtils.setCellData(path,"Sheet1",1,4,number);
        clickOutSideToGetError.click();

        /*Now Check For error*/
        try {

           List<WebElement> errList = driver.findElements(By.className("errorMessage"));
            for(int i =0;i<errList.size();i++) {
                String elementText = errList.get(i).getText();
                System.out.println(elementText);
                logger.info(elementText);
            }
         //  logger.info("Error List ::: "+errList);

            submitButton.click();
            Thread.sleep(2000);
        }
        catch (Exception e){
            logger.info("Got Some Exception While Checking the errors on the Form::::: "+e.getMessage());
        }

        try {
            confirmButton.click();

           Thread.sleep(3000);
            /* To Allow the Creation of the company */
            String BoxText = accessPopUp.getText();
            String alertMessage= driver.switchTo().alert().getText(); // capture alert message
            logger.info(BoxText);
            Thread.sleep(3000);
        }
        catch (Exception e){
            logger.info("Got Some Exception for Enterprise Page ::::: "+e.getMessage());
        }


       // Thread.sleep(7000);
    }


    public void checkErr(WebElement err) {
        try {
          //  Thread.sleep(2000);
            String errMsg = err.getText();
            // logger.info(errMsg);
         //   Thread.sleep(2000);
            if (errMsg == null){

                logger.info("error Not Found");

                System.out.println("");
            }
            else {
                logger.info("TEst::" + (err.getText()));

               // logger.info("error" +errMsg);

               // logger.info("Error Found on page::::::::::::" + errMsg);
            }


        } catch (Exception e) {
           // logger.info("No Error Found on page for Transaction Amount:::::::::" + e.getMessage());

        }

    }

}
