package qedge.june3;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// auto increment /decrement op
int i =10;
i++;

System.out.println("Increment by one"+ i);

int a = 10;
a+=2;
System.out.println("Increment by two" + a);

int b = 100;
b-=3;
System.out.println("Decrement by three" + b);

int c = 30;
c--;
System.out.println("Decrement by one" + c);
// arithematic op


String a1 = "Hydra";
String a2 ="bad";
System.out.println(a1+a2);
// Comparison operator

 int d= 100, e= 200, f= 100;
 System.out.println("a is equal to b" + (a==b));
 System.out.println("a is equal to c" + (a==c));
 System.out.println("a is less than b" + (a<b));
 System.out.println("b is less than a" + (b<a));
 System.out.println("b is greater than a" + (b>a));
 System.out.println("c is greater than a" + (c>a));
 System.out.println("a is not equal to b" + (a!=b));
 System.out.println("a is not equal to b" + (a!=b));
 
 // logical operators
 
 int g= 100, h= 200, j= 100;
 System.out.println(g==j && g<j);
 System.out.println(g==j && g>h);
 System.out.println(g<h || g==h );
 System.out.println(g>h || j==h);
 System.out.println(!(a==c));
 


	}

}
