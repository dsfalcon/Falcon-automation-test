package main.java.kite.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FinSidebarElements {

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-menu/ul/li[1]/a")
    @CacheLookup
    public WebElement enterpriseTransfer;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-menu/ul/li[1]/ul/li[1]/a")
    @CacheLookup
    public WebElement createNewTransfer;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-menu/ul/li[1]/ul/li[2]/a")
    @CacheLookup
    public WebElement viewTransfer;


}
