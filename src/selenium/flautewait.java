package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flautewait {
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
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(40,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div")));
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[3]/div[1]/div/div[1]/div"))).click();
		
		
						
}
	
		
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
		
		
	}
	


}
