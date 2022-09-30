package main.java.kite.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewTransferElements {

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/span[1]")
    @CacheLookup
    public WebElement seachCompany;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/div/table/tbody/tr[2]/td/table/tbody/tr/td/input")
    @CacheLookup
    public WebElement enterCompany;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/div/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr/td[2]")
    @CacheLookup
    public WebElement selectCompany;
    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-view-transfers/div/table[1]/tbody/tr[1]/td[1]/app-tabs/div/label[5]")
    @CacheLookup
    public WebElement selectYesBank;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-view-transfers/div/table[1]/tbody/tr[1]/td[3]/app-program/div/table/tbody/tr/td[3]/img")
    @CacheLookup
    public WebElement selectKitePrepaid;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-view-transfers/div/table[1]/tbody/tr[2]/td/app-tabs[1]/div/label[1]/span")
    @CacheLookup
    public WebElement selectEnterprisePoolAccount;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-view-transfers/div/table[2]/tbody/tr/td/input")
    @CacheLookup
    public WebElement searchForTransaction;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-view-transfers/div/table[3]/tbody/tr/td[7]/span[1]")
    @CacheLookup
    public WebElement approveTransaction;

@FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-popups/div[1]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]")
    @CacheLookup
    public WebElement fundTransferMsg;

@FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-popups/div[1]/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td/button[1]")
    @CacheLookup
    public WebElement confirmButton;


@FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[4]/td[2]")
    @CacheLookup
    public WebElement transMessage;



}
