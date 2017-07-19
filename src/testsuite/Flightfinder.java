package testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Flightfinder extends Baseclass{
	@Test
	public void fightfinder()
	{
		driver.findElement(By.name("passCount")).sendKeys("2");
		driver.findElement(By.name("findFlights")).click();
	}

}
