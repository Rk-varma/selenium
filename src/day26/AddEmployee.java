package day26;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployee  extends BaseClass{
	@Test
	public void addEmpTest()
	{
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("sai");
		driver.findElement(By.id("middleName")).sendKeys("krishna");
		driver.findElement(By.id("lastName")).sendKeys("g");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("111");
		driver.findElement(By.id("btnSave")).click();
	}

}









