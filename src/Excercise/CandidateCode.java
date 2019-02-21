package Excercise;

import java.math.*;
	import java.util.Scanner;
	public class CandidateCode
	{
	  public static void main (String[]args)
	  {
	    // Input the matrix
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the size of the square matrix:");
	    int size = input.nextInt(), lsum =0, rsum =0;
	   // int size = input.nextInt();
	    int [][]a = new int [size][size];
	     for (int i=0; i<size; i++)
	    {
	      for (int j=0; j<size;j++)
	      {
	        a[i][j] = input.nextInt();
	      }
	    }
	      
	
	    for (int i=0; i<size; i++)
	    {
	    	int j;
			if (i==j)
		          lsum = lsum + a[i][j];
	    	
	      for (int j=0; j<size;j++)
	      {
	         if ((i+j)==(size-1))
	         rsum = rsum + a[i][j];
	         
	        else
	          continue;
	      }
	    }
	     
	    System.out.println ("Left Diagonal Sum= "+lsum);
	    System.out.println ("Right Diagonal Sum= "+rsum);                    
	  
	
	
	
	


	}
	}


