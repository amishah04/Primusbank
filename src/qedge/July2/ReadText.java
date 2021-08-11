package qedge.July2;

import java.io.*;

public class ReadText {

	public static void main(String[] args) throws Throwable {
		FileReader FR = new FileReader("/Users/gauravsalkar/Desktop/Info_1.txt");
		
		// allocate memory
		BufferedReader bw = new BufferedReader(FR);
		
		// while loop to read line by line
		String str =  "";
		
		while((str=bw.readLine())!=null)
		{
			System.out.println(str);
			
		}
		Thread.sleep(2000);
		bw.close();
			
	}

}
