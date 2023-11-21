package DataDrivenMethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingwithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\konad\\OneDrive\\Desktop\\Desktop\\Sunanda personal\\Selenium QSIPDER  Notes by Rakesh\\Book2.xlsx");
Workbook book = WorkbookFactory.create(fis);

Sheet sh=book.getSheet("Sheet1");
Row row=sh.getRow(0);
Cell cell=row.getCell(0);

	// String value=cell.getStringCellValue();
	// System.out.println(value);
	
	// double value1= sh.getRow(2).getCell(0).getNumericCellValue();
	// System.out.println(value1);
	
String value1=sh.getRow(0).getCell(0).toString();
System.out.println(value1);

String value2=sh.getRow(2).getCell(0).toString();
System.out.println(value2);
	
	}

	
	

}
