package Excercise;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

public class Sotring {
	
	
	public static int[] acceptElements()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        System.out.println("enter the elements");
       int a[] = new int[n];
        int num;
        for (int i = 0; i < a.length; i++) {
		
        	a[i]=sc.nextInt();
			
        }
        return a;
	}
        public static int[] acceptElements1()
    	{
    		Scanner sc = new Scanner(System.in);
            System.out.println("enter the no of elements");
            int n = sc.nextInt();
            System.out.println("enter the elements");
        int b[] = new int[n];
        int num1;
        for (int i = 0; i < b.length; i++) {
        	b[i]= sc.nextInt();
			
        }
		return b;
   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   mergeArray(acceptElements(),acceptElements1());
	}
	private static void mergeArray(int a[],int b[]) {
		// TODO Auto-generated method stub
		 Arrays.sort(a);
 	    Arrays.sort(b);
 	   for (int i = 0; i < a.length; i++) {
 		   int[] merge = null;
		merge[i] = a[i];
			for (int j = 0; j < b.length; j++) {
				merge[j] = b[j];
				System.out.println(merge[i]);
				System.out.println(merge[j]);
			}
		}
 	   
 	   
	}
}
