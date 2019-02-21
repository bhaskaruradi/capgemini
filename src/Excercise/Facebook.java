package Excercise;

import java.util.Scanner;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int  L= 45;
       int N = 1;
       Scanner sc =new Scanner(System.in);
       int Width = sc.nextInt();
       int Height = sc.nextInt();
       
       if(Width<= L && Height<= L)
       {
    	   System.out.println("UPLOAD ANOTHER");
       }
       else if((Width<= L && Height> L) || (Width> L && Height<=L))
       {
    	   System.out.println("ACCEPTED");
       }
       else
       {
    	   System.out.println("CROP IT");
       }
	}
	

}
