package Array;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	       Scanner sc= new Scanner(System.in);
	       System.out.println("enter rows");
	       System.out.println("enetr colums");
	       int row = sc.nextInt();
	       int col = sc.nextInt();
	       int mat[][] = new int[row][col];
	      for (int i = 0; i < row; i++) {
	    	  for (int j = 0; j < col; j++) {
	    		  System.out.println("enter the element");
	    		  num = sc.nextInt();
	    		  mat[i][j] = num;
				
			}
			
		} 
	       
	      for (int i = 0; i < row; i++) {
	    	  for (int j = 0; j < col; j++) {
	    		  
	    		  System.out.print(mat[i][j] + " ");
				
			}
			System.out.println();
		} 
	       
	}

}
