package MoreKnownOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 2, 3, 3, 3, 4};
		
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		for(int ar : arr) {
			if(!map.containsKey(ar)) {
				map.put(ar, new ArrayList<Integer>());
			}
			map.get(ar).add(ar);
		}
		System.out.println(map);
	}

}
