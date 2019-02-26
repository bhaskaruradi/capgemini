package Lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> ll = new ArrayList<Integer>();
      ll.add(15);
      ll.add(30);
      ll.add(56);
      ll.add(65);
      
      long start = System.currentTimeMillis();
     ll.add(3, 25);
     
     long end = System.currentTimeMillis();
     
     System.out.println("time:"+(end-start));
	}

	

}
