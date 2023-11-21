package DataDrivenMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingwithPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
FileInputStream fis=new FileInputStream("C:\\Users\\konad\\OneDrive\\Desktop\\Desktop\\Sunanda personal\\Selenium QSIPDER  Notes by Rakesh\\TestData.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	
	String value1= pobj.getProperty("url");
	System.out.println(value1);
	
	String value2= pobj.getProperty("un");
	System.out.println(value2);
	
	String value3= pobj.getProperty("pwd");
	System.out.println(value3);
	
	
	
	}

}
