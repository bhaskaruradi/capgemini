package Excercise;

import java.util.Scanner;

public class Diagonal {
	public static int difference(int mat[][],int n)
    {
  	  int d=0,d1=0;
	      for (int i = 0; i < n; i++) {
	    	  for (int j = 0; j < n; j++) {
	    		  if(i==j)
	    		  
	    			  d +=mat[i][j] ;
	    		 
				if (i = n-j-1) 
					d1 += mat[i][j];
				
    
    
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n;
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
	     
	      
			
		}
	}
