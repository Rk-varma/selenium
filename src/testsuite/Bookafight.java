package testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bookafight extends Baseclass{
	@Test
	public void bookfight()
	
	{
	driver.findElement(By.name("passFirst0")).sendKeys("rkvarma");
	
			driver.findElement(By.name("billCountry")).sendKeys("INDIA");	
					driver.findElement(By.name("buyFlights")).click();
	}

}





