package main.java.dart.pageEvents;

import main.java.dart.pageObjects.AddGiftCardElements;
import main.java.utils.DatabaseConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class AddGiftCardEvents extends AddGiftCardElements {

    WebDriver ldriver;

    public AddGiftCardEvents(WebDriver rdriver) throws InterruptedException {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    public void selectUserToAddCard(String FirstName) throws InterruptedException {


        searchBox.sendKeys(FirstName);
        Thread.sleep(2000);
        selectCheckbox.click();
        clickOnAddGiftCardButton.click();
        selectSingleCard.click();
        selectVirtualCard.click();
        enterBinNUmber.sendKeys("607091");
        enterAmount.sendKeys("0");
        clickOnSubmitButton.click();
        Thread.sleep(7000);


        try {
            List<WebElement> er1 = driver.findElements(By.className("number-error"));
            List<WebElement> er2 = driver.findElements(By.className("notification"));
            for (int i = 0; i < er2.size(); i++) {
                String elementText = er2.get(i).getText();
                System.out.println("Notification Displayed on Page "+elementText);
                logger.info("Notification Displayed on Page "+elementText);
            }
            for (int i = 0; i < er1.size(); i++) {
                String elementText = er1.get(i).getText();
                System.out.println("Field Error Displayed on Page "+elementText);
                logger.info("Field Error Displayed on Page "+elementText);
            }


        } catch (Exception e) {
            logger.info("Got Some Exception While Checking the errors on the Form::::: " + e.getMessage());


        }


    }
}
