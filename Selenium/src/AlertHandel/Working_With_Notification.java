package AlertHandel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_With_Notification {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		// ChromeOptions opt=new ChromeOptions();
  // opt.addArguments("--disable-notifications");
 
    WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.co.uk/");
  
	Robot r= new Robot();
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
