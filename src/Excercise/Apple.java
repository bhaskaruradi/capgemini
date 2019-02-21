package Excercise;

import java.util.Scanner;

public class Apple {

	
	
	static void countApplesAndOranges(int s,int t,int a,int b,int[] apples,int[] oranges)
	{
		//int d=0;
		//int g=0;
		for (int i = 0; i < apples.length; i++) {
			if(apples[i]>0) {
				int d = s+i;
			}
		}
		for (int i = 0; i < oranges.length; i++) {
			if(oranges[i] < 0) {
				int g= t+i;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
        int []apples = new int[n];
        int []oranges = new int[n];
       for (int i = 0; i < oranges.length; i++) {
		 oranges[i] = n;
	}
       for (int i = 0; i < apples.length; i++) {
		apples[i] = n;
	}
       countApplesAndOranges(7, 11, 5, 15, apples, oranges);
       char[] d = null;
	System.out.println(d);
       char[] g = null;
	System.out.println(g);
	}
     
}
