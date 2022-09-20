package main.java.dart.pageEvents;


import main.java.dart.pageObjects.TransactionPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static test.java.BaseTest.driver;

public class TransactionPageEvents extends TransactionPageElements {

    WebDriver ldriver;

    public TransactionPageEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    public void filterData() {
        filterButton.click();
        clickOnFromCalenderIcon.click();
        // xpath=//mat-calendar[@id='mat-datepicker-2']/div/mat-month-view/table/tbody/tr[5]/td[3]/div /* loop by tr td for date*/
    }

    // Selecting the calendar date
    // If February month selected and date is greater than 29 and if in any month ,
    // date is greater than 31 then it will return nothing and prints wrong date
    // with given month and year
    public static void SelectDate(String exDay, String exMonth, String exYear) {
        if (exMonth.equals("February") && Integer.parseInt(exDay) > 29) {
            System.out.println("Wrong date:"+exMonth+":"+exDay);
            return;
        }
        if (Integer.parseInt(exDay) > 31) {
            System.out.println("wrongdate:"+exMonth+":"+exDay);
            return;
        }

        String MonthYear = driver.findElement(By.className("mat-calendar")).getText();

        // when month and year does not match , keep looping
        while (!getMonthYear(MonthYear)[0].equals(exMonth) && getMonthYear(MonthYear)[1].equals(exYear)) {
            driver.findElement(By.className("mat-calendar-next-button")).click();
            MonthYear = driver.findElement(By.className("mat-calendar")).getText();
        }

        driver.findElement(By.xpath(" //*[contains (text(),"+exDay+")]")).click();
        driver.close();
    }
    // month year
    public static String[] getMonthYear(String MonthYear) {
        return MonthYear.split(" ");

    }

    public void btnSubmit(){
        btnApply.click();
    }
}
