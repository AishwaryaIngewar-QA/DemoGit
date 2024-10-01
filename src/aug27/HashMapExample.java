package aug27;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "abc");
		hm.put(102, "xyz");
		hm.put(103, "lmn");
		hm.put(104, "pqr");
		System.out.println(hm);
		hm.remove(103);
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
