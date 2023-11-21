import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlMethod {
	public static void main(String[] args) {
		
WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("file:///C:/Users/konad/Downloads/Multiple%20Windows.html");
		
		driver.findElement(By.xpath("//button[text()='Open Windows']")).click();
		//driver.close();// close only parent tab
		driver.quit(); // close entire tabs
	}
}
