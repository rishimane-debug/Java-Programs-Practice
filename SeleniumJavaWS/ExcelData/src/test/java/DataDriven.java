import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//Creating FileInputStream class object to read excel file
		FileInputStream file = new FileInputStream("C:\\Eclipse\\SeleniumJavaWS\\Demodata.xlsx");
		//Crating object of xssfworkbook
		XSSFWorkbook wb = new XSSFWorkbook(file);
				 XSSFSheet sheet = wb.getSheet("records");
				 String username = sheet.getRow(1).getCell(0).getStringCellValue();
				 String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		
		
		
						ChromeDriver driver = new ChromeDriver();
						driver.get("https://www.saucedemo.com/");
						driver.findElement(By.xpath("//input[@id ='user-name']")).sendKeys(username);
						driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
						Thread.sleep(2000);
						driver.findElement(By.cssSelector("input#login-button")).click();
	}

}
