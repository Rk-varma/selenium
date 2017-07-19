import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class resultsexecel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\30 se\\results.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r;
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http:\\newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<dropdown.size();i++)
		{
			r=ws.createRow(i);
			r.createCell(0).setCellValue(dropdown.get(i).getText());
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				r.createCell(1).setCellValue("passes");
			}
				else
				{
					r.createCell(1).setCellValue("failed");
				}
		}
		FileOutputStream f=new FileOutputStream("E:\\30 se\\results.jjxlsx");
		wb.write(f);
		}
	}

