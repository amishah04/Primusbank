package qedge.July2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteText {

	public static void main(String[] args) throws Throwable {
		
		// System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		// create new file
		File f = new File("/Users/gauravsalkar/Desktop/Eveng.txt");
		
		// want to write in the file 
		FileWriter fw = new FileWriter(f);
		
		// create physical memory
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		// write 
		bw.write("I am so lazy to practice");
		bw.newLine();
		bw.write("But I want job in top mnc");
		bw.newLine();
		bw.write("with 10l package");
		bw.flush();
		bw.close();
	}

}
