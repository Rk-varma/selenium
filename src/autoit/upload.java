package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class upload {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://imgur.com");
	driver.findElement(By.className()).click();
	driver.findElement(By.className()).click();
	Sleeper.sleepTightInSeconds(3);
	java.lang.Runtime.getRuntime().exec()

	}

}
