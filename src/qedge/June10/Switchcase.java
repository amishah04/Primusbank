package qedge.June10;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
		 
		
		String course ="Manual";
  switch (course.toUpperCase()) 
  {
  case "MANUAL" : System.out.println("Course is present"+ course); break;
  case "AUTOMATION" : System.out.println("Course is present"+ course);break;
  case "JAVA" : System.out.println("Course is present"+ course); break;
  case "SELENIUM" : System.out.println("Course is present"+ course); break;
  case "SALESFORCE" : System.out.println("Course is present"+ course);break;
  default : System.out.println("Course is not present"+ course); break;
  }
  
	}

}
