package qedge.July22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingInterface {

	public static void main(String[] args) throws Throwable {
	// read path of the excel file
		FileInputStream fi = new FileInputStream ("/Users/gauravsalkar/Desktop/Ami/Sample.xls");
	// get wb from file
		Workbook wb = WorkbookFactory.create(fi);
		
		// get sheet from wb 
		
		Sheet ws = wb.getSheetAt(0);
		// get row from sheet
		
		Row row = ws.getRow(0);
		
		// count rows and col
		
		int rowcount = ws.getLastRowNum();
		int celcount = row.getLastCellNum();
		
	// get all rows
		for (int i = 1; i<=rowcount; i++)
		{
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			String password = ws.getRow(i).getCell(1).getStringCellValue();
			// write text into result column 
			
			ws.getRow(i).createCell(2).setCellValue("pass");
			
		}

		// close file
		fi.close();
		// output into new workbook
		
		FileOutputStream fo = new FileOutputStream ("/Users/gauravsalkar/Desktop/Ami/Results.xls");
		wb.write(fo);
		fi.close();
		wb.close();
		
	}

}
