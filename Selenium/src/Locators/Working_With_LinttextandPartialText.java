package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_LinttextandPartialText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//by using linkText
		//<a> tag conding for Linktext and partial link text
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		// by using partial LinkText
		driver.findElement(By.partialLinkText("password?")).click();
	}

}
