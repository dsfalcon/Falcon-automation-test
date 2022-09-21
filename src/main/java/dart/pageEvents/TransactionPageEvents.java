package main.java.dart.pageEvents;


import main.java.dart.pageObjects.TransactionPageElements;
import main.java.utils.XLUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class TransactionPageEvents extends TransactionPageElements {

    WebDriver ldriver;

    public TransactionPageEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    public void filterData() throws InterruptedException {
        filterButton.click();
        Thread.sleep(2000);
        clickOnFromCalenderIcon.click();
        Thread.sleep(2000);
        toSelectYear.click();
        Thread.sleep(1000);


        // xpath=//mat-calendar[@id='mat-datepicker-2']/div/mat-month-view/table/tbody/tr[5]/td[3]/div /* loop by tr td for date*/
    }

    // Selecting the calendar date
    // If February month selected and date is greater than 29 and if in any month ,
    // date is greater than 31 then it will return nothing and prints wrong date
    // with given month and year
    public void SelectDate(String exDay, String exMonth, String exYear) throws InterruptedException {
        /* ******************************************************************** */
        int dataYear = Integer.parseInt(exYear);
        int dataDay = Integer.parseInt(exDay);
        int minYear = 2016;
        int maxYear = 2039;

        if (dataYear < minYear) {
            yearPrevious.click();
        } else if (dataYear > maxYear) {
            yearNext.click();
        } else {

            /*For Year*/
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 4; j++) {
                    String webElementYear = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-multi-year-view/table/tbody/tr[" + i + "]/td[" + j + "]/div");
                    WebElement web2 = driver.findElement(By.xpath(webElementYear));
                    logger.info("WEBELEMENT *********** " + web2.getText());
                    int year = Integer.parseInt(String.valueOf(web2.getText()));
                    if (dataYear == year) {
                        Thread.sleep(2000);
                        web2.click();

                        // For Month
                        for (int k = 2; k <= 4; k++) {
                            for (int l = 1; l <= 4; l++) {
                                // String webElement =  ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-multi-year-view/table/tbody/tr["+i+"]/td["+j+"]/div");
                                String webElementMonth = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-year-view/table/tbody/tr[" + k + "]/td[" + l + "]/div");
                                WebElement web3 = driver.findElement(By.xpath(webElementMonth));
                                logger.info("***********WEBELEMENT3 *********** " + web3.getText());
                                String month = String.valueOf(web3.getText());
                                if (month.equalsIgnoreCase(exMonth)) {
                                    Thread.sleep(2000);
                                    web3.click();
                                    logger.info("Mothclicked***********" + month);

                                    /*For Day*/
                                    try {
                                        for (int m = 1; m <= 5; m++) {

                                            for (int n = 2; n <= 7; n++) {
                                                logger.info("M Value" + m);
                                                logger.info("N Value" + n);
                                                //String webElementDay = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-multi-year-view/table/tbody/tr[" + i + "]/td[" + j + "]/div");
                                                String webElementDay = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[" + m + "]/td[" + n + "]/div");
                                                WebElement web4 = driver.findElement(By.xpath(webElementDay));
                                                logger.info("WEBELEMENT4 *********** " + web4.getText());
                                                int day = Integer.parseInt(String.valueOf(web4.getText()));
                                                if (dataDay == day) {
                                                    Thread.sleep(2000);
                                                    web4.click();

                                                    logger.info("Dayclicked***********" + day);
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        logger.info("" + e.getMessage());
                                        for (int m = 2; m <= 5; m++) {

                                            for (int n = 1; n <= 7; n++) {
                                                logger.info("CATCH M Value" + m);
                                                logger.info("CATCH N Value" + n);
                                                String webElementDay = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[" + m + "]/td[" + n + "]/div");
                                                WebElement web4 = driver.findElement(By.xpath(webElementDay));
                                                logger.info("WEBELEMENT4 *********** " + web4.getText());
                                                int day = Integer.parseInt(String.valueOf(web4.getText()));
                                                if (dataDay == day) {
                                                    Thread.sleep(2000);
                                                    web4.click();
                                                    logger.info("Dayclicked***********" + day);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }


// For Selecting Month
          /*  for(int i=2; i<=4; i++){
                for(int j=1;j<=4;j++){
                    // String webElement =  ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-multi-year-view/table/tbody/tr["+i+"]/td["+j+"]/div");
                    String webElementMonth =  ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-year-view/table/tbody/tr["+i+"]/td["+j+"]/div");
                    WebElement web3 = driver.findElement(By.xpath(webElementMonth));
                    logger.info("***********WEBELEMENT3 *********** "+web3.getText());
                   String month = String.valueOf(web3.getText());

                   *//* if(month == exMonth){
                        web3.click();
                        break;
                    }*//*
                }
            }*/
            // For day
        }



        /* ******************************************************************** */

        /*if (exMonth.equals("February") && Integer.parseInt(exDay) > 29) {
            System.out.println("Wrong date:" + exMonth + ":" + exDay);
            return;
        }
        if (Integer.parseInt(exDay) > 31) {
            System.out.println("wrongdate:" + exMonth + ":" + exDay);
            return;
        }

//        String MonthYear = driver.findElement(By.className("mat-datepicker-content ng-tns-c39-24 mat-primary ng-star-inserted ng-trigger ng-trigger-transformPanel")).getText();
        String MonthYear = driver.findElement(By.className("mat-datepicker-content ng-tns-c39-24 mat-primary ng-star-inserted ng-trigger ng-trigger-transformPanel")).getText();

        // when month and year does not match , keep looping
        while (!getMonthYear(MonthYear)[0].equals(exMonth) && getMonthYear(MonthYear)[1].equals(exYear)) {
            driver.findElement(By.className("mat-calendar-previous-button mat-icon-button mat-button-base")).click();
            MonthYear = driver.findElement(By.className("mat-calendar-body-cell-content")).getText();
            System.out.println(MonthYear);
            logger.info("MonthYear **********************" + MonthYear);

        }

        driver.findElement(By.xpath(" //*[contains (text()," + exDay + ")]")).click();
        driver.close();*/
    }

    // month year
    public String[] getMonthYear(String MonthYear) {
        return MonthYear.split(" ");

    }

    public void btnSubmit() {
        btnApply.click();
    }
}
