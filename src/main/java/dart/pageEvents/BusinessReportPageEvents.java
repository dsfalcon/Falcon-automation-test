package main.java.dart.pageEvents;

import main.java.dart.pageObjects.BusinessReportPageElements;
import main.java.utils.DatePicker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static test.java.BaseTest.logger;

public class BusinessReportPageEvents extends BusinessReportPageElements {

    WebDriver ldriver;

    public BusinessReportPageEvents (WebDriver rdriver) throws InterruptedException {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }
    public void selectReportType(String reportType) throws InterruptedException {
        String rType = reportType;
        logger.info("Report type in Event page:"+reportType);
        switch (rType) {
            case "Users Details":
                clickForReport.click();
                userDetailReport.click();
                Thread.sleep(5000);
                logger.info("User Details Selected");
                break;
            case "KYC":
                clickForReport.click();
                KYCReport.click();
                Thread.sleep(5000);
                logger.info("KYC Report Selected");
                break;
            case "Card Listing":
                clickForReport.click();
                cardListingReport.click();
                Thread.sleep(5000);
                logger.info("Card Listing Report Selected");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

    }
    public void selectFilter(){

         /* for(i=1;i<=10; i++){
        String element  = "/html/body/div/div[2]/div/mat-dialog-container/select-fields-dialog/div/form/div["+i+"]/label";
    }
*/
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

    public void searchForData(String searchData) throws InterruptedException {
        if (searchData.length()>3){
            search.sendKeys(searchData);
            Thread.sleep(5000);
        }
        else {
            logger.info("No Data For Search");
        }
    }

    public void btnSubmit() throws InterruptedException {
        viewReport.click();
        Thread.sleep(2000);
    }


}
