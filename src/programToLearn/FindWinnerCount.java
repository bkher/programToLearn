package programToLearn;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class FindWinnerCount {
	
	// [1,2,3,2,2,2]  >> 4 times 2
	// [1,2,1,2]  >> 2 times 1 and 2

	public void method1(int [] arrayNum) {
		int sizeOfArray = arrayNum.length;
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int count;
		for(int i =0;i<sizeOfArray;i++) {
			count=0;
			for(int j=0;j<sizeOfArray;j++) {
				if(arrayNum[i]==arrayNum[j]) {
					 count++;
				}
			}
			hashmap.put(arrayNum[i],count);
		}
		Iterator<Entry<Integer, Integer>> it1 = hashmap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<Integer, Integer> entry=it1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println(Collections.max(hashmap.values()));		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindWinnerCount fwc = new FindWinnerCount();
		int a[] = {1,2,1,2,3,2,2,2,1,1,1};
		fwc.method1(a);

	}

}
