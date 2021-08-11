package qedge.June11;

import java.util.ArrayList;

public class ArrayGetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> str = new ArrayList <String> ();
str.add("Sun");
str.add("Mon");
str.add("Tues");
str.add("Wed");
str.add("Thurs");
str.add("Fri");
str.add("Sat");

System.out.println(str.get(5));

for (String a:str)
{
	System.out.println(a);
}
	}

}
