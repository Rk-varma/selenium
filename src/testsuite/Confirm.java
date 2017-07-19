package testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Confirm extends Baseclass{
	@Test
	public void confirmflight()
	{
		String exptext="Your itinerary has been booked!";
		String acttext=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		if(exptext.equals(acttext))
			System.out.println("ticket booked");
		else
			System.out.println("ticket not booked");
		driver.close();
	}

}




