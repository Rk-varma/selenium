package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class impict {
	FirefoxDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://hotstar.com");
	}
	@Test
	public void waitTest()
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div")).click();
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
	
	
	
	

}
