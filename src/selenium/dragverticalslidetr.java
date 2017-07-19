package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragverticalslidetr {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/#slider-vertical");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@Test
	public void silderTest()
	{
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"------"+y);
		action.dragAndDropBy(slider, 20, y).build().perform();
	}

}
