package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Users\\hp\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("total rows is  "+((rowcount)+1));
		
		for(int i=0;i<=rowcount;i++) {
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test Data from row "+i+ " is  "+data0);
		}

		for(int i=0;i<=rowcount;i++) {
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Test Data from row "+i+ " is  "+data1);
		}

		wb.close();

	}

}
