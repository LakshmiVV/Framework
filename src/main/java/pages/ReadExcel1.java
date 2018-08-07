package pages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel1 {
	@Test
	public Object[][] readExcel(String fileName) throws IOException {
		//open the excel file using file path
		XSSFWorkbook wBook=new XSSFWorkbook("./data/"+fileName+".xlsx");
		//open the particular sheet using name
		XSSFSheet sheet = wBook.getSheetAt(0);
		//get the row count
		int rowCount = sheet.getLastRowNum();
		//get cell count using the row header 
		short cellCount = sheet.getRow(0).getLastCellNum();
		//read the data from excel file using row and column count
		//we use i=1 because,we don't want the row 0,its the row header
		Object[][] data=new Object[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cellCount;j++) {
				try {
					XSSFCell cell = row.getCell(j);
					//since we need the data to be store in array from data[0][0],
					//we use data[i-1][j]
					data[i-1][j]=cell.getStringCellValue();
				} catch (Exception e) {
					data[i-1][j]="";
				}
			
			}
		}
		wBook.close();
		return data;
	}

}
