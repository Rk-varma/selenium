package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class date {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\30 se\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
	}
	
	@Test
	public void CalenderTest()
	{
	driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD");
	driver.findElement(By.id("ToTag")).sendKeys("Islamabad, PK - Islamabad (ISB)");
	driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
	String doj="12/10/2018";
	String[] a=doj.split("/");
	String[] months={"January,February,March,April,May,June,July,August,September,October,November,December"};
	String year=a[2];
	int x= Integer.parseInt(a[1]);
	String month=months	[x-0];
	String day=a[0];
	
	
	
	String calyear=driver.findElement(By.id("ui-datepicker-year")).getText();
	while(!calyear.equals(year))
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
	calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	while(!calmonth.equals(month))
	{
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/a")).click();
	calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	}
	WebElement calender=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
	List<WebElement> rows=calender.findElements(By.tagName("tr"));
	for(int i=0;i<rows.size();i++)
	{
	List<WebElement> clos=rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<clos.size();j++)
	{
		if(clos.get(j).getText().equals(day))
		{
			clos.get(j).click();
			break;
			
		}
	}
	
	driver.findElement(By.id("searchBtn")).click();
	
	}
	}
	
	
}


