package Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting2 {
	public static int[] acceptElements()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        System.out.println("enter the elements");
       int a[] = new int[n];
      
        for (int i = 0; i < a.length; i++) {
		
        	a[i]=sc.nextInt();
			
        }
        return a;
	}
	
	
public static int[] acceptElements1()
{
	Scanner scn = new Scanner(System.in);

            System.out.println("enter the no of elements");
            int n1 = scn.nextInt();
            System.out.println("enter the elements");
        int b[] = new int[n1];
        
        for (int i = 0; i < b.length; i++) {
        	b[i]= scn.nextInt();
			
        }
        return b;
}
 public static void segregate(int a[],int b[])
 {
	 int i;
	while(a[i]%2==0)
	 {
		 a[i]++;
	 }
	int j=0;
	while(b[j]%2 ==1)
	{
		b[j]++;
	}
	Arrays.sort(a);
	Arrays.sort(b);
	int arr[] = new int[n+n1];
	
     for (int i = 0; i < a.length; i++) {
    	 
         System.out.print(a[i]+" ");
    
 } 
     for (int j = 0; j < b.length; j++) {
		System.out.println(b[j]+" ");
	}
} 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         segregate(acceptElements(),acceptElements1());
	}

}
