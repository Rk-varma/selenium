package testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectfight extends Baseclass{
	 @Test
	 public void selectfight()
	 {
	 	 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]")).click();
	 	 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]")).click();
	 	 driver.findElement(By.name("reserveFlights")).click();
	 	 
	 }
	 }





