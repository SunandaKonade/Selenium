package AlertHandel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class OkAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
       Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		
		String message=alt.getText();
		System.out.println(message);
		
		alt.accept();
		//driver.switchTo().alert().dismiss();
		
	}

}
