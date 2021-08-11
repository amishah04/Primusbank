package qedge.June12;

public class VoidandDataType {
public static void message () // when it doesnt return any value 
{
System.out.println("Message");	
}


// when method returns value 

public static int addition (int x, int y)
{
// dont pass values only argument 	
int z = x+ y;
return z;
}
 
public static String compareStrings(String str1, String str2)
{
String res =  " ";
if (str1.equalsIgnoreCase(str2))
	
{
res = "Strings are equal";	
}
else 
{
res = "Strings are not equal" ;
}
return res;
}

public static boolean compareboolean (int a, int b)
{
	if (a==b)

	{
		return true;
	}
	else 
	{
		return false;
		
	}


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoidandDataType.message();
		
		int c = VoidandDataType.addition(10,20);
		System.out.println(c); // c is holding z value;
		
		String result = VoidandDataType.compareStrings("India", "Hello");
		System.out.println(result);
		
		
		boolean res = VoidandDataType.compareboolean(20, 20);
		System.out.println(res);
		
				
				
		
		
		
		
		
		
		
		
	}

}
