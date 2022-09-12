package main.java.dart.pageEvents;


import main.java.dart.pageObjects.LoginPageElements;
import main.java.utils.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.IReporter;
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
    public LoginPageEvents (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }


    public void loginMethod() throws InterruptedException {
        Thread.sleep(3000);
        enterpriseId.sendKeys(config.enterpriseId());
        nxtButton.click();
        Thread.sleep(3000);
        String err1 = "Enterprise not authorised. ";
        String err2 = "Please enter your company code ";



       /* if(loginPageErrorMsg.getText().contains(err1) || loginPageErrorMsg.getText().contains(err2)){
            logger.info("Error Found: Not Able to Login ");
        }*/
//      try{

//          String err =  loginPageErrorMsg.getText();
//          logger.info("loginPageErrorMsg ----------"+err);

//          Boolean isPresent = driver.findElements(By.xpath("/html/body/app-root/div/app-pre-auth/app-company/div/form/div[1]/div/div/p")).size() > 0;
//          Boolean isPresent = err.length() > 0;
          WebElement my_element = (WebElement) driver.findElements(By.xpath("/html/body/app-root/div/app-pre-auth/app-company/div/form/div[1]/div/div/p"));
          ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", my_element);


              if(String.valueOf(my_element).equalsIgnoreCase(err1)){
                  logger.info("Error Found:"+err1);
              }
              else if(String.valueOf(my_element).equalsIgnoreCase(err2)){
                  logger.info("Error Found:"+err2);
              }
          else
          {
              username.sendKeys(config.username());
              Thread.sleep(3000);

              sendOTP.click();
              Thread.sleep(3000);

              enterOTP.sendKeys(config.otp());
              Thread.sleep(3000);
              loginButton.click();
              driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          }
//      }
//      catch (Exception e){
//          System.out.println("***************************************");
//          System.out.println("loginPageErrorMsg ----------"+ e);
//          System.out.println("***************************************");
//         // logger.log(e);
//      }

    }
}







