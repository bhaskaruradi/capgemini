package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar =new ArrayList<Integer>();
        
        ar.add(123);
        ar.add(25);
		
        System.out.println(ar.contains(123));
        ar.contains(2);
        
        System.out.println(ar);
	}

}
