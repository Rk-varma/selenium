import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriventesting2 {
	public class datadriven1 {
		FirefoxDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.linkText("REGISTER")).click();
		}
		@Test
		public void registratio() throws IOException
		{
			FileInputStream file=new FileInputStream(".//src//com//projectname//resultexcelfile//links.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(file);
			XSSFSheet ws=wb.getSheet("sheet1");
			int rowcount=ws.getLastRowNum();
			for(int i=1;i<rowcount;i++)
			{
				Row r=ws.getRow(i);
				String linkname=r.getCell(0).getStringCellValue();
				try
				{
					driver.findElement(By.linkText(linkname)).click();
					String acturl=driver.getCurrentUrl();
					r.createCell(2).setCellValue(acturl);
					String expurl=r.getCell(1).getStringCellValue();
					if(expurl.equals(acturl))
						r.createCell(3).setCellValue("passed");
					else
						r.createCell(3).setCellValue("filed");
					driver.navigate().back();
				}
				catch(Exception e)
				{
					r.createCell(3).setCellValue("link not found");
					
				}
		}
		FileOutputStream f=new FileOutputStream(".//src//com//projectname//resultexcelfile//links.xlsx");
		wb.write(f);
		driver.close();
		}

	}
}
