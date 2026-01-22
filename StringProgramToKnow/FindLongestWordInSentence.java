package StringProgramToKnow;

import java.util.HashMap;
import java.util.Map;

public class FindLongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "i am gong to change jo in twenty twenty six for sure";
		
		int max =0;
		
		String []strArr = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<strArr.length;i++) {
			int len = strArr[i].length();
			if(len>max) {
				max=len;
			}
			map.put(strArr[i], len);
		}
		System.out.println(max);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() ==max) {
				System.out.println("longest word in senetence is : "+ entry.getKey());
				
			}
		}

	}

}
