package MustKnownProgram;

public class FindFactorialOfNumber {
	
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factNum=8;
		
		int mul=1;
		
		for(int i= factNum;i>1;i--) {
			mul = mul*i;
			System.out.println(mul);
		}

		
		System.out.println("--------->"+factorial(5));
	}
	
	

}
