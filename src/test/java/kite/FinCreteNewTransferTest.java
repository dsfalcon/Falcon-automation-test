package test.java.kite;

import main.java.kite.pageEvents.*;
import main.java.utils.XLUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FinCreteNewTransferTest extends BaseTest {

    @Test(dataProvider = "finData")
    public void FinCreteNewTransferMethod(String CompanyCode, String EnterpriseName) throws InterruptedException, IOException {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        FinLoginPageEvents finLoginPageEvents = new FinLoginPageEvents(driver);
        finLoginPageEvents.loginMethod();

        FinSideBarEvents finSideBarEvents = new FinSideBarEvents(driver);
        finSideBarEvents.goToNewTransfer();

        FinCreateNewTransferPageEvents finCreateNewTransferPageEvents = new FinCreateNewTransferPageEvents(driver);
        finCreateNewTransferPageEvents.newTransfer(CompanyCode, EnterpriseName);

 //       logger.addScreenCaptureFromPath("../screenshots/FinCreteNewTransferMethod.png");

        Thread.sleep(5000);
        /* ****************** Page Code ****************** */
    }




    @DataProvider(name = "finData")
    Object[][] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/datafiles/" + "kiteDDT.xlsx";
        int rownum = XLUtils.getRowCount(path, "CreateNewTransfer");
        int colcount = XLUtils.getCellCount(path, "CreateNewTransfer", 1);

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
                    logindata[i - 1][j] = XLUtils.getCellData(path, "CreateNewTransfer", i, j);
                }
            }
        }


        return logindata;
    }
  
}
