package loginusingproptery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	FirefoxDriver driver;
	@BeforeTest()
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource");
	}
	@Test
	public void loginTest() throws IOException 
	{
		FileInputStream file=new FileInputStream("");
		Properties pr=new Properties();
		pr.load(file);
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys("admin");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.name(pr.getProperty("login"))).click();
		
	}

}
