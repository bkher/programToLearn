package MustKnownProgram;

public class CountVowelsInString {
	
	public static void main(String []args) {
		String str ="I will change job in 2026";
		String strSmall = str.toLowerCase();
		
		char strchar[] = strSmall.toCharArray();
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(strchar[i]=='a' || strchar[i]=='e' || strchar[i]=='i' || strchar[i]=='o' || strchar[i]=='u' ) {
				count++;
			}
		}
		System.out.println("Vowes count is : "+ count);
	}

}
