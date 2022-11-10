package main.java.kite.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddEnterprisePageElements {

    /* Basic Information */

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

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[13]/td[3]/input")
    @CacheLookup
    public WebElement authTokenEmailID;

    /* ********************************** Tax Related Details ****************************************** */

    @FindBy(id = "panNumber")
    @CacheLookup
    public WebElement panNumber;



    /* ********************************** Contact Details ****************************************** */

    @FindBy(id = "contactPerson")
    @CacheLookup
    public WebElement contactPersonName;

    @FindBy(id = "contactPersonNumber")
    @CacheLookup
    public WebElement contactPersonNumber;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[45]/td[1]/button[1]")
    @CacheLookup
    public WebElement submitButton;

    /*Pop-Up for approval*/
    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-popups/div[1]/div/table/tbody/tr[1]/th")
    @CacheLookup
    public WebElement accessPopUp;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-popups/div[1]/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td/button[1]")
    @CacheLookup
    public WebElement confirmButton;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[44]/td[1]/label")
    @CacheLookup
    public WebElement clickOutSideToGetError;






    @FindBy(id = "DISABLED")
    @CacheLookup
    public WebElement upiPpi;

    @FindBy(id = "INDUSIND")
    @CacheLookup
    public WebElement INDUSIND;

    @FindBy(id = "openApiMobileNumber")
    @CacheLookup
    public WebElement authTokenEmailId;

    @FindBy(id = "partnerKey")
    @CacheLookup
    public WebElement partnerKey;

    @FindBy(id = "gprCardIssuerCode")
    @CacheLookup
    public WebElement issuerCode;

    @FindBy(id = "gprCardIssuerSecret")
    @CacheLookup
    public WebElement issuerSecret;

    @FindBy(id = "gprCardPsk")
    @CacheLookup
    public WebElement PSK;

    @FindBy(id = "natureOfBusiness")
    @CacheLookup
    public WebElement natureOfBusiness;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[25]/td[3]/input")
    @CacheLookup
    public WebElement dateOfIncorporation;

    @FindBy(id = "companyUrl")
    @CacheLookup
    public WebElement companyURL;


    @FindBy(id = "contactPersonNumber")
    @CacheLookup
    public WebElement contactPersonPhoneNumber;

    @FindBy(id = "alternatePhoneNumber")
    @CacheLookup
    public WebElement alternatePhoneNumber;

    @FindBy(id = "emailId")
    @CacheLookup
    public WebElement emailID;

    @FindBy(id = "address1")
    @CacheLookup
    public WebElement address1;

    @FindBy(id = "address2")
    @CacheLookup
    public WebElement address2;

    @FindBy(id = "city")
    @CacheLookup
    public WebElement City;

    @FindBy(id = "state")
    @CacheLookup
    public WebElement State;

    @FindBy(id = "zip")
    @CacheLookup
    public WebElement zipCode;


    /*  Error message */

    /*@FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[2]/td[5]")
    @CacheLookup
    public WebElement companyCodeError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[3]/td[5]")
    @CacheLookup
    public WebElement  enterpriseError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[4]/td[5]")
    @CacheLookup
    public WebElement displayNameError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[34]/td[5]")
    @CacheLookup
    public WebElement contactPersonNameError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[35]/td[5]")
    @CacheLookup
    public WebElement contactPersonPhoneNumberError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[36]/td[5]")
    @CacheLookup
    public WebElement alternatePhoneNumberError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[37]/td[5]")
    @CacheLookup
    public WebElement zipCodeError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[4]/td[2]")
    @CacheLookup
    public WebElement programSelectionError;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[13]/td[5]")
    @CacheLookup
    public WebElement authTokenEmailIDError;

  @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[26]/td[5]")
    @CacheLookup
    public WebElement companyURLError;

  @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[29]/td[5]")
    @CacheLookup
    public WebElement tanError;

  @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[30]/td[5]")
    @CacheLookup
    public WebElement panError;

  @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[31]/td[5]")
    @CacheLookup
    public WebElement gstinError;

 @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-enterprise/form/table/tbody/tr[37]/td[5]")
    @CacheLookup
    public WebElement getContactPersonEmailError;
*/









}
