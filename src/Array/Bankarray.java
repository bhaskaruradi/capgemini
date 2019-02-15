package Array;

import java.util.Scanner;

public class Bankarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       long accNo = 0 ;
       long adhNum;
       long bal;
       long phNum;
     
       
       
       
       
       
       
       
       long cust1[] = new long[4];
       
    	   System.out.println("enter account num");
    	   accNo = sc.nextLong();
    	 
    	   
    	  
    	   System.out.println("enter adhar num");
    	   adhNum = sc.nextLong();
    	   //customerDetails[i] = adhNum;
    	   
    	   System.out.println("enter balance");
    	   bal = sc.nextLong();
    	   //customerDetails[i] = bal;
    	   
    	   System.out.println("enter phone num");
    	   phNum = sc.nextLong();
    	  // customerDetails[i] = phNum;
    	   
    	   long cust2[] = new long[4];
    	   
    	   System.out.println("enter account num");
    	   accNo = sc.nextLong();
    	 
    	   System.out.println("enter adhar num");
    	   adhNum = sc.nextLong();
    	   //customerDetails[i] = adhNum;
    	   
    	   System.out.println("enter balance");
    	   bal = sc.nextLong();
    	   //customerDetails[i] = bal;
    	   
    	   System.out.println("enter phone num");
    	   phNum = sc.nextLong();
    	  // customerDetails[i] = phNum;
		
    	   long kotak[][] = new long[2][];
    	   kotak[0] = cust1;
    	   kotak[1] = cust2;
    	   
    	   for (int i = 0; i < kotak.length; i++) {
    		   for (int j = 0; j < kotak[i].length; j++) {
				System.out.println(kotak[i][j] + " ");
			}
			System.out.println();
		}
      
       
		
	}
       
     
	}


