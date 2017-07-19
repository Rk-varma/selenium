import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrower<Desired> {
@Parameters("brower")
@Test
public void dropdownTest(String b) throws MalformedURLException
{
	DesiredCapabilities Caps=null;
	if(b.equals("chrome"))
	{
		Caps=DesiredCapabilities.chrome();
		Caps.setPlatform(Platform.WINDOWS);
		
	}
	else
		if(b.equals("firefox"))
		{
			Caps=DesiredCapabilities.firefox();
			Caps.setBrowserName("firefox");
			Caps.setPlatform(Platform.WINDOWS);
		}
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub, caps"), null);
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.linkText("REGISTER")).click();
	WebElement drop=driver.findElement(By.name("country"));
	List <WebElement> dropdown=drop.findElements(By.tagName("option"));
	for(int i=0;i<dropdown.size();i++)
	{
		dropdown.get(i).click();
		if(dropdown.get(i).isSelected())
		{
			System.out.println(dropdown.get(i).getText()+"is active");
		}
		else
		{
			System.out.println(dropdown.get(i).getText()+"is inactive");
			
		}
		}
}
}
