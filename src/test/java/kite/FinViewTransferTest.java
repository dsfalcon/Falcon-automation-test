package test.java.kite;

import main.java.kite.pageEvents.FinLoginPageEvents;
import main.java.kite.pageEvents.FinSideBarEvents;
import main.java.kite.pageEvents.FinViewTransferPageEvents;
import main.java.utils.XLUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FinViewTransferTest extends BaseTest {

    @Test(dataProvider = "finData")
    public void FinViewTransferMethod(String EnterpriseName,String Bank, String Account, String TicketRaised_TransferComplete, String ProgramName, String Card) throws InterruptedException, IOException {
        FinLoginPageEvents finLoginPageEvents = new FinLoginPageEvents(driver);
        finLoginPageEvents.loginMethod();

        FinSideBarEvents finSideBarEvents = new FinSideBarEvents(driver);
        finSideBarEvents.goToViewTransfer();

        FinViewTransferPageEvents finViewTransferPageEvents = new FinViewTransferPageEvents(driver);
        finViewTransferPageEvents.approveTransfer(EnterpriseName);

        Thread.sleep(5000);
    }
    @DataProvider(name = "finData")
    Object[][] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/datafiles/" + "kiteDDT.xlsx";
        int rownum = XLUtils.getRowCount(path, "ViewTransfer");
        int colcount = XLUtils.getCellCount(path, "ViewTransfer", 1);

        String[][] logindata = new String[rownum][colcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {

                FileInputStream inputStream = new FileInputStream(new File(path));
                Workbook workbook = new XSSFWorkbook(inputStream);
                Sheet sheet = workbook.getSheetAt(4);

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
                    logindata[i - 1][j] = XLUtils.getCellData(path, "ViewTransfer", i, j);
                }
            }
        }


        return logindata;
    }

}
