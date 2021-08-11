package qedge.July23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	

	public static void main(String[] args) throws Throwable {
		// read path of the excel file
		FileInputStream fi = new FileInputStream ("/Users/gauravsalkar/Desktop/Ami/Sample.xlsx");
		
		Workbook wb = WorkbookFactory.create(fi);	
		Sheet ws = wb.getSheetAt(0);
		
		// count nos of rows
		int rowcount = ws.getLastRowNum();	
		System.out.println(rowcount);
		
		for (int i = 1; i<=rowcount; i ++)
		
		{
		
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			// second row is numeric datatype 
			
			if(wb.getSheet("Sheet1").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
			
			{
				// get integer type cell
				
				int celldata = (int)wb.getSheet("Sheet1").getRow(i).getCell(1).getNumericCellValue();
				
				// convert integer type into String type
				// valueof()will convert integer to string type data
				
				String password = String.valueOf(celldata);
				System.out.println(username +" "+ password);
			}
			fi.close();
			wb.close();
		}
		
		
		
	}

}
