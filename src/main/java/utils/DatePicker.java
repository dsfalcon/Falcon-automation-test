package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public  class DatePicker {

    public static void FromDate(
            String exYear,
            String exMonth,
            String exDay,
            WebElement clickOnFromCalenderIcon,
            WebElement toSelectYear,
            WebElement yearPrevious,
            WebElement yearNext

    )throws InterruptedException{
        clickOnFromCalenderIcon.click();
        Thread.sleep(1000);
        toSelectYear.click();
        Thread.sleep(1000);

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
            boolean flagBreak = false;
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 4; j++) {
                    String webElementYear = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-multi-year-view/table/tbody/tr[" + i + "]/td[" + j + "]/div");
                    WebElement web2 = driver.findElement(By.xpath(webElementYear));
                    logger.info("WEBELEMENT *********** " + web2.getText());
                    int year = Integer.parseInt(String.valueOf(web2.getText()));
                    if (dataYear == year) {
                        web2.click();

                        // For Month
                        for (int k = 2; k <= 4; k++) {
                            for (int l = 1; l <= 4; l++) {
                                String webElementMonth = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-year-view/table/tbody/tr[" + k + "]/td[" + l + "]/div");
                                WebElement web3 = driver.findElement(By.xpath(webElementMonth));
                                logger.info("***********WEBELEMENT3 *********** " + web3.getText());
                                String month = String.valueOf(web3.getText());
                                if (month.equalsIgnoreCase(exMonth)) {
                                    web3.click();
                                    logger.info("Mothclicked***********" + month);

                                    /*For Day*/
                                    try {
                                        for (int m = 1; m <= 5; m++) {
                                            for (int n = 2; n <= 7; n++) {
                                                String webElementDay = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[" + m + "]/td[" + n + "]/div");
                                                WebElement web4 = driver.findElement(By.xpath(webElementDay));
                                                logger.info("WEBELEMENT4 *********** " + web4.getText());
                                                int day = Integer.parseInt(String.valueOf(web4.getText()));
                                                if (dataDay == day) {
                                                    web4.click();
                                                    logger.info("DayTryclicked***********" + day);

                                                    Thread.sleep(1000);
                                                }
                                            }
                                            logger.info("TryNEnd");
                                        }
                                        logger.info("TryMEnd");
                                    } catch (Exception e) {
                                        logger.info("" + e.getMessage());
                                        for (int m = 2; m <= 5; m++) {
                                            for (int n = 1; n <= 7; n++) {
//
                                                String webElementDay = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[" + m + "]/td[" + n + "]/div");
                                                WebElement web4 = driver.findElement(By.xpath(webElementDay));
                                                logger.info("WEBELEMENT4 *********** " + web4.getText());
                                                if (exMonth.equals("FEB") && Integer.parseInt(exDay) > 29) {
                                                    System.out.println("Wrong date:" + exMonth + ":" + exDay);
                                                    logger.info("Wrong date:" + exMonth + ":" + exDay);
                                                    return;
                                                }
                                                if (Integer.parseInt(exDay) > 31) {
                                                    System.out.println("wrongdate:" + exMonth + ":" + exDay);
                                                    logger.info("wrongdate:" + exMonth + ":" + exDay);
                                                    return;
                                                }
                                                Thread.sleep(2000);
                                                int day = Integer.parseInt(String.valueOf(web4.getText()));
                                                if (dataDay == day) {
                                                    web4.click();
                                                    Thread.sleep(3000);
                                                    logger.info("DayCathclicked***********" + day);
                                                    flagBreak = true;
                                                    break;
                                                }
                                            }
                                            if(flagBreak){
                                                break;
                                            }
                                            logger.info("CatchNEnd");
                                        }
                                        logger.info("CatchMClosed");
                                    } // Catch End

                                    logger.info("CatchEnd");if(flagBreak){
                                        break;
                                    }
                                }
                            }if(flagBreak){
                                break;
                            }
                            logger.info("LCLosedEnd");
                        }
                        logger.info("KEndClosed");
                    }if(flagBreak){
                        break;
                    }
                }
                logger.info("JEndClosed");
                if(flagBreak){
                    break;
                }
            }

            logger.info("IEndClosed");
            logger.info("Before Else");
        }

    }

    public static void ToDate(
            String exYear2,
            String exMonth2,
            String exDay2,
            WebElement clickOnToCalenderIcon,
            WebElement toSelectYear2,
            WebElement yearPrevious,
            WebElement yearNext
    ) throws InterruptedException {
        logger.info("SelectToDate---------------------------> " + exDay2 + "----" + exMonth2 + "----" + exYear2);

        clickOnToCalenderIcon.click();
        Thread.sleep(4000);
        try {
            toSelectYear2.click();
            Thread.sleep(2000);
            logger.info("Try block");
        }
        catch (Exception e){
            toSelectYear2.click();
            Thread.sleep(2000);
            logger.info("Catch block");
        }

        int dataYear = Integer.parseInt(exYear2);
        int dataDay = Integer.parseInt(exDay2);
        int minYear = 2016;
        int maxYear = 2039;

        if (dataYear < minYear) {
            yearPrevious.click();
        } else if (dataYear > maxYear) {
            yearNext.click();
        } else {

            /*For Year*/
            boolean flagBreak = false;
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 4; j++) {
                    String webElementYear = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-multi-year-view/table/tbody/tr[" + i + "]/td[" + j + "]/div");
                    WebElement web2 = driver.findElement(By.xpath(webElementYear));
                    logger.info("WEBELEMENT *********** " + web2.getText());
                    int year = Integer.parseInt(String.valueOf(web2.getText()));
                    if (dataYear == year) {
                        web2.click();

                        // For Month
                        for (int k = 2; k <= 4; k++) {
                            for (int l = 1; l <= 4; l++) {
                                String webElementMonth = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-year-view/table/tbody/tr[" + k + "]/td[" + l + "]/div");
                                WebElement web3 = driver.findElement(By.xpath(webElementMonth));
                                logger.info("***********WEBELEMENT3 *********** " + web3.getText());
                                String month = String.valueOf(web3.getText());
                                if (month.equalsIgnoreCase(exMonth2)) {
                                    web3.click();
                                    logger.info("Mothclicked***********" + month);

                                    /*For Day*/
                                    try {
                                        for (int m = 1; m <= 5; m++) {
                                            for (int n = 2; n <= 7; n++) {
                                                String webElementDay = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[" + m + "]/td[" + n + "]/div");
                                                WebElement web4 = driver.findElement(By.xpath(webElementDay));
                                                logger.info("WEBELEMENT4 *********** " + web4.getText());
                                                int day = Integer.parseInt(String.valueOf(web4.getText()));
                                                if (dataDay == day) {
                                                    web4.click();
                                                    logger.info("DayTryclicked***********" + day);
                                                    clickOnToCalenderIcon.click();
                                                    Thread.sleep(1000);
                                                    toSelectYear2.click();
                                                    Thread.sleep(1000);
                                                }
                                            }
                                            logger.info("TryNEnd");
                                        }
                                        logger.info("TryMEnd");
                                    } catch (Exception e) {
                                        logger.info("" + e.getMessage());
                                        for (int m = 2; m <= 5; m++) {
                                            for (int n = 1; n <= 7; n++) {
                                                String webElementDay = ("/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[" + m + "]/td[" + n + "]/div");
                                                WebElement web4 = driver.findElement(By.xpath(webElementDay));
                                                logger.info("WEBELEMENT4 *********** " + web4.getText());
                                                if (exMonth2.equals("FEB") && Integer.parseInt(exDay2) > 29) {
                                                    System.out.println("Wrong date:" + exMonth2 + ":" + exDay2);
                                                    logger.info("Wrong date:" + exMonth2 + ":" + exDay2);
                                                    return;
                                                }
                                                if (Integer.parseInt(exDay2) > 31) {
                                                    System.out.println("wrongdate:" + exMonth2 + ":" + exDay2);
                                                    logger.info("wrongdate:" + exMonth2 + ":" + exDay2);
                                                    return;
                                                }
                                                Thread.sleep(2000);
                                                int day = Integer.parseInt(String.valueOf(web4.getText()));
                                                if (dataDay == day) {
                                                    web4.click();
                                                    Thread.sleep(3000);
                                                    logger.info("DayCathclicked***********" + day);
                                                    flagBreak = true;
                                                    break;
                                                }
                                            }
                                            if(flagBreak){
                                                break;
                                            }
                                            logger.info("CatchNEnd");
                                        }
                                        logger.info("CatchMClosed");
                                    } // Catch End

                                    logger.info("CatchEnd");if(flagBreak){
                                        break;
                                    }
                                }
                            }if(flagBreak){
                                break;
                            }
                            logger.info("LCLosedEnd");
                        }
                        logger.info("KEndClosed");
                    }if(flagBreak){
                        break;
                    }
                }
                logger.info("JEndClosed");
                if(flagBreak){
                    break;
                }
            }
        }
    }

}
