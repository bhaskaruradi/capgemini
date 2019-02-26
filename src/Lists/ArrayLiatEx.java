package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLiatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> bl = new ArrayList<Integer>();
		
		bl.add(26);
		bl.add(25);
		bl.add(5);
		
		bl.add(1, 8);
		
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        al.add(123);
        al.add(25);
        al.addAll(bl);
        Collections.sort(al);
         System.out.println(al);
         
         Iterator<Integer> iterator = al.iterator();
         while(iterator.hasNext())
         {
        	 System.out.println(iterator.next());
         }
         
        
         
	}

}
