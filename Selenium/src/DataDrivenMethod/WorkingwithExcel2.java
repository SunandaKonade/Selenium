package DataDrivenMethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingwithExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\konad\\OneDrive\\Desktop\\Desktop\\Sunanda personal\\Selenium QSIPDER  Notes by Rakesh\\Book2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh= book.getSheet("Sheet2");
		//to get last row number
		int lastRow=sh.getPhysicalNumberOfRows();
		System.out.println("Last Row Number :"+lastRow);
		int lastCell= sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Last Cell Numbers : "+lastCell);
		
		
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
	String value= sh.getRow(i).getCell(j).toString();
				System.out.print(value+" ");
			}
		System.out.println();
		}
		

	}

}
