package main.java.kite.pageEvents;

import main.java.kite.pageObjects.FinSidebarElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FinSideBarEvents extends FinSidebarElements {

    WebDriver ldriver;
    public FinSideBarEvents(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void goToNewTransfer(){
        enterpriseTransfer.click();
        createNewTransfer.click();

    }
    public void goToViewTransfer(){
        enterpriseTransfer.click();
        viewTransfer.click();

    }


}
