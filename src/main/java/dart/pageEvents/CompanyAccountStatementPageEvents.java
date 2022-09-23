package main.java.dart.pageEvents;

import main.java.dart.pageObjects.CompanyAccountStatementPageElements;
import main.java.utils.DatePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class CompanyAccountStatementPageEvents extends CompanyAccountStatementPageElements {
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
    *       Reset filter button: if String_count Yes ?
    *
    * */

    WebDriver ldriver;

    public CompanyAccountStatementPageEvents(WebDriver rdriver) throws InterruptedException {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    public void searchData(){
        searchField.sendKeys();
    }
    public void allCompanyStatement(){
       String text =  noOfCompanyStatement.getText();
       logger.info(text+"All Company statements");

    }
    public void filterData() throws InterruptedException {
        WebDriverWait w = new WebDriverWait(driver,3);
        // presenceOfElementLocated condition
        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("/html/body/app-root/app-post-auth/app-company-statement/div/div/app-company-statement-header/div/div[4]/div[2]/tr/td[2]/button")));
        filterButton.click();
        Thread.sleep(2000);
    }

    public void SelectFromDate(String exDay, String exMonth, String exYear) throws InterruptedException){
        DatePicker.FromDate(
                exYear,
                exMonth,
                exDay,
                filterCalenderButtonIcon,
                toSelectYear,
                yearPrevious,
                yearNext
        );

    }
    public void SelectToDate(String exDay2, String exMonth2, String exYear2) throws InterruptedException {

        DatePicker.ToDate(
                exYear2,
                exMonth2,
                exDay2,
                filterToDateButtonIcon,
                toSelectYear2,
                yearPrevious,
                yearNext
        );
    }

}
