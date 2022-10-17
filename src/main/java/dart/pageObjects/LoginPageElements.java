package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class LoginPageElements {
    /* *****************STEP-1************************* */

    /*Company Code*/
    @FindBy(id="enterpriseId")
    @CacheLookup
    public
    WebElement enterpriseId;

    /*Next Button*/
    @FindBy(xpath="/html/body/app-root/div/app-pre-auth/app-company/div/form/div[2]/button")
    @CacheLookup
    public
    WebElement nxtButton;
    /* *************************** Error Message ****************************** */
    @FindBy(xpath = "/html/body/app-root/div/app-pre-auth/app-company/div/form/div[1]/div/div")

    @CacheLookup
    public WebElement loginPageErrorMsg;



    /* *****************STEP-2************************* */

    /*Mobile Number/UserID*/
    @FindBy(id="username")
    @CacheLookup
    public
    WebElement username;

    @FindBy(xpath = "/html/body/app-root/div/app-pre-auth/app-login/div[2]/form/div[1]/div[1]/div[1]/p[2]/a")
    @CacheLookup
    public
    WebElement sendOTP;


    /*Mobile Number/UserID*/
    @FindBy(id="otp")
    @CacheLookup
    public
    WebElement enterOTP;


    /*Login Button*/
    @FindBy(xpath="/html/body/app-root/div/app-pre-auth/app-login/div[2]/form/div[2]/div[1]/button")
    @CacheLookup
    public
    WebElement loginButton;


}
