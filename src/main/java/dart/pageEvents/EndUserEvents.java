package main.java.dart.pageEvents;

import main.java.dart.pageObjects.EndUserElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EndUserEvents extends EndUserElements {

    WebDriver ldriver;

    public EndUserEvents (WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    public void addNewUser (String fName, String lName, String mNumber, String email) throws InterruptedException {
        addNewUserBtn.click();
        Thread.sleep(3000);
        firstName.sendKeys(fName);
        Thread.sleep(3000);
        lastName.sendKeys(lName);
        Thread.sleep(3000);
        mobileNumber.sendKeys(mNumber);
        Thread.sleep(3000);
        selectRoleDropDown.click();
        Thread.sleep(3000);
      /*  roleAdmin.click();
      *  Thread.sleep(3000);
      * */
        roleStandard.click();
        Thread.sleep(3000);
        genderMale.click();
        Thread.sleep(3000);
   /*     genderFemale.click();
   *  Thread.sleep(3000);
   * */
        this.email.sendKeys(email);
        Thread.sleep(3000);
        submitBtn.click();
        Thread.sleep(7000);

        String str1 = "MOBILE already in use. Please enter a different one.";
        WebElement str2 = ldriver.findElement(By.xpath("/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[3]/div/p"));
        String str3 = str2.getText();

        Assert.assertEquals(str1,str3);
        Assert.assertFalse(true, "MOBILE already in use. Please enter a different one.");




        /* *************Add More Information**************** */

    }




}
