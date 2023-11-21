package BrowserControlMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingToUrl {
	public static void main(String[] args) throws InterruptedException {
		//To open browser
		WebDriver driver = new ChromeDriver();
		
		//To Navigate to any url
		driver.get("https://www.google.com/");
		
		//To maximise browser
		driver.manage().window().maximize();
		
		//To fetch title
		String title=driver.getTitle();
		System.out.println(title);
		
		//To fetch Url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//wait
		Thread.sleep(2000);
		
		//To close browser
		driver.close();
		
	}

}
