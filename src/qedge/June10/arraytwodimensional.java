package qedge.June10;

public class arraytwodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // store data into two dimension
   String login [][] = new String[4][2]; // 4 rows 2 column
   
   login [0][0] = "Admin1";
   login [0][1] = "Ranga1";
   login [1][0] = "Admin2";
   login [1][1] = "Ranga2";
   login [2][0] = "Admin3";
   login [2][1] = "Ranga3";
   login [3][0] = "Admin4";
   login [3][1] = "Ranga4";
  
   System.out.println("Nos of rows:" + login.length);
   System.out.println("Nos of column in a row:" + login[0].length);
   // iterate all rows
   
   for (int i= 0; i<login.length; i++) 
   {
	   
	   // iterate all cells
	   for (int j = 0; j<login[i].length; j++)
	   {
		   System.out.println(login[i][j] + "\t");
	   }
	   System.out.println();
   }
   
	}

}
