package conditional;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
		if(n%2==0)
		{
			n=n+10;
		}
		else
		{
			n=n+15;
		}
		System.out.println(n);
	}

}
