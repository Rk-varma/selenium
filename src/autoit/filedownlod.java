package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class filedownlod {

	public static void main(String[] args) throws IOException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://seleniumq.org");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Download")).click();
	driver.findElement(By.linkText("3.4.0")).click();
	Sleeper.sleepTightInSeconds(3);
	
	
	}



	}


