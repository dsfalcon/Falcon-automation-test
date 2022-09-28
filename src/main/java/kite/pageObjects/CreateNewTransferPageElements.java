package main.java.kite.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateNewTransferPageElements {

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/span[1]")
    @CacheLookup
    public WebElement selectForCompany;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/div/table/tbody/tr[2]/td/table/tbody/tr/td/input")
    @CacheLookup
    public WebElement searchCompany;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[2]/td/table/tbody/tr/td[1]/app-select-enterprise/div/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr/td[2]")
    @CacheLookup
    public WebElement selectCompany;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[1]/td[3]/app-program/div/table/tbody/tr/td[3]/img")
    @CacheLookup
    public WebElement SelectkitePrePaid;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[2]/td[3]/app-select/div/button[1]")
    @CacheLookup
    public WebElement GPR;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[3]/td[3]/app-select/div/button[5]")
    @CacheLookup
    public WebElement yesBank;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[4]/td[3]/app-select/div/button[1]")
    @CacheLookup
    public WebElement enterPrisePoolAccount;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[5]/td[3]/input")
    @CacheLookup
    public WebElement transactionDate;

    @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[6]/td[3]/input")
    @CacheLookup
    public WebElement transactionAmount;

 @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[7]/td[3]/input")
    @CacheLookup
    public WebElement UTRnumber;

 @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[8]/td[3]/input")
    @CacheLookup
    public WebElement MMTicketNumber;

 @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/app-create-transfer/form/table/tbody/tr[10]/td[1]/button[1]")
    @CacheLookup
    public WebElement initiatePayment;

 @FindBy(xpath = "/html/body/app-root/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[2]/app-title/table/tbody/tr[4]/td[2]")
    @CacheLookup
    public WebElement transactionMsg;




}
