package StringProgramToKnow;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "bhagat1234@#$% test 612 sanhg &^%$^%";
		String newStr ="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
				newStr= newStr+ch;
			}
		}
		
		System.out.println(newStr);

	}

}
