package qedge.June11;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int x = 45; int y = 0 ; int z;
 z= x%y;
 System.out.println(z);
		} catch  (Throwable t) // throwable is super class then define by an object - t 
		
		{
			
			System.out.println(t.getMessage());
		// 	t.printStackTrace(); // print only error message 
		}
 
 double a = 8765, b = 8, c;
 c =a/b;
 System.out.println(c);
		 
	}

}
