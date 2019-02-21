package Excercise;

import java.util.Scanner;

public class Bricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
  int no = sc.nextInt();
  int sum=0;
  for (int i = 0; i < no; i++) {
	 
	  
		  sum = sum + i + i*2;
		  if(sum>= no)
		  {
			  if((sum-i*2)>=no) {
		 System.out.println("patlu");
			  break;
			  }
			  else {
				  System.out.println("motu");
				  break;
		  }
	  }
  }
	}
}

		  
	  

	


