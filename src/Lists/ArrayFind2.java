package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFind2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> ar =new ArrayList<Integer>();
	        int n = sc.nextInt();
	       
	        
	        ar.add(sc.nextInt());
	        ar.add(sc.nextInt());
	        
	        System.out.println(ar);
	        
	        if(ar.contains(n))
	        {
	        	System.out.println("yes");
	        }
	        else
	        	System.out.println("no");
	        
	}

}
