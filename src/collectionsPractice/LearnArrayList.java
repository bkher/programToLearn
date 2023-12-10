package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,3,5,3,7,3));
		System.out.println(al1);
		
		al1.removeIf(num-> num%2==0);
		System.out.println(al1);
		
		
		al1.retainAll(Collections.singleton(3));
		System.out.println(al1);
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(3,4,6,1,2,4,6,7));
		System.out.println(al2);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>(al2.subList(3, 6));
		
		System.out.println(al3);

		Object arr[] = al3.toArray();
		System.out.println(arr.length);
		for(Object o: arr) {
			System.out.println(o);
		}
		
		
		List<String> arl = Collections.synchronizedList(new ArrayList<String>());
		
		arl.add("Mahesh");
		arl.add("1Mahesh");
		arl.add("Mahesh1");
		arl.add("2Mahesh");
		arl.add("Mahesh2");
		
		System.out.println(arl);
		
		
		synchronized (arl) {
			Iterator<String> it = arl.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());		
			}
		}
		
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,3,5,4,5,4,7,9));
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(arr1);
		System.out.println(lhs);
		
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,3,5,4,5,4,7,9));
		List<Integer> uniquelist = arr2.stream().distinct().collect(Collectors.toList());
		System.out.println(uniquelist);
				
	}

}
