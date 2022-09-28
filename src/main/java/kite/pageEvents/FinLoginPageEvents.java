package main.java.kite.pageEvents;

import main.java.kite.pageObjects.LoginPageElements;
import main.java.utils.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.IReporter;

import java.util.concurrent.TimeUnit;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class FinLoginPageEvents extends LoginPageElements implements IReporter {

    FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);

    // GetPage Title
    public void getTitleCompany() throws InterruptedException {
        logger.info("Page Events Se " + driver.getTitle());
        Thread.sleep(2000);

    }

    WebDriver ldriver;
    public FinLoginPageEvents (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    public void loginMethod () throws InterruptedException {

        username.sendKeys(config.finemail());
        password.sendKeys(config.finpass());
        Thread.sleep(3000);
        loginButton.click();
        Thread.sleep(7000);
        //errMsgOnPage.getText();
        String errMsg = " Your email or password is incorrect. Please try again!";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


}
