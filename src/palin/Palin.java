package palin;

import java.util.Scanner;

public class Palin {
	public static void main(String[] args) {
		Scanner sc=new Scanner();
		int n = sc.nextInt();
		int r;
		while (n!=0)
		{
			r=n%10;
			System.out.println(r);
			n=n/10;
		}
			
		
	}

}
