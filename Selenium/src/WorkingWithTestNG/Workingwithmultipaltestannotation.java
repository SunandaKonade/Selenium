package WorkingWithTestNG;

import org.testng.annotations.Test;

public class Workingwithmultipaltestannotation {

	@Test(priority = 1)
	public void registration()
	{
		System.out.println("Registration Sucessful");
	}
	@Test (priority = 2)
	
	public void login()
	{
		System.out.println("login Sucessful");
		}
	@Test (priority = 3)
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


