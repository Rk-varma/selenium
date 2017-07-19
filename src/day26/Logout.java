package day26;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout  extends BaseClass{
	
	@Test
	public void logoutTest()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
