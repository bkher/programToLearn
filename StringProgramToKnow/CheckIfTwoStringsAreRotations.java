package StringProgramToKnow;

public class CheckIfTwoStringsAreRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "abcd";
		String str1 = "cdba";
		
		String rotataeNew = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rotataeNew=rotataeNew+str.charAt(i);
		}
		
		if(rotataeNew.equals(str1)) {
			System.out.println("Yes--> TwoStringsAreRotations");
		}else {
			System.out.println("No--> TwoStringsAreNotRotations");
		}

	}

}
