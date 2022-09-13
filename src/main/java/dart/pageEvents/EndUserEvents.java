package main.java.dart.pageEvents;

import main.java.dart.pageObjects.EndUserElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EndUserEvents extends EndUserElements {

    WebDriver ldriver;

    public EndUserEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void addNewUser(String fName, String lName, String mNumber, String email) throws InterruptedException {
        addNewUserBtn.click();
        //Thread.sleep(3000);
        firstName.sendKeys(fName);
        // Thread.sleep(3000);
        lastName.sendKeys(lName);
        //  Thread.sleep(3000);
        mobileNumber.sendKeys(mNumber);
        //  Thread.sleep(3000);
        selectRoleDropDown.click();
        // Thread.sleep(3000);
        /*  roleAdmin.click();
         *  Thread.sleep(3000);
         * */
        roleStandard.click();
        //   Thread.sleep(3000);
        genderMale.click();
        //   Thread.sleep(3000);
        /*     genderFemale.click();
         *  Thread.sleep(3000);
         * */
        this.email.sendKeys(email);
        //  Thread.sleep(3000);




        /* *************Add More Information**************** */

    }

    public void btnSubmit() throws InterruptedException {
        submitBtn.click();
        Thread.sleep(7000);


        String fstNameErr1 = "Please enter the first name";
        String fstNameErr2 = "Please enter letters only";
        String moNumberErr1 = "Please enter the mobile number";
        String moNumberErr2 = "Mobile number must have 10 digits";
        String moNumberErr3 = "MOBILE already in use. Please enter a different one.";
        String roleErr1 = "Please select a user role";
        String genderErr1 = "Please select gender";


        List<WebElement> isPresentFullName = driver.findElements(By.xpath("/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[1]/div"));
        List<WebElement> isPresentMobile = driver.findElements(By.xpath("/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[3]/div"));
        List<WebElement> isPresentRole = driver.findElements(By.xpath("/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[4]/div[2]"));
        List<WebElement> isPresentGender = driver.findElements(By.xpath("/html/body/app-dialog/div/div/app-add-users/div/div[2]/form/div[1]/div[7]"));
        /*Need to check with link text*/
        boolean isFirstNameVailid = isPresentFullName.size() > 0;
        isFirstNameVailid = false;
        boolean isMobileVailid = isPresentMobile.size() > 0;
        boolean isRoleVailid = isPresentRole.size() > 0;
        boolean isGenderVailid = isPresentGender.size() > 0;


        if (isFirstNameVailid) {
            if (String.valueOf(firstNameErr.getText()).equalsIgnoreCase(fstNameErr1)) {
                logger.info("Error Found: " + fstNameErr1);
            } else if (String.valueOf(firstNameErr.getText()).equalsIgnoreCase(fstNameErr2)) {
                logger.info("Error Found: " + fstNameErr2);
            }
        } else if (isMobileVailid) {
            if (String.valueOf(moNumberErr.getText()).equalsIgnoreCase(moNumberErr1)) {
                logger.info("Error Found: " + moNumberErr1);
            } else if (String.valueOf(moNumberErr.getText()).equalsIgnoreCase(moNumberErr2)) {
                logger.info("Error Found: " + moNumberErr2);
            } else if (String.valueOf(moNumberErr.getText()).equalsIgnoreCase(moNumberErr3)) {
                logger.info("Error Found: " + moNumberErr3);
            }
        } else if (isRoleVailid) {
            if (String.valueOf(roleErr.getText()).equalsIgnoreCase(roleErr1)) {
                logger.info("Error Found: " + roleErr1);
            }

        } else if (isGenderVailid) {
            if (String.valueOf(genderErr.getText()).equalsIgnoreCase(genderErr1)) {
                logger.info("Error Found: " + genderErr1);
            }
        } else {
            logger.info("Test Passed");
        }



    }


}
