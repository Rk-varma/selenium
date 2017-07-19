import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class loginusingexcel {
FirefoxDriver driver;
@Before()
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
}
@Test
public void loginTest()
{
	FileInputStream file=new FileInputStream()
Properties pr=new Properties();
	pr.load(file);
	driver.findElement(By.id(pr.getProperty("Username")).sendKeys("");
	driver.findElement(By.xpath(pr.getProperty("password")).sendKeys("");
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.name(pr.getProperty("login")).click();
	
}
}
