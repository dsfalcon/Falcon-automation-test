package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CompanyAccountStatementPageElements {

    /*
     * Search by Name, amount, Virtual Account no,Tracking ID, Status, Date
     * All Company statements result
     * Download data
     *
     * Filter
     *       From Date
     *       To Date
     *       Amount
     *       Transaction type
     *       Apply button
     *       Reset filter
     *
     * */

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-company-statement/div/div/app-company-statement-header/div/div[1]/input")
    @CacheLookup
    public WebElement searchField;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-company-statement/div/div/app-company-statement-header/div/div[2]/div/h4/text()")
    @CacheLookup
    public WebElement noOfCompanyStatement;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-company-statement/div/div/app-company-statement-header/div/div[4]/div[2]/tr/td[2]/button")
    @CacheLookup
    public WebElement filterButton;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[1]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
    @CacheLookup
    public WebElement clickOnFromCalenderIcon;

    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[2]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
    @CacheLookup
    public WebElement clickOnToCalenderIcon;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[1]/span")
    @CacheLookup
    public WebElement toSelectYear;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[1]/span")
    @CacheLookup
    public WebElement toSelectYear2;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[2]")
    @CacheLookup
    public WebElement yearPrevious;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[3]")
    @CacheLookup
    public WebElement yearNext;

    /*Edit Amount Icon*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[3]/div/div[2]/p/span")
    @CacheLookup
    public WebElement clickOnEnterAmount;

    /*Enter Amount*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[3]/div/div[2]/p/input")
    @CacheLookup
    public WebElement enterAmount;

    /* ************************************ Transaction Types ********************************* */

    /*Debit*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[4]/div/ul/li[1]/label[2]")
    @CacheLookup
    public WebElement debit;

    /*Credit*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[4]/div/ul/li[2]/label[2]")
    @CacheLookup
    public WebElement credit;

    /*Reversal*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[4]/div/ul/li[3]/label[2] ")
    @CacheLookup
    public WebElement reversal;

    /*Apply Button*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-company-statement-filter/div/div[2]/div[6]/div[2]/button")
    @CacheLookup
    public WebElement btnApply;


  /*Filter Error*/
    @FindBy(xpath = "/html/body/app-root/app-notification/div/div/div/p[1]")
    @CacheLookup
    public WebElement filterErr;










}
