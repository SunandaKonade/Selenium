package DataDrivenMethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcelGenericMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\konad\\OneDrive\\Desktop\\Desktop\\Sunanda personal\\Selenium QSIPDER  Notes by Rakesh\\Book2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		

	}

}
