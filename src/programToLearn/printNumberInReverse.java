package programToLearn;

public class printNumberInReverse {

	public void method1(int num) {
		int rev=0;
		for(int i=0;i<num;i++) {
			int r = num%10;
			num = num/10;
			rev= rev * 10 + r;
			i=0;
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumberInReverse pnir =  new printNumberInReverse();
		pnir.method1(201);
	}

}
