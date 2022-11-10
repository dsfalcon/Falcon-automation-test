package main.java.dart.pageEvents;

import main.java.utils.DatabaseConnection;
import main.java.utils.XLUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static test.java.BaseTest.driver;

public class GetCardDetailsEvents {
    WebDriver ldriver;

    public GetCardDetailsEvents(WebDriver rdriver) throws InterruptedException {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }
    public void GetCardData() throws IOException {
        dbQuery(DatabaseConnection.connectDB());
    }
    public void dbQuery(Connection con) throws IOException {

        Statement smt = null;
        String path=System.getProperty("user.dir")+"/datafiles/"+"cardData.xlsx";
        try {
            smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * from kite_card.card where enterprise_id='lalitgift15' and card_status='ACTIVE' and online_channel_status='ENABLED' and pos_channel_status='ENABLED'");

            // workbook object
            XSSFWorkbook workbook = new XSSFWorkbook();
            // spreadsheet object
            XSSFSheet spreadsheet = workbook.createSheet("Sheet1");
            // creating a row object
            XSSFRow row;
            // This data needs to be written (Object[])
            Map<String, Object[]> studentData = new TreeMap<String, Object[]>();


            int count = 0;
            while (rs.next()) {
                count++;
                System.out.println("Count of row "+count);
                System.out.print(rs.getObject(1));
                studentData.put(count+"",new Object[] {rs.getObject(1)});
                System.out.println();
            }
            //* ****************** Set Data in Excel***************************** *//
            Set<String> keyid = studentData.keySet();

            int rowid = 1;
            for (String key : keyid) {

                row = spreadsheet.createRow(rowid++);
                Object[] objectArr = studentData.get(key);
                int cellid = 0;

                for (Object obj : objectArr) {
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String)obj);
                }
            }

            // .xlsx is the format for Excel Sheets...
            // writing the workbook into the file...
            FileOutputStream out = new FileOutputStream(new File(path));

            workbook.write(out);
            out.close();


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
