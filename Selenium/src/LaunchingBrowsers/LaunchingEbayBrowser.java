package LaunchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEbayBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.co.uk/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
	    String url=driver.getCurrentUrl();
		System.out.println(url);
	Thread.sleep(2000);
	driver.close();	
	
	}
}
