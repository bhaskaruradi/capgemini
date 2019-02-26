package Lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> treeSet = new TreeSet<Integer>();
		   
		   treeSet.add(21);
		   treeSet.add(10);
		   treeSet.add(25);
		  // treeSet.add(null);
		   treeSet.add(25);
		   //treeSet.add(null);
		   long start = System.currentTimeMillis();
		   Iterator<Integer> iterator = treeSet.iterator();
		   while(iterator.hasNext())
		   {
			   System.out.println(iterator.next());
		   }
		   long end = System.currentTimeMillis();
		   System.out.println(end - start);
	}

}
