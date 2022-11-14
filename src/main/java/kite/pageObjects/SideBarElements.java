package main.java.kite.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideBarElements {

    @FindBy(how = How.LINK_TEXT, using = "Enterprises")
    @CacheLookup
    public
    WebElement enterprisesMenu;


    @FindBy(linkText = "Add Enterprise")
    @CacheLookup
    public
    WebElement addEnterprisesSubMenu;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-menu/ul/li[1]/ul/li[4]/a")
    @CacheLookup
    public
    WebElement createAdmin;







}
