package Array;

import java.util.Scanner;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num;
       Scanner sc= new Scanner(System.in);
       int accNo[] = new int[5];
       
       for (int i = 0; i < accNo.length; i++) {
                  System.out.println("enter the element");
                  num = sc.nextInt();
                  accNo[i] = num;
	}
       for (int i = 0; i < accNo.length; i++) {
		System.out.println(accNo[i]);
	}
	}

}
