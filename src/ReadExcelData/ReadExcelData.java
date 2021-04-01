package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {

		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\hp\\Desktop\\Test.xlsx");
		System.out.println(excel.getData(02, 0, 1));
		
		
		
		
		
		
	}

}
