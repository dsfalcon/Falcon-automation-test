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
        List<WebElement> er = null;
        List<WebElement> er2 = null;
        try {
            enterBinNUmber.sendKeys("607091");
            enterAmount.sendKeys("1000");
            er2 = ldriver.findElements(By.className("number-error"));
            clickOnSubmitButton.click();
            Thread.sleep(5000);
            er = ldriver.findElements(By.className("open error"));
        } catch (Exception e) {
            System.out.println(er);
            System.out.println(er2);
            System.out.println("Error Resolved for Git");
            System.out.println(e.getMessage());
        }


    }


}
