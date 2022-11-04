package main.java.dart.pageEvents;


import main.java.dart.pageObjects.TransactionPageElements;
import main.java.utils.DatePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static test.java.BaseTest.driver;


public class TransactionPageEvents extends TransactionPageElements {

    WebDriver ldriver;

    public TransactionPageEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    public void filterData() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,3);
        // presenceOfElementLocated condition
        wait.until(ExpectedConditions.presenceOfElementLocated (By.xpath("/html/body/app-root/app-post-auth/app-transactions/div/div/app-transactions-header/div/div[4]/div[2]/tr/td[2]/button")));
        filterButton.click();
        Thread.sleep(2000);
    }

    public void selectFromDate(String exDay, String exMonth, String exYear) throws InterruptedException {
        DatePicker.FromDate(
                exYear,
                exMonth,
                exDay,
                clickOnFromCalenderIcon,
                toSelectYear,
                yearPrevious,
                yearNext
        );
    }

    public void selectToDate(String exDay2, String exMonth2, String exYear2) throws InterruptedException {

        DatePicker.ToDate(
                exYear2,
                exMonth2,
                exDay2,
                clickOnToCalenderIcon,
                toSelectYear2,
                yearPrevious,
                yearNext
        );
    }
    public void amountFilter() throws InterruptedException {
        clickOnEnterAmount.click();
        Thread.sleep(1000);
        enterAmount.sendKeys("110");
        Thread.sleep(1000);

    }

    public void transactionTypesFilter() throws InterruptedException {
        debitFilter.click();
        Thread.sleep(1000);
        creditFilter.click();
        Thread.sleep(1000);
        reversalFilter.click();
        Thread.sleep(1000);
    }

    public void transactionChannelFilter() throws InterruptedException {
        atmFilter.click();
        Thread.sleep(1000);
        onlineFilter.click();
        Thread.sleep(1000);
        posFilter.click();
        Thread.sleep(1000);

    }

    public void cardTypeFilter() throws InterruptedException {
        prepaidCard.click();
        Thread.sleep(1000);
        giftCard.click();
        Thread.sleep(1000);

    }

    public void btnSubmit() throws InterruptedException {
        btnApply.click();
        Thread.sleep(1000);

    }

}
