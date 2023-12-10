package programToLearn;

public class DetermineIfStringIsPalindrome {
	
	public void method1(String str1) {
		
		char[] strChar = str1.toCharArray();
		int lengthOfString = strChar.length;
		
		Boolean isEqual=false;
		
		for(int i = lengthOfString-1;i>=0;i--) {
			for(int j=0;j<lengthOfString-1;j++) {
				if(strChar[i]==strChar[j]) {
					isEqual=true;
					i--;
					
				}else {
					isEqual=false;
					i--;
				}
			}
		}
		
		if(isEqual==true) {
			System.out.println(str1+": is Palindrome");
		}else {
			System.out.println(str1+": is not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetermineIfStringIsPalindrome dsp =  new DetermineIfStringIsPalindrome();
		dsp.method1("abcdcba");

	}

}
