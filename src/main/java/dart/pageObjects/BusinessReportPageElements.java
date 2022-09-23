package main.java.dart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BusinessReportPageElements {

    /*
    * Search
    * Download Report
    * #Report Type
    * User Details
    * KYC
    * Card Listing
    * Select fields/ Add more fields
    * Start Date
    * End Date
    * View Report
    *
    * */

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement search;

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement downloadReport;

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement userDetailReport;

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement KYCReport;

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement cardListingReport;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-business-reports/div/div/div/app-business-reports-filter/div/div[1]/div/button")
    @CacheLookup
    public WebElement viewReport;

    @FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/select-fields-dialog/div/div[2]")
    @CacheLookup
    public WebElement clearAllFilter;


    @FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/select-fields-dialog/div/form/div[14]/div/input")
    @CacheLookup
    public WebElement selectAllFilter;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-business-reports/div/div/div/app-business-reports-filter/div/div[3]/button/span")
    @CacheLookup
    public WebElement addMoreFields;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-business-reports/div/div/div/app-business-reports-filter/div/div[1]/app-business-reports-date/div[1]/div/mat-datepicker-toggle/button")
    @CacheLookup
    public WebElement clickOnFromCalenderIcon;

    @FindBy(xpath = "/html/body/app-root/app-post-auth/app-business-reports/div/div/div/app-business-reports-filter/div/div[1]/app-business-reports-date/div[2]/div/mat-datepicker-toggle/button")
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





}
