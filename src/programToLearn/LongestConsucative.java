package programToLearn;
import java.util.Arrays;


public class LongestConsucative {


	static int dp[][] = new int[1000][1000];

//This function mainly returns LCS(str, str) 
//with a condition that same characters at 
//same index are not considered. 
	static int findLongestRepeatingSubSeq(char X[], int m, int n) {

		if (dp[m][n] != -1) {
			return dp[m][n];
		}

		// return if we have reached the end of either string
		if (m == 0 || n == 0) {
			return dp[m][n] = 0;
		}

		// if characters at index m and n matches 
		// and index is different
		if (X[m - 1] == X[n - 1] && m != n) {
			return dp[m][n] = findLongestRepeatingSubSeq(X,
					m - 1, n - 1) + 1;
		}

		// else if characters at index m and n don't match
		return dp[m][n] = Math.max(findLongestRepeatingSubSeq(X, m, n - 1),
				findLongestRepeatingSubSeq(X, m - 1, n));
	}

	static char maxRepeating(String str)
    {
        int n = str.length();
        int count = 0;
        char res = str.charAt(0);
        int cur_count = 1;
 
        // Traverse string except last character
        for (int i = 0; i < n; i++)
        {
            // If current character matches with next
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                cur_count++;
 
            // If doesn't match, update result
            // (if required) and reset count
            else
            {
                if (cur_count > count)
                {
                    count = cur_count;
                    res = str.charAt(i);
                }
                cur_count = 1;
            }
        }
        return res;
    }
	
	
//Longest Repeated Subsequence Problem
	static public void main(String[] args) {
		String str = "abcdefbbabcdef";
		int m = str.length();
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println("The length of the largest subsequence that"
				+ " repeats itself is : "
				+ findLongestRepeatingSubSeq(str.toCharArray(), m, m));
		
		System.out.println(maxRepeating(str));
	}
	
	
}

//This code is contributed by 29AjayKumar
