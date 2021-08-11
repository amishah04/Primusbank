package qedge.July22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		// read path of excel file
		FileInputStream fi = new FileInputStream ("/Users/gauravsalkar/Desktop/Ami/PrimusBank.xlsx");
		
		// get wb from file
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		
		// get sheet from wb
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		// get first row from sheet
		XSSFRow row = ws.getRow(0);
		
		// count nos. of rows in a sheet
		int rowcount = ws.getLastRowNum();
		
		// nos of cells in first row 
		int colcount = row.getLastCellNum();
		System.out.println("Nos of rows :" + rowcount + "  "+ " Nos of cell:" + colcount);
		
		// print second row first cell data
		
		String username =  ws.getRow(2).getCell(0).getStringCellValue();
		
		// print second row second cell data
		
		String password = ws.getRow(2).getCell(1).getStringCellValue();
		
		// print 
		System.out.println(username + "  "+ password);
		
		// close file
		fi.close();
		// close workbook

		wb.close();
		

	}

}
