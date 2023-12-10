package programToLearn;

public class removeSpecialCharacterAndAlphabateFromStringAndSumOfNumber {

	public void method1(String str) {
		
		String str1=str.replaceAll("[A-z]", "");
		 
		String str2=str1.replaceAll("[@#$]", "");
		int num = Integer.parseInt(str2);
		
		System.out.println(num);
		int temp=0;
		
		for(int i=0;i<=num%10;i++) {
			
			int r= num%10;
			num= num/10;
			temp= temp+r;
			i=0;
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeSpecialCharacterAndAlphabateFromStringAndSumOfNumber rsc = new removeSpecialCharacterAndAlphabateFromStringAndSumOfNumber();
		rsc.method1("Abhijit1236447@#$");
	}

}
