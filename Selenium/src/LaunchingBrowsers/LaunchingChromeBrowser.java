package LaunchingBrowsers;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingChromeBrowser {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//path
		String path="./Drivers/chromedriver.exe";
       System.setProperty(key, path);
       ChromeDriver driver=new ChromeDriver();
       
       
}
}