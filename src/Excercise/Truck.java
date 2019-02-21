package Excercise;

import java.util.Scanner;

public class Truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            String s=sc.next();
            
            if(s.contains("A") || s.contains("E") || s.contains("I") || 
    			 s.contains("U") || s.contains("O") || s.contains("Y")) {
    			System.out.println("invalid");
	}
            else {
            	int sum=Integer.valueOf(s.charAt(0)) + Integer.valueOf(s.charAt(1));
            	if(sum % 2==0)
            	{
            		sum=Integer.valueOf(s.charAt(4)) + Integer.valueOf(s.charAt(5));
            	}
            	if(sum %2 ==0)
            	{
            		sum=Integer.valueOf(s.charAt(5)) + Integer.valueOf(s.charAt(7));
            	}
            	if(sum %2 == 0)
            	{
            		sum=Integer.valueOf(s.charAt(7)) + Integer.valueOf(s.charAt(8));
            		System.out.println("valid");
            	}
            	else 
            	{
            		System.out.println("invalid");
            	}
            	
            }
}
}
