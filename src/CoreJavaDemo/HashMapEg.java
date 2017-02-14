package CoreJavaDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEg {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Good");
		hm.put(2, "Morning");
		hm.put(43, "Evening");
		System.out.println(hm);
		System.out.println(hm.get(2));
		hm.remove(43);
		System.out.println(hm.get(43));
		
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()){
			Map.Entry mp = (Map.Entry)it.next();
			System.out.print(mp.getKey() + " ");
			System.out.println(mp.getValue());
			System.out.println(" ");
		}

	}

}
