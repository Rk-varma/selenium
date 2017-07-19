package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseover {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
	}
	@Test
	public void mouseoverTest()
	{
		Actions action=new Actions(driver);
		WebElement aboutYss=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img"));
	WebElement contactus=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
	action.moveToElement(aboutYss).moveToElement(contactus).build().perform();
	driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a")).click();
	
	}

}
