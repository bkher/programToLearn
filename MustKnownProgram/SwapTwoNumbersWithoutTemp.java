package MustKnownProgram;

public class SwapTwoNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b=20;
		
		int sum = a+b;
		b=sum-b;
		a=sum-a;
		
		System.out.println(a+" "+b);
	}

}
