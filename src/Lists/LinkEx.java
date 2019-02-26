package Lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> ll = new ArrayList<Integer>();
     
     for (int i = 0; i < 10e5; i++) {
		ll.add(i);
	}
     long start = System.currentTimeMillis();
     
     for (int i = 0; i < 10e5; i++) {
    	 ll.add(3, 25);
 	}
     long end = System.currentTimeMillis();
     
     System.out.println("time taken in ms:"+(end-start));
	}

}
