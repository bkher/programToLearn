package StringProgramToKnow;

public class ConvertStringoUppercaseLowercaseWithoutBuiltin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  str = "i am going to change job in twenty twenty six";
		
		String upper = "";
		String lower = "";
	
		for(int i=0;i<str.length();i++) {
			char ch =  str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				upper=upper+(char)(ch-32);
			}
			if(str.charAt(i)==' ') {
				upper=upper+" ";
			}
		}
		
		System.out.println(upper);
		
		
		String str1 = "I AM GOING TO CHANGE JOB IN TWENTY TWENTY SIX";
		
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch>='A' && ch <='Z') {
				lower= lower+ (char)(ch+32);
			}
			
			if(str1.charAt(i)==' ') {
				lower=lower+" ";
			}
		}
		System.out.println(lower);
	}

}
