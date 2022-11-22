package main.java.dart.pageEvents;

import main.java.dart.pageObjects.SideBarElements;
import main.java.utils.ElementWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SideBarEvents extends SideBarElements {

    WebDriver ldriver;
    public SideBarEvents (WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void goToEndUser () {
        try{
            System.out.println("Trying to clicking on the User Menu Option-------> ");
            ElementWaits.waitForElementToBeClickable(ldriver,users,200).click();
            System.out.println("Clicked on Menu Option-------> ");
            System.out.println("Trying to clicking on the Sub Menu End user Option-------> ");
            ElementWaits.waitForElementToBeClickable(ldriver,endUser,200).click();
            System.out.println("Clicked on the Sub Menu End user Option-------> ");
        }
        catch (Exception e){
            System.out.println("Exception On Side Bar Page-------> "+e.getMessage());

        }


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
