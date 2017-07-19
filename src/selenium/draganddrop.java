package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://Jqueryui.com/droppable/");
	}
	@Test
	public void dragAnddropTest()
	{
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
	action.dragAndDrop(source, target).build().perform();
	}
	

}
