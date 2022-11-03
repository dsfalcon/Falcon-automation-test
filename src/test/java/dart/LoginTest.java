package test.java.dart;

import main.java.dart.pageEvents.LoginPageEvents;
import main.java.utils.XLUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    @Test/*(dataProvider = "ram")*/
    public void LoginMethodDart() {

        /* for Login User in Dart portal */
        try {
            LoginPageEvents loginPageEvents = new LoginPageEvents(driver);
            logger.info(driver.getCurrentUrl());
            loginPageEvents.loginMethod();
            logger.addScreenCaptureFromPath("../screenshots/LoginMethodDart.png");
        }catch (Exception e){
            logger.info(""+e.getMessage());
        }
    }


  /*  @DataProvider(name = "ram")
    Object[][] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/datafiles/" + "kiteDDT.xlsx";
        int rownum = XLUtils.getRowCount(path, "DartLogin");
        int colcount = XLUtils.getCellCount(path, "DartLogin", 1);

        String[][] logindata = new String[rownum][colcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {

                FileInputStream inputStream = new FileInputStream(new File(path));
                Workbook workbook = new XSSFWorkbook(inputStream);
                Sheet sheet = workbook.getSheetAt(5); // Excel Sheet number the sheet Start with 0 index value

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
                    logindata[i - 1][j] = XLUtils.getCellData(path, "DartLogin", i, j);
                }
            }
        }


        return logindata;
    }*/
}


