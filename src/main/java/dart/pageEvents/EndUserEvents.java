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


        String isFirstNameVailid = firstNameErr.getText();
        String isMobileVailid = moNumberErr.getText();
        String isMobileVailid2 = moNumberErr.getText();
        String isMobileVailid3 = moNumberErr.getText();
        String isRoleVailid = roleErr.getText();
        String isGenderVailid = genderErr.getText();


        if (isFirstNameVailid != null && isFirstNameVailid.equalsIgnoreCase(fstNameErr1)) {
            if (String.valueOf(firstNameErr.getText()).equalsIgnoreCase(fstNameErr1)) {
                logger.info("Error Found: " + fstNameErr1);
            } else if (String.valueOf(firstNameErr.getText()).equalsIgnoreCase(fstNameErr2)) {
                logger.info("Error Found: " + fstNameErr2);
            }

        } else if ((isMobileVailid.equalsIgnoreCase(moNumberErr1))|| (isMobileVailid2.equalsIgnoreCase(moNumberErr2))|| (isMobileVailid3.equalsIgnoreCase(moNumberErr3)))  {

            if (String.valueOf(moNumberErr.getText()).equalsIgnoreCase(moNumberErr1)) {
                logger.info("Error Found: " + moNumberErr1);
            } else if (String.valueOf(moNumberErr.getText()).equalsIgnoreCase(moNumberErr2)) {
                logger.info("Error Found: " + moNumberErr2);
            } else if (String.valueOf(moNumberErr.getText()).equalsIgnoreCase(moNumberErr3)) {
                logger.info("Error Found: " + moNumberErr3);
            }
        } else if (isRoleVailid!= null && isRoleVailid.equalsIgnoreCase(roleErr1)) {
            if (String.valueOf(roleErr.getText()).equalsIgnoreCase(roleErr1)) {
                logger.info("Error Found: " + roleErr1);
            }

        } else if (isGenderVailid!= null && isGenderVailid.equalsIgnoreCase(genderErr1)) {
            if (String.valueOf(genderErr.getText()).equalsIgnoreCase(genderErr1)) {
                logger.info("Error Found: " + genderErr1);
            }
        } else {
            logger.info("Test Passed");
        }


    }


}
