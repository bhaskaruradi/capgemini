package Excercise;

import java.util.Scanner;

public class Choclates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int no = sc.nextInt();
      while(no !=0) {
       int n= sc.nextInt();
       int m = sc.nextInt();
       
       if(m%n==0)
       {
    	   System.out.println("Yes");
    	   
       }
       else
       {
    	   System.out.println("no");
       }
       no--;
      }
	}

}
