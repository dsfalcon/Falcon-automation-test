package main.java.kite.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddEnterprisePageElements {

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[2]/td[3]/input")
    @CacheLookup
    public WebElement companyCode;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[3]/td[3]/input")
    @CacheLookup
    public WebElement enterpriseName;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[4]/td[3]/input")
    @CacheLookup
    public WebElement displayName;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[5]/td[3]/app-multi-select/div/button[2]")
    @CacheLookup
    public WebElement programPrepaidButton;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[7]/td[3]/table/tbody/tr/td/app-multi-select/div/button[1]")
    @CacheLookup
    public WebElement planGprCardard;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[7]/td[3]/table/tbody/tr/td/app-multi-select/div/button[2]")
    @CacheLookup
    public WebElement planGiftCard;


    @FindBy(id = "NON_JIT")
    @CacheLookup
    public WebElement nonJITButton;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[9]/td[3]/app-select/div/button[1]")
    @CacheLookup
    public WebElement loadMoneyYesButton;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[10]/td[3]/app-select/div/button[1]")
    @CacheLookup
    public WebElement impsPayOutYesButton;

    @FindBy(id = "YES_BANK")
    @CacheLookup
    public WebElement issuerButton;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[12]/td[3]/input")
    @CacheLookup
    public WebElement authTokenEmailID;

    /* ********************************** Tax Related Details ****************************************** */

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[26]/td[3]/input")
    @CacheLookup
    public WebElement panNumber;



    /* ********************************** Contact Details ****************************************** */

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[30]/td[3]/input")
    @CacheLookup
    public WebElement contactPersonName;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[31]/td[3]/input")
    @CacheLookup
    public WebElement contactPersonNumber;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[41]/td[1]/button[1]")
    @CacheLookup
    public WebElement submitButton;

    /*Pop-Up for approval*/
    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-popups/div[1]/div/table/tbody/tr[1]/th")
    @CacheLookup
    public WebElement accessPopUp;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-popups/div[1]/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td/button[1]")
    @CacheLookup
    public WebElement confirmButton;






}
