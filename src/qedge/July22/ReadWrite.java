package qedge.July22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable {
		
		// Read path of excel file 
		FileInputStream fi = new FileInputStream ("/Users/gauravsalkar/Desktop/Ami/Sample.xlsx");
		
		// get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook (fi);
		
		// get sheet from workbook
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		// count number of rows
		int rowcount = ws.getLastRowNum();
		System.out.println("Nos of rows" + rowcount);
		
		// read all rows first column 
		
		for (int i = 1; i <=rowcount; i++)
		{
			//Read username and password cells -  and all rows second column
			
			
			String usernmae = ws.getRow(i).getCell(0).getStringCellValue();
			String password = ws.getRow(i).getCell(1).getStringCellValue(); 
			System.out.println(usernmae + " " +password );
			
			// write some text into results cell 
			
			ws.getRow(i).createCell(2).setCellValue("I am learning Java");
			
		}
		
		// close fi file
		fi.close();
		// write into new File
		
		FileOutputStream fo = new FileOutputStream ("/Users/gauravsalkar/Desktop/Ami/ResultsPB.xlsx");
		// create new workbook
		
		wb.write(fo);
		
		fo.close();
		wb.close();
		
		
		
			
		
		
		
		
		
	}

}
