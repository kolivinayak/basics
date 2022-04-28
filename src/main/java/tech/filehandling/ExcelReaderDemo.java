package tech.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\vinayak.shankar.koli\\EclipseProj\\src\\main\\resources\\excelreaderdemo.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		/* this is to jump to specific cell
		 * String data0 = sheet1.getRow(10).getCell(2).getStringCellValue();
		 * 
		 * System.out.println("Data from excel is : " + data0);
		 */

		int rowcount = sheet1.getLastRowNum();

		for (int i = 0; i <= rowcount; i++) {
			String data1 = sheet1.getRow(i).getCell(0).getStringCellValue();
			String data2 = sheet1.getRow(i).getCell(1).getStringCellValue();
			String data3 = sheet1.getRow(i).getCell(2).getStringCellValue();
			System.out.println(data1 + " " + data2 + " " + data3);

		}

		wb.close();

		fis.close();
	}

}
