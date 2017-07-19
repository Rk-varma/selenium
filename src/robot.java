import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class robot {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className()).click();
		driver.findElement(By.className()).click();
		Sleeper.sleepTightInSeconds(3);
		robot rb=new robot();
		rb.keypress(KeyEvent.VK_TAB);
		rb.keyrelase(KeyEvent.VK_TAB);
		rb.keypress(KeyEvent.VK_ENTER);
		rb.keyrelease(KeyEvent.VK_ENTER);


	}

}
