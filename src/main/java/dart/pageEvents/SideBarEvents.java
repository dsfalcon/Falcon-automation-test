package main.java.dart.pageEvents;

import main.java.dart.pageObjects.SideBarElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SideBarEvents extends SideBarElements {

    WebDriver ldriver;
    public SideBarEvents (WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void goToEndUser () {
        users.click();
        endUser.click();
    }

    public void goToProgram() {
        program.click();
    }

    /* Go to transaction*/
    public void goToTransaction() throws InterruptedException {
        realTimeData.click();
        transaction.click();
        Thread.sleep(3000);

    }

    public void goToCompanyAccountStatement() throws InterruptedException {
        realTimeData.click();
        companyAccountStatement.click();
        Thread.sleep(3000);

    }

public void goToBusinessReport() throws InterruptedException {
        businessReport.click();
        Thread.sleep(3000);

    }





}
