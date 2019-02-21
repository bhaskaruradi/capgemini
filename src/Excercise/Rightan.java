package Excercise;

import java.util.Scanner;

public class Rightan {

	private static void pow(int hyp, int i) {
		int b=0;
		int h=0;
		int i1=b*b+h*h;
		// TODO Auto-generated method stub
		if(hyp*hyp==(i1))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc =new Scanner(System.in);
     System.out.println("enter the sides ");
      int b= sc.nextInt();
     // System.out.println("enter height");
      int h = sc.nextInt();
     // System.out.println("enter hypotenuse");
      int hyp = sc.nextInt();
       int i=0;
	pow(hyp,i);
	}
}
	
      
	
    

