package basic;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number");
		short num1 = sc.nextShort();
		System.out.println("enter second number");
		short num2 =sc.nextShort();
		
		System.out.println("the addition is  "+(num1+num2));
		
	}

}
