package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static Object[][] getData(String path, String sheetName) throws IOException {
        FileInputStream src = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(src);
        XSSFSheet sheet = wb.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();   // number of rows
        int colCount = sheet.getRow(0).getLastCellNum(); // number of columns

        Object[][] data = new Object[rowCount][colCount];  

        for (int i = 1; i <= rowCount; i++) {   // start from row 1 (skip headers)
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                XSSFCell cell = row.getCell(j);
                data[i-1][j] = cell.toString(); // store as String
            }
        }
        wb.close();
        return data;
    }
}



