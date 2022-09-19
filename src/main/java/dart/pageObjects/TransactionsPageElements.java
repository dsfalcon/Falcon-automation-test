package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TransactionsPageElements {

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
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[1]/span/text()")
    @CacheLookup
    public WebElement toSelectYear;

    /**/
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[1]/span/text()")
    @CacheLookup
    public WebElement toSelectYear;

    xpath=//mat-calendar[@id='mat-datepicker-2']/div/mat-month-view/table/tbody/tr[5]/td[3]/div





    /*To Date */
    @FindBy(xpath = " /html/body/app-dialog/div/div/app-transactions-filter/div/div[2]/div[1]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
    @CacheLookup
    public WebElement clickOnToCalenderIcon;



}
