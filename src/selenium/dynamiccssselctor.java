package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamiccssselctor {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
	}
	@Test
	public void cssTest()
	{
		driver.findElement(By.cssSelector("input[id^='txtUser']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id$='Password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id*='LOGIN']")).click();
	}

}
