package Excercise;

import java.util.Scanner;

public class Seven {

	public static int[] acceptElements()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        System.out.println("enter the elements");
       int a[] = new int[n];
        int num;
        for (int i = 0; i < a.length; i++) {
			num = sc.nextInt();
			a[i] = num;
        }
		return a;
       
	}
	
		static void pushSevenToEnd(int a[]) 
	    { 
			
		        int count = 0; 
		        
		        int n =0;
				for (int i = 0; i < n ; i++) {
		            if (a[i] != 0) 
		                a[count++] = a[i]; 
		        }
		        while (count < n) {
		            a[count++] = 0; 
		        }
		    } 
		  

	  
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	pushSevenToEnd(acceptElements());
	}

}
