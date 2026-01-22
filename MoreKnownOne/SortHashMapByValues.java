package MoreKnownOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Orange", 30);
        map.put("Mango", 20);
        
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        
        list.sort(Map.Entry.comparingByValue());
        
        Map<String, Integer> sortedmap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry: list) {
        	sortedmap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println(sortedmap);
	}

}
