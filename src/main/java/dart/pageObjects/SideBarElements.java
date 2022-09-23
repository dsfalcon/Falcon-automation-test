package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SideBarElements {

    /*Program*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-post-auth-menu/div/div[2]/div[2]/app-menu-item/div/div/span/a")
    @CacheLookup
    public WebElement program;

    /*Users*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-post-auth-menu/div/div[2]/div[6]/app-menu-item/div/div")
    @CacheLookup
    public WebElement users;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-post-auth-menu/div/div[2]/div[6]/app-menu-item/div/div/span/span[3]/app-sub-menu-item[1]/div")
    @CacheLookup
    public WebElement endUser;

    /*Real Time Data*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-post-auth-menu/div/div[2]/div[5]/app-menu-item/div/div/span/span[1]")
    @CacheLookup
    public WebElement realTimeData;

     /*Transaction*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-post-auth-menu/div/div[2]/div[5]/app-menu-item/div/div/span/span[3]/app-sub-menu-item[1]/div/a")
    @CacheLookup
    public WebElement transaction;

      /*Company Account Statement*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-post-auth-menu/div/div[2]/div[5]/app-menu-item/div/div/span/span[3]/app-sub-menu-item[2]/div/a")
    @CacheLookup
    public WebElement companyAccountStatement;


    /*Business Report*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-post-auth-menu/div/div[2]/div[4]/app-menu-item/div/div/span/a")
    @CacheLookup
    public WebElement businessReport;






}
