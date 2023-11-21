package WorkingWithTestNG;

import org.testng.annotations.Test;

public class WorkingwithDependsOnMethod {
	
	@Test(priority = 1)
	public void registration()
	{
		System.out.println("Registration Sucessful");
	}
	@Test (dependsOnMethods="registration")
	
	public void login()
	{
		System.out.println("login Sucessful");
		}
	@Test (enabled = false)
	public void addToCart()
	{
		System.out.println("Product added to cart");
	}
	@Test (priority = 4)
	public void placeorder()
	{
		System.out.println("order placed Sucessful");
	}


}



