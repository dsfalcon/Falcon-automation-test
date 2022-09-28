package main.java.kite.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateAdminPageElements {

    /*Select Enterprise*/
    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/span[1]")
    @CacheLookup
    public WebElement clickToSlctEP;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/div/table/tbody/tr[2]/td/table/tbody/tr/td/input")
    @CacheLookup
    public WebElement EnterEpName;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/div/table/tbody/tr[2]/td/table/tbody/tr/td/div/table")
    @CacheLookup
    public WebElement slctEP;

    /*Program Name*/
    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-superadmin/form/table/tbody/tr[1]/td[3]/app-program/div/table/tbody/tr/td[2]")
    @CacheLookup
    public WebElement programName;

    /*Role*/
    @FindBy(id = "SUPER_ADMIN")
    @CacheLookup
    public WebElement roleSuAdmin;

    /*First Name*/
    @FindBy(id = "firstName")
    @CacheLookup
    public WebElement fstName;

    /*Last Name*/
    @FindBy(id = "lastName")
    @CacheLookup
    public WebElement lstName;

    /*Email ID*/
    @FindBy(id = "emailId")
    @CacheLookup
    public WebElement email;

    /*Mobile Number*/
    @FindBy(id = "mobileNumber")
    @CacheLookup
    public WebElement moNumber;

    /*Submit Button*/
    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-add-superadmin/form/table/tbody/tr[7]/td[2]/button[1]")
    @CacheLookup
    public WebElement submitButton;


}
