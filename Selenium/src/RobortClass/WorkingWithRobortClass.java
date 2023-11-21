package RobortClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRobortClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	driver.findElement(By.id("APjFqb")).click();
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	
	
	
	}

}
