package Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Candle {

	 static int birthdayCakeCandles(long[] arr)
	{
		int temp=0 ,count=0;
		int l=arr.length;
		Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==arr[l-1]) {
					count++;
				}
			}
			
			
		return count;
		}
		
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter age");
	       int n = sc.nextInt();
	        long []arr= new long[n];
	        System.out.println("enter candle array");
	        for (int i = 0; i < arr.length; i++) {
				n = sc.nextInt();
	        	arr[i] = n;
			}
	        int res=birthdayCakeCandles(arr);
	        System.out.println(res);
	}
	

}
