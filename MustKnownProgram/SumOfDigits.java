package MustKnownProgram;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 125627;
		
		int sum=0;
		while(num>0) {
			int r = num%10;
			sum= sum+r;
			num= num/10;
		}
		
		System.out.println(sum);

	}

}
