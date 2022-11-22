package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import test.java.BaseTest;

public class EndUserPageElements extends BaseTest {

    /*Add new user Btton*/

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-users/div/end-user-header/div/div[2]/div[1]/h4")
    @CacheLookup
    public WebElement userCountDiplayed;
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-users/div/end-user-header/div/div[2]/div[2]/div[1]/button")
    @CacheLookup
    public WebElement addNewUserBtn;

    /*First Name*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[1]/input")
    @CacheLookup
    public WebElement firstName;

    /*Last Name*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[2]/input")
    @CacheLookup
    public WebElement lastName;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[3]/input")
    @CacheLookup
    public WebElement mobileNumber;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[4]/div[1]/div")
    @CacheLookup
    public WebElement selectRoleDropDown;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[4]/div[1]/div[2]/div/ul/li[2]")
    @CacheLookup
    public WebElement roleAdmin;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[4]/div[1]/div[2]/div/ul/li[3]")
    @CacheLookup
    public WebElement roleStandard;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[7]/mat-radio-group/mat-radio-button[1]/label/div[1]")

    @CacheLookup
    public WebElement genderMale;


    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[6]/mat-radio-group/mat-radio-button[2]/label/div[2]")
    @CacheLookup
    public WebElement genderFemale;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[9]/input")
    @CacheLookup
    public WebElement email;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[2]/button")
    @CacheLookup
    public  WebElement submitBtn;

    /* *********************************************** Page Errors ****************************************************************** */

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[1]/div")
    @CacheLookup
    public WebElement firstNameErr;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[3]/div/p")
    @CacheLookup
    public WebElement moNumberErr;

     @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[4]/div[2]")
    @CacheLookup
    public WebElement roleErr;

     @FindBy(xpath = "/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[7]")
    @CacheLookup
    public WebElement genderErr;






}
