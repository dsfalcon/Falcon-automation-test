package main.java.dart.pageEvents;

import main.java.dart.pageObjects.EndUserPageElements;
import main.java.utils.ElementWaits;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EndUserPageEvents extends EndUserPageElements {

    WebDriver ldriver;

    public EndUserPageEvents(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void addNewUser(String fName, String lName, String mNumber, String email) throws InterruptedException {
        try {
            ElementWaits.waitForElementToBeVisible(ldriver,userCountDiplayed,300).getText();

            logger.info("User Count Displayed on the Portal: "+userCountDiplayed.getText());
            System.out.println("<================= User Count Displayed on the Portal:=================> "+userCountDiplayed.getText());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

       // Thread.sleep(2000);
        addNewUserBtn.click();
        //Thread.sleep(1000);
        firstName.sendKeys(fName);
        // Thread.sleep(1000);
        lastName.sendKeys(lName);
        //  Thread.sleep(1000);
        mobileNumber.sendKeys(mNumber);
        //  Thread.sleep(1000);
        selectRoleDropDown.click();
        // Thread.sleep(3000);
        /*  roleAdmin.click();  /html/body/app-root/app-post-auth/app-users/div/end-user-header/div/div[2]/div[2]/div[1]/button
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
        Thread.sleep(2000);


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
