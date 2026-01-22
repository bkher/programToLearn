package MustKnownProgram;

public class AnagramCheckForStringAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "listen";
		String str2= "silent";
		int count;
		boolean isAnagarm= false;
		
		if(str1.length()==str2.length()) {
			
			for(int i=0;i<str1.length();i++) {
				count=0;
				for(int j=0;j<str1.length();) {
					if(str1.charAt(i)==str2.charAt(j)) {
						count++;
						j++;
					}else {
						j++;
					}
				}
				if(count!=0) {
					isAnagarm=true;
				}else {
					isAnagarm=false;
					break;
				}
			}
			
		}else {
			System.out.println(str1+" and "+str2+" are not Anagram");
		}
		
		
		if(isAnagarm==true) {
			System.out.println(str1+" and "+str2+" are Anagram");
		}else {
			System.out.println(str1+" and "+str2+" are not Anagram");
		}
		
		
	}

}
