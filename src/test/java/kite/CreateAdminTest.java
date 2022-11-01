package test.java.kite;

import main.java.kite.pageEvents.CreateAdminPageEvents;
import main.java.kite.pageEvents.SideBarEvents;

import main.java.utils.XLUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateAdminTest extends BaseTest {

    @Test(dataProvider = "companyData")
    public void CreateAdminMethod(String EnterpriseName,String ProgramName, String Role, String FirstName, String LastName,String Email_ID, String MobileNumber) throws IOException, InterruptedException {
        super.LoginMethod();
        Thread.sleep(5000);


        SideBarEvents sideBarEvents = new SideBarEvents(driver);
        sideBarEvents.goToCreateAdmin();
        Thread.sleep(3000);

        CreateAdminPageEvents createAdminEvents =new CreateAdminPageEvents(driver);
        createAdminEvents.createAdmin(EnterpriseName);
        logger.addScreenCaptureFromPath("../screenshots/CreateAdminMethod.png");

    }


    @DataProvider(name = "companyData")
    Object[][] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/datafiles/" + "kiteDDT.xlsx";
        int rownum = XLUtils.getRowCount(path, "CreateAdmin");
        int colcount = XLUtils.getCellCount(path, "CreateAdmin", 1);

        String[][] logindata = new String[rownum][colcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {

                FileInputStream inputStream = new FileInputStream(new File(path));
                Workbook workbook = new XSSFWorkbook(inputStream);
                Sheet sheet = workbook.getSheetAt(1);

                Row row = sheet.getRow(i);
                Cell cell = row.getCell(j);

                FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                if (cell != null && cell.getCellType() == CellType.FORMULA) {

                    switch (cell.getCachedFormulaResultType()) {
                        //  switch (evaluator.evaluateFormulaCell(cell)) {
                        case BOOLEAN:
                            System.out.println(cell.getBooleanCellValue());
                            break;
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue());
                            break;
                        case STRING:
                            logindata[i - 1][j] = cell.getRichStringCellValue().getString();
                            System.out.println(cell.getRichStringCellValue());
                            break;
                    }
                }
                else {
                    logindata[i - 1][j] = XLUtils.getCellData(path, "CreateAdmin", i, j);
                }

//
            }
        }


        return logindata;
    }

}
