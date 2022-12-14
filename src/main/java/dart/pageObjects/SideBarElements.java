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

}
