package Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest {
	
	static void Small(int a[],int n)
	{
		Arrays.sort(a);
		for (int j = 0; j < a.length; j++) {
			
				
		}
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        
      
        int ar[] = new int[n];
        int num;
        for (int i = 0; i < ar.length; i++) {
			num = sc.nextInt();
			ar[i] = num;	
		}
        System.out.println("enter position");
        int index = sc.nextInt();
        Small();
	}

}
