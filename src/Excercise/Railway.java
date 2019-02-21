package Excercise;

import java.util.Scanner;

public class Railway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
   int mod = n%12;
   switch(mod)
   {
   case 0:
	   System.out.println("seatno" + (n-11) + "WS");
	   break;
	   
   case 1:
	   System.out.println("seatno" + (n+11) + "WS");
	   break;
	   
   case 2:
	   System.out.println("seatno" + (n+9) + "MS");
	   break;
	   
   case 11:
	   System.out.println("seatno" + (n-9) + "MS");
	   break;
	   
   case 3:
	   System.out.println("seatno" + (n+7) + "AS");
	   break;
	   
   case 10:
	   System.out.println("seatno" + (n-7) + "AS");
	   break;
	   
   case 4:
	   System.out.println("seatno" + (n+5) + "AS");
	   break;
	   
   case 9:
	   System.out.println("seatno" + (n-5) + "AS");
	   break;
	   
   case 5:
	   System.out.println("seatno" + (n+3) + "MS");
	   break;
	   
   case 8:
	   System.out.println("seatno" + (n-3) + "MS");
	   break;
	   
   case 6:
	   System.out.println("seatno " + (n+1) + " WS");
	   break;
	   
   case 7:
	   System.out.println("seatno" + (n-1) + "WS");
	   break;
   }
	}

	
	

}
