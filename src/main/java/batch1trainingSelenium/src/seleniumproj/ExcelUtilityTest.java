package batch1trainingSelenium.src.seleniumproj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelUtilityTest {

	public static void main(String[] args) throws IOException {
		
		try {
//		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\selenium java\\Bhadur\\src\\test\\resources\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
        Workbook wb = new XSSFWorkbook("D:\\Tools\\selenium java\\SeleniumDemo.xlsx");
//		String Path = "D:\\Tools\\selenium java\\SeleniumDemo.xls";
//		Path.endsWith(".xlsx");
//		FileInputStream file = new FileInputStream("D:\\Tools\\selenium java\\SeleniumDemo.xls");
//		Workbook wb = new HSSFWorkbook(file);
//		
		Sheet sh = wb.getSheetAt(0);
		System.out.println("Sheet Name : " + sh.getSheetName());
//		Row row = sh.getRow(1);
//		Cell cell = row.getCell(1);
//		
	//	System.out.println("The cell value is : " + cell.getStringCellValue());
		
		int rowcount = sh.getLastRowNum();
		
		for (int i=0; i <= rowcount; i++) {
			Row row = sh.getRow(i);			
			
			int cellcount = row.getLastCellNum();
			 for (int j=0; j < cellcount; j++ ) {
				 Cell cell = row.getCell(j);
//				 if ((cell.getCellType().NUMERIC) != null)
//					 System.out.print(cell.getNumericCellValue());
//				 else
//					 System.out.print(cell.getStringCellValue());
				 System.out.print(cell);
				 System.out.print("  ");
				}
			 System.out.println(" ");
		}
		
		
		wb.close();
		}
		catch (Exception e) {
			System.out.println("Message");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
