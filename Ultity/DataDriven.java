package Ultity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	XSSFWorkbook workbook;

	public DataDriven() {
		FileInputStream fileReader = null;
		try {
			fileReader = new FileInputStream("./src/test/resources/ExcelData/FCdata.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			workbook = new XSSFWorkbook(fileReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getStringData(String Sheetname, int Row, int Column) {
		XSSFCell cell = workbook.getSheet(Sheetname).getRow(Row).getCell(Column);
		DataFormatter dataFormatter = new DataFormatter();
		String Data = dataFormatter.formatCellValue(cell);
		return Data;
	}
}
