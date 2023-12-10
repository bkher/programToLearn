package collectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> taluka = new HashMap<String, String>();
		taluka.put("Junagadh", "Mendarada");
		taluka.put("Ahmedabad", "avadi");
		taluka.put("Bhavngar", "Rajula");
		taluka.put("Dwarka", "Kalyanpur");
		taluka.put("Porbandar", "La,ba");
		taluka.put("Somnath", "Sutrapada");
		
		Iterator<String> it = taluka.keySet().iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			String value = taluka.get(key);
			System.out.println(key+" : "+value);
			
		}
		System.out.println();
		Iterator<Entry<String, String>> it1 = taluka.entrySet().iterator();
		
		while (it1.hasNext()) {
			Entry<String,String> entry=it1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		System.out.println();

		taluka.forEach((k,v) -> System.out.println(k+" : "+v));
		
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "one");
		map1.put(2, "two");
		map1.put(3, "three");
		map1.put(4, "fouur");
		map1.put(5, "five");
		
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(3, "three");
		
		map2.put(5, "five");
		
		
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "one");
		map3.put(2, "two");
		map3.put(3, "three");
		map3.put(4, "fouur");
		map3.put(5, "five");
		
		
		
		System.out.println(map2.equals(map1));
		System.out.println(map1.equals(map3));
		
		
	}

}
