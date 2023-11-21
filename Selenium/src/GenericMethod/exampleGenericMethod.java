package GenericMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class exampleGenericMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//System.out.println(SumOfTwoNumber(5,20));	
		System.out.println(getDataFromProperties("pwd"));
}
public static int SumOfTwoNumber(int a, int b)
{
	int result=a+b;
	return result;
	

}
	public static String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\konad\\OneDrive\\Desktop\\Desktop\\Sunanda personal\\Selenium QSIPDER  Notes by Rakesh\\TestData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}

		
		
	
	
}
