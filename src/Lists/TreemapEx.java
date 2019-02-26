package Lists;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreemapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
		  
		  treeMap.put(101, "bhaskar");
		  treeMap.put(103, "bhas");
		  treeMap.put(102, "sure");
		  treeMap.put(104, "kar");
		  
		  for (Map.Entry m : treeMap.entrySet()) {
			System.out.println(m.getKey()+" " + m.getValue());
		}
	}

}
