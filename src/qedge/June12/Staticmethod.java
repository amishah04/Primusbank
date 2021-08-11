package qedge.June12;

public class Staticmethod {

	public static int x,y,z; // global variables when written under classname
	public static double a,b,c;
	
	public static void addition ()
	{
		// int x,y,z; if declared under method - called local variable and can be used only in that method
		x=857475;
		y = 3859;
		z = x+y;
		System.out.println("Addition is " + z);
	}
	
	public static void multiplication()
	{
		x = 3489;
		y= 24;
		z = x*y;
		System.out.println("Multiplication" + z);
	}
	
	public static void floatingdivision()
	{
		a = 35898504;
		b = 94893;
		c = a/b;
		System.out.println("Division" + c);
	}
	
	// Non Static- Method
	public void substraction()
	{
		
		x = 398594;
		y = 434;
		z = x-y;
		System.out.println("Subtraction" + z);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // static method - so can call with classname - Staticmethod no need for object creation
		
		Staticmethod.addition();
		Staticmethod.multiplication();
		Staticmethod.floatingdivision();
		
		// call with method name also 
		addition();
		multiplication();
		floatingdivision();
		
		
		// Non Static  - create reference object n then call on the  method
		
		Staticmethod NSM = new Staticmethod();
		NSM.substraction(); // calling non static method
		
		// Non static method can also call static method also 
		
		NSM.addition();
		NSM.multiplication();
		NSM.floatingdivision();
		
	}

}
