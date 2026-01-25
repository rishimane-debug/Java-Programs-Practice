import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fil = new FileInputStream("C:\\Eclipse\\RestAssuredWS\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		
					int sheetNumber = workbook.getNumberOfSheets();
					
					for(int i = 0; i < sheetNumber; i ++)
					{
						if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
						{
							XSSFSheet sheet = workbook.getSheetAt(i);
							
							//identify TestCases column by scanning the entire 1st row
							
						Iterator<Row> rows	= sheet.iterator();  //sheet is collection of rows
						
						Row firstrow = rows.next();
						
						Iterator<Cell> ce = firstrow.cellIterator(); // row is collection of cell
						int k = 0;
						int column = 0;
						
						while(ce.hasNext())
						{
							Cell value = ce.next();
							if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
							{
								column = k;
							}
							
							k++;
						}
						System.out.println(column);
						//once column is identified then scan entire testcase column to identify purchase testcase row.
						
						
						}
						
					}
	}

}
