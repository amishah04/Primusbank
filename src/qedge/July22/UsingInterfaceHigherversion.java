package qedge.July22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingInterfaceHigherversion {

	public static void main(String[] args) throws Throwable, Throwable {
		// read path of the excel file
				FileInputStream fi;
				try {
					fi = new FileInputStream ("/Users/gauravsalkar/Desktop/Ami/Sample.xlsx");
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
						// typecasting for int cell DT
						int password = (int )ws.getRow(i).getCell(1).getNumericCellValue();
						// write text into result column 
						
						ws.getRow(i).createCell(2).setCellValue("pass");
						
					}

					// close file
					fi.close();
					// output into new workbook
					
					FileOutputStream fo;
					try {
						fo = new FileOutputStream("/Users/gauravsalkar/Desktop/Ami/Results.xlsx");
						wb.write(fo);
						fi.close();
						wb.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				

	}

}
