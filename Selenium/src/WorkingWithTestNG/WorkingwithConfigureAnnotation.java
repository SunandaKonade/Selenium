package WorkingWithTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithConfigureAnnotation {

	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Establish the connection to our server");
		
	}
	@BeforeTest
public void beforeTest()
	{
		System.out.println("Establish the connection to Datam BASE");
		
	}
	@BeforeClass
public void beforeClass()
{
	System.out.println("Launch the browser");
}
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		System.out.println("To perform Login action");
		
	}
	@Test
	public void testCase01()
	{
		System.out.println("Test case 01");
		
	}
	
	@AfterMethod
	
	public void afterMethod()
	{
		System.out.println("To perform logout");
		
	}
	
	
@AfterClass
	
	public void afterClass()
	{
		System.out.println("TO CLOSE THE BROWSER");
		
	}

@AfterTest

public void afterTest()
{
	System.out.println("Disconnect from Data Base");
	
}

@AfterSuite

public void afterSuit()
{
	System.out.println("Dissconnect Server");
	
}
	
	
}



	

