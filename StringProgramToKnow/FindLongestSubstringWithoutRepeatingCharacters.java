package StringProgramToKnow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "baba12dmadam242";
		
		List<String> palindromes = new ArrayList();

        // Step 1: Generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
              
                palindromes.add(sub);
            }    

	}
        int isDuplicateCount=0;
        int max=0;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0;i<palindromes.size();i++) {
        	if(palindromes.get(i).length()>2) {
        		String str1 = palindromes.get(i);
        		isDuplicateCount=0;
        		for(int j=0;j<str1.length();j++) {
        			for(int k=j+1;k<str1.length();k++) {
        				if(str1.charAt(j)==str1.charAt(k)) {
        					isDuplicateCount++;
        					break;
        				}
        			}
        			if (isDuplicateCount > 0) {
                        break;
                    }
        			
        		}
        		
        		if(isDuplicateCount==0) {
        			map.put(str1, str1.length());
        			if(str1.length()>max) {
        				max=str1.length();
        			}
        		}
        			
        	}
        }
        
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
        	if(entry.getValue()==max) {
        		System.out.println(entry.getKey());
        	}
        }
	}
}
