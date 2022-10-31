package main.java.dart.pageEvents;


import main.java.dart.pageObjects.LoginPageElements;
import main.java.utils.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.IReporter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class LoginPageEvents extends LoginPageElements implements IReporter {

    FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);

    // GetPage Title
    public void getTitleCompany() throws InterruptedException {
        logger.info("Page Title is " + driver.getTitle());
        Thread.sleep(2000);

    }

    WebDriver ldriver;

    public LoginPageEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


    public void loginMethod(String companyCode) throws InterruptedException {
        try {


//        Thread.sleep(3000);
        enterpriseId.sendKeys(companyCode);
        nxtButton.click();
        Thread.sleep(2000);
        String err1 = "Enterprise not authorised. ";
        String err2 = "Please enter your company code ";
        String err3 = "Company code must have 2 characters or more ";
        String err4 = "Sorry, this company code is invalid. Please try again! ";

        List<WebElement> isPresent = driver.findElements(By.xpath("/html/body/app-root/div/app-pre-auth/app-company/div/form/div[1]/div/div"));
        /*Need to check with link text*/
        boolean isvalid = isPresent.size() > 0;


        if (isvalid) {
            logger.info("isvalid " + isvalid);
            if (String.valueOf(loginPageErrorMsg.getText()).equalsIgnoreCase(err1)) {
                logger.info("Error Found: " + err1);
            } else if (String.valueOf(loginPageErrorMsg.getText()).equalsIgnoreCase(err2)) {
                logger.info("Error Found: " + err2);
            } else if (String.valueOf(loginPageErrorMsg.getText()).equalsIgnoreCase(err3)) {
                logger.info("Error Found: " + err3);
            } else if (String.valueOf(loginPageErrorMsg.getText()).equalsIgnoreCase(err4)) {
                logger.info("Error Found: " + err4);
            }
        } else {
            logger.info("isvalidElse " + isvalid);
            username.sendKeys(config.username());
            sendOTP.click();
            Thread.sleep(2000);
            enterOTP.sendKeys(config.otp());
            loginButton.click();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        }catch (Exception e){
            logger.info(""+e.getMessage());
        }
    }
}







