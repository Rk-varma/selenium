package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WEBDRIVERWAIT {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://hotstar.com");
	}
	@Test
	public void WaitTest()
	{
		WebDriverWait mywait=new WebDriverWait(driver,30);
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[3]/div[1]/div/div[1]/div"))).click();
		
		
	}
	
		
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
		
		
	}
	

}
