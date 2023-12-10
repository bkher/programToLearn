package programToLearn;

public class identifyNumberAsPalindrome {

	public void method1(int num1) {
		
		int num = num1;
		
		int rev =0;
		
		for(int i=0;i<=num;i++) {
			int r= num % 10;
			num = num /10;
			rev = rev * 10 + r;
			i=0;
		}
		
		if(num1==rev) {
			System.out.println(rev+" is palindrom");
		}else {
			System.out.println(rev+" is not palindrom");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		identifyNumberAsPalindrome inap = new identifyNumberAsPalindrome();
		inap.method1(343);
	}
}
