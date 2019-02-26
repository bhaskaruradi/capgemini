package Lists;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
  
  hashMap.put(101, "bhaskar");
  hashMap.put(102, "bhas");
  hashMap.put(103, "sure");
  hashMap.put(104, "kar");
  
  for (Map.Entry m : hashMap.entrySet()) {
	System.out.println(m.getKey()+" " + m.getValue());
}
	}

}
