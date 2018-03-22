package excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ParseExcel {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("temp/1.xlsx"));

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//获得总行数
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		//4得到Excel工作表的行
		XSSFRow row = sheet.getRow(0);
		short lastCellNum = row.getLastCellNum();
		System.out.println(lastCellNum);
		

	}

	
}
