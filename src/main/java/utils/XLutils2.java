package main.java.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class XLutils2 {

    public static void readXL(String xlFileName) throws IOException {
        /*TO READ DATA FROM THE EXCEL*/
        String excelFilePath = (System.getProperty("user.dir") + File.separator + "datafiles" + File.separator + xlFileName);
        FileInputStream inputStream = new FileInputStream(excelFilePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet =workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        int cols=sheet.getRow(1).getLastCellNum();

        String authTokenOld = "";

        for(int r=0;r<rows;r++ )
        {
            XSSFRow row =sheet.getRow(r);

            for (int c=0;c<cols;c++)
            {
                XSSFCell cell = row.getCell(c);
                switch (cell.getCellType())
                {
                    case STRING:
                        authTokenOld = cell.getStringCellValue();
                        System.out.println(authTokenOld); break;

                }
            }
        }

    }
}
