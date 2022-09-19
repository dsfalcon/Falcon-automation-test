package main.java.dart.pageEvents;


import main.java.dart.pageObjects.TransactionsPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static test.java.BaseTest.driver;

public class TransactionsPageEvents extends TransactionsPageElements {

    WebDriver ldriver;

    public TransactionsPageEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void filterData (String test){
        clickOnFromCalenderIcon.click();
        toSelectYear.click();
        // Locating element with text()
        String myEle = "//*[text()='" +test+"']"; //Parse element from excel to select month
        WebElement e = driver.findElement(By.xpath(myEle));  // use element in custom xpath
        e.click();

        System.out.println("Element with text(): " + e.getText() );

        // xpath=//mat-calendar[@id='mat-datepicker-2']/div/mat-month-view/table/tbody/tr[5]/td[3]/div /* loop by tr td for date*/




    }




}
