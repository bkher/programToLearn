package MustKnownProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		while(num>0) {
			int r = num%10;
			int rem = num/10;
			num=rem;
			System.out.print(r);
		}

	}

}
