package WorkingWithTestNG;

import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.BeforeClass;

import com.google.common.cache.Weigher;

public class WorkingwithConfigureAnnotation2 {
	
	@BeforeClass
	public void launchBrowser()
	{
		WebDriverDecorator driver=new WebDriverDecorator();
		
		
		System.out.println("Launch the browser");
	}
	
	
	
	
	
	

}
