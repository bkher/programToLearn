package MustKnownProgram;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=19;
		int devided = n/2;
		int isisPimeCount=0;
		for(int i=2;i<=devided;i++) {
			if(n%i==0) {
				isisPimeCount++;
			}
		}
		if(isisPimeCount>0) {
			System.out.println(n+" is not a Prime Number");
		}else {
			System.out.println(n+" is a Prime Number");
		}

	}

}
