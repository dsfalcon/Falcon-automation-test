package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddGiftCardElements {
    /*
    * search
    * selectCheckbox
    * clickOnAddGiftCardButton
    * selectSingleCard
    * selectVirtualCard
    * enterBinNUmber
    * enterAmount
    * clickOnSubmitButton
    * */

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-users/div/end-user-header/div/div[1]/input")
    @CacheLookup
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-users/div/app-user-details/div[1]/div/perfect-scrollbar/div/div[1]/table/tbody/tr/td[1]/tr/mat-checkbox/label/div")
    @CacheLookup
    public WebElement selectCheckbox;

     @FindBy(xpath = "/html/body/app-root/app-post-auth/app-users/div/end-user-header/div/div[4]/div[2]/tr/td[1]/button")
    @CacheLookup
    public WebElement clickOnAddGiftCardButton;

     @FindBy(xpath = "/html/body/app-root/app-post-auth/app-users/div/end-user-header/div/div[4]/div[2]/tr/td[1]/button/div/div/ul/li[1]")
    @CacheLookup
    public WebElement selectSingleCard;

     @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-card/div/div/div[3]/mat-radio-group/mat-radio-button[2]")
    @CacheLookup
    public WebElement selectVirtualCard;

     @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-card/div/div/div[3]/form/div[1]/input")
    @CacheLookup
    public WebElement enterBinNUmber;

     @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-card/div/div/div[3]/form/div[2]/input")
    @CacheLookup
    public WebElement enterAmount;

     @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-card/div/div/div[3]/form/div[3]/button")
    @CacheLookup
    public WebElement clickOnSubmitButton;


}
