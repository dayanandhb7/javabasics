package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Users\\hp\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = 	wb.getSheetAt(1);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		sheet1.getRow(2).createCell(2).setCellValue("Fail");

		sheet1.getRow(3).createCell(2).setCellValue("Fail");

		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);

		
		
		
	}

}
