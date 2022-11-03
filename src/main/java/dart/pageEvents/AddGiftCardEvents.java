package main.java.dart.pageEvents;

import main.java.dart.pageObjects.AddGiftCardElements;
import main.java.utils.DatabaseConnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        enterAmount.sendKeys("1000");
        clickOnSubmitButton.click();
        Thread.sleep(3000);


    }


}
