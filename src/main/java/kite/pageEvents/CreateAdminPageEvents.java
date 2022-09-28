package main.java.kite.pageEvents;

import main.java.kite.pageObjects.CreateAdminPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class CreateAdminPageEvents extends CreateAdminPageElements {

    WebDriver ldriver;
    public CreateAdminPageEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void createAdmin() throws InterruptedException {
        /* **************** Create Admin Information****************/

        logger.info("Page Title is " + driver.getTitle());
        logger.info("Current Page URL "+ driver.getCurrentUrl());
        clickToSlctEP.click();
        Thread.sleep(3000);
        EnterEpName.sendKeys("gouravqa13");
        Thread.sleep(3000);
        slctEP.click();
        Thread.sleep(3000);
        programName.click();
        roleSuAdmin.click();
        fstName.sendKeys("DayMonnTest");
        lstName.sendKeys("LastNameTestt");
        email.sendKeys("moon99test@mailinator.com");
        moNumber.sendKeys("98765432598");
        submitButton.click();

    }
}
