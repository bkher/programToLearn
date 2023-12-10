package programToLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class findLongestSubstringThatDoeNottContainDuplicateCharacter {
	
	public void method1(String str1) {
		String str=str1.toLowerCase();
		
		String[] strArray = str.split(" ");
		int lengthOfstrArray = strArray.length;
		
		HashMap<Integer,String> lengthOfSubscring = new HashMap<Integer,String>();
		
		for(int i=0;i<lengthOfstrArray;i++) {
			char[] substringArrayInChar = strArray[i].toCharArray();
			
			Boolean isEqual = false;
	        
	        for(int j=0;j<=substringArrayInChar.length;j++) {
	        	for(int k=j+1;k<=substringArrayInChar.length-1;k++) {
	        		if(substringArrayInChar[j]==substringArrayInChar[k]) {
	        			isEqual =true;
	        			break;
	        		}
	        	}
	        }
						
	        if (isEqual==false) {
	        	int lengthofSubstring = substringArrayInChar.length;
				lengthOfSubscring.put(lengthofSubstring,strArray[i]);
			}
		}
		
		int max = Collections.max(lengthOfSubscring.keySet());
		System.out.println("Longest substring character: "+max);
		System.out.println("Longest substring without duplicate character: "+lengthOfSubscring.get(max));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLongestSubstringThatDoeNottContainDuplicateCharacter fls= new findLongestSubstringThatDoeNottContainDuplicateCharacter();
		fls.method1("Plyaerightp is better than Selanium");
	}

}
