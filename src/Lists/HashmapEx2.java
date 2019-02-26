package Lists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapEx2 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		  
		  hashMap.put(101, "bhaskar");
		  hashMap.put(102, "bhas");
		  hashMap.put(103, "sure");
		  hashMap.put(104, "kar");
		 HashSet<String> hashSet = new HashSet<>(hashMap.values());
		 
		 HashSet<Integer> hashSet1 = new HashSet<>(hashMap.keySet());
			  
		
		  
		  System.out.println(hashSet);
		  System.out.println(hashSet1);
	
	
	
	}

}
