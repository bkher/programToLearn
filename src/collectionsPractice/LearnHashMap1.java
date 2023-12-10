package collectionsPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class LearnHashMap1 {
	
	
	public static Map<String, Integer> marksMap;
	
	static {
		marksMap = new HashMap<String, Integer>();
		marksMap.put("A", 80);
		marksMap.put("B", 100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(marksMap.get("A"));
		
		Map<String, String> map1 = Collections.singletonMap("test", "abc");
		System.out.println(map1.get("test"));
		
	
		
	}

}
