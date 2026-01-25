import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String name = "Rushi";
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet("Workbook");
		
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		
		cell.setCellValue(name);

		
		FileOutputStream fis = new FileOutputStream("C:\\Eclipse\\SeleniumJavaWS\\ExcelData\\src\\test\\java\\Workbook.xlsx");
		book.write(fis);
		fis.close();
		book.close();
		System.out.println("Data written to Excel successfully");
	}

}
