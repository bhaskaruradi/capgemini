package conditional;

import java.util.Scanner;

public class BigOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		System.out.println("enter num2");
		System.out.println("enter num2");
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("n1 is big"+n1);
			}
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is big"+n2);
		}
		else if(n1==n2 && n1==n3 && n2==n3)
		{
			System.out.println("no comparision takes place"+n1);
		}
		else 
		{
			System.out.println("n3 is big"+n3);
		}
		
}
}