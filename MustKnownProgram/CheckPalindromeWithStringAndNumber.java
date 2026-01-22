package MustKnownProgram;

public class CheckPalindromeWithStringAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		String reveString= "";
		
		for(int i=str.length()-1; i>=0;i--) {
			reveString = reveString+str.charAt(i);
		}
		
		System.out.println(reveString);
		if(str.equals(reveString)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		
		
		
		int num =1211;
		int revNum= num;
		int rem =0;
		int sum=0;
		
		while(num>0) {
			int r = num%10;
			sum =  sum*10 + r ;
			num = num/10;
		}
		
		if(sum == revNum) {
			System.out.println(revNum+" is palindrome");
		}else {
			System.out.println(revNum+" is not palindrome");
		}
	}

}
