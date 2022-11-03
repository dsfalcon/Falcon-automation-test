package main.java.kite.pageEvents;


import main.java.kite.pageObjects.LoginPageElements;
import main.java.utils.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.IReporter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;


public class LoginPageEvents extends LoginPageElements implements IReporter {
    static Properties prop = new Properties();
    FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);

    // GetPage Title
    public void getTitleCompany() throws InterruptedException {
        logger.info("Page Events Se " + driver.getTitle());
        Thread.sleep(2000);
    }

    WebDriver ldriver;
    public LoginPageEvents (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void loginMethod () throws InterruptedException, IOException {
        try{
            String configPath = System.getProperty("user.dir") + "/resources/" + "FrameworkConfig.properties";
            InputStream input = new FileInputStream(configPath);
            prop.load(input);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        username.sendKeys(prop.getProperty("qa.email"));
        password.sendKeys(prop.getProperty("qa.pass"));
        Thread.sleep(3000);
        loginButton.click();
       Thread.sleep(2000);
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        try {
            checkErr(errMsgOnPage);
            String Msg = errMsgOnPage.getText();
            logger.info(Msg);
        } catch (Exception e) {
            logger.info("Got some Exception Because of No error driver was not able to find the element :: " + e.getMessage());
        }
    }

    public void checkErr(WebElement err) {
        try {
            Thread.sleep(2000);
            String errMsg = err.getText();
            // logger.info(errMsg);
           Thread.sleep(2000);
            if (errMsg == null){
                System.out.println("");
            }
            else {
                logger.info("Error Found on page :::::::::::: " + errMsg);
            }
        } catch (Exception e) {
            logger.info("Exception Found on page ::::::::: " + e.getMessage());
        }
    }
}







