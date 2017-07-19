package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rightcickproram {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void rightclickTest()
	{
		Actions action=new Actions(driver);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		action.contextClick(gmail).sendKeys("L").build().perform();
	}

}
