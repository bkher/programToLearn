package StringProgramToKnow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindLongestPalindrome {
	
	
	static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "babadmadam";
		
		List<String> palindromes = new ArrayList();

        // Step 1: Generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                	palindromes.add(sub);
                }
                
            }
	}

        
      //  System.out.println(palindromes);
        
        String strrrr=Collections.max(palindromes, Comparator.comparingInt(String::length));
        
        System.out.println(strrrr);
        
}
}
