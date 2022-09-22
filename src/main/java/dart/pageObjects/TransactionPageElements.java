package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TransactionPageElements {

    /*Search box*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-transactions/div/div/app-transactions-header/div/div[1]/input")
    @CacheLookup
    public WebElement searchBox;


    /*Results for Transactions*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-transactions/div/div/app-transactions-header/div/div[2]/div")
    @CacheLookup
    public WebElement dataCount;

    /*Export Result*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-transactions/div/div/app-transactions-header/div/div[4]/div[1]/tr/td/img")
    @CacheLookup
    public WebElement exportCSV;

    /*Filter Button*/
    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-transactions/div/div/app-transactions-header/div/div[4]/div[2]/tr/td[2]/button")
    @CacheLookup
    public WebElement filterButton;

    /* ********************************* Filter Options **************************************** */


    /*From Date */
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[1]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
    @CacheLookup
    public WebElement clickOnFromCalenderIcon;

    /*To Select Year 2016 - 2039*/
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[1]/span")
    @CacheLookup
    public WebElement toSelectYear;

 /*To Select Year 2016 - 2039*/
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[1]/span")
    @CacheLookup
    public WebElement toSelectYear2;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[2]")
    @CacheLookup
    public WebElement yearPrevious;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[3]")
    @CacheLookup
    public WebElement yearNext;


    /*To Date */
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[2]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
    @CacheLookup
    public WebElement clickOnToCalenderIcon;


    /*Edit Amount Icon*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[3]/div/div[2]/p/span")
    @CacheLookup
    public WebElement clickOnEnterAmount;

    /*Enter Amount*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[3]/div/div[2]/p/input")
    @CacheLookup
    public WebElement enterAmount;

    /* *************************** Transaction Types *******************/
    /*Debit*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[4]/div/ul/li[1]/label[2]")
    @CacheLookup
    public WebElement debitFilter;

    /*Credit*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[4]/div/ul/li[2]/label[2]")
    @CacheLookup
    public WebElement creditFilter;

    /*Reversal*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[4]/div/ul/li[3]/label[2]")
    @CacheLookup
    public WebElement reversalFilter;

    /* *************************** Transaction Channel *******************/
    /*ATM*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[4]/div/ul/li[1]/label[2]")
    @CacheLookup
    public WebElement atmFilter;

    /*Online*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[5]/div/ul/li[2]/label[2]")
    @CacheLookup
    public WebElement onlineFilter;

    /*POS*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[5]/div/ul/li[3]/label[2]")
    @CacheLookup
    public WebElement posFilter;

    /* *************************** Card Type ***************************/
    /*Prepaid*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[4]/div/ul/li[1]/label[2]")
    @CacheLookup
    public WebElement prepaidCard;

    /*Gift*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[5]/div/ul/li[2]/label[2]")
    @CacheLookup
    public WebElement giftCard;


    /*Button Apply*/
    @FindBy(xpath = "/html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[8]/div[2]/button")
    @CacheLookup
    public WebElement btnApply;


}
