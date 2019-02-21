package Excercise;

import java.util.Scanner;

public class Decimal {

	
	
	static void plusMinus(int[] a) {
		double positive=0,negative=0,zero=0;
		float f = a.length;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0)
				positive++;
			else if(a[i] == 0)
				zero++;
			else if(a[i] < 0)
				negative++;
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
    int num;
      for (int i = 0; i < n; i++) {
    	  num = sc.nextInt();
    	 arr[i] = num;
      }
		plusMinus(a);
	//}
}

}
