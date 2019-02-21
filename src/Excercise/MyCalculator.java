package Excercise;

import java.util.Scanner;

public class MyCalculator {
	class negException() throws Exception {
		System.out.println("n or p should not be zero");
	}
 long power(int[] base,int[] power1) {
	 for (int i = 0; i < base.length; i++) {
		 for (int j = 0; j < power1.length; j++) {
			if(base[i]>0 && power1[i]>0) {
				
			}
		} if(base[i]==0 && power1[i]==0) {
			try {
				throw new negException();
			}catch(Exception e) {
				
			}
		}
		
	}
	return Math(power(base[i],power1[i]));
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int base[] = new int[n];
      int power1[] = new int[n];
      for (int i = 0; i < base.length; i++) {
    	  int n1=sc.nextInt();
    	  base[i]=n1;
	}
      for (int i = 0; i < power1.length; i++) {
		int n2 = sc.nextInt();
		power1[i]=n2;
	}
	}

}
