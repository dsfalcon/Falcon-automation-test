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

}
