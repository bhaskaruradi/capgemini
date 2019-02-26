package Lists;

import java.util.HashSet;
import java.util.Iterator;

public class HashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet<Integer> hashSet = new HashSet<Integer>();
  // long start = System.currentTimeMillis();
   hashSet.add(21);
   hashSet.add(10);
   hashSet.add(25);
   hashSet.add(null);
   hashSet.add(25);
   hashSet.add(null);
   

   Iterator<Integer> iterator = hashSet.iterator();
   while(iterator.hasNext())
   {
	   System.out.println(iterator.next());
   }
  
  // System.out.println(end-start);
	}

}
