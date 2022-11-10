package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SimulatorTransactionElements {

    @FindBy(xpath = "/html/body/app-root/div/mat-tab-group/div/mat-tab-body[1]/div/pre-auth/div[1]/form/div[1]/input")
    @CacheLookup
    public WebElement cardID;

    @FindBy(xpath = "/html/body/app-root/div/mat-tab-group/div/mat-tab-body[1]/div/pre-auth/div[1]/form/div[2]/app-dropdown/div/button")
    @CacheLookup
    public WebElement merchantName;

    @FindBy(xpath = " /html/body/app-root/div/mat-tab-group/div/mat-tab-body[1]/div/pre-auth/div[1]/form/div[2]/app-dropdown/div/ul/li[13]")
    @CacheLookup
    public WebElement Safdarganj;


    @FindBy(xpath = "/html/body/app-root/div/mat-tab-group/div/mat-tab-body[1]/div/pre-auth/div[1]/form/div[3]/app-dropdown/div/button")
    @CacheLookup
    public WebElement paymentChannel;


    @FindBy(xpath = "/html/body/app-root/div/mat-tab-group/div/mat-tab-body[1]/div/pre-auth/div[1]/form/div[3]/app-dropdown/div/ul/li[4]")
    @CacheLookup
    public WebElement ECOM;


    @FindBy(xpath = "/html/body/app-root/div/mat-tab-group/div/mat-tab-body[1]/div/pre-auth/div[1]/form/div[4]/input")
    @CacheLookup
    public WebElement Amount;

    @FindBy(xpath = "/html/body/app-root/div/mat-tab-group/div/mat-tab-body[1]/div/pre-auth/div[1]/form/div[5]/button")
    @CacheLookup
    public WebElement submitButton;

}
