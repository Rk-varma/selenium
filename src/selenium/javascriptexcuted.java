package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javascriptexcuted {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void alertTest()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('hiii rk');");
		Sleeper.sleepTightInSeconds(5);
		alerthandling();
	}
	public void alerthandling()
	{
		try
		{
			Alert myalert=driver.switchTo().alert();
			myalert.accept();
		}
		catch(Exception e)
		{
		}
		}
		
	}


