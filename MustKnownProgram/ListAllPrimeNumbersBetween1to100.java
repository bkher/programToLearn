package MustKnownProgram;

public class ListAllPrimeNumbersBetween1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start=1;
		int end =100;
		
		for(int i=start;i<=end;i++) {
			int devided = i/2;
			int isPrime =1;
			
			for(int j=2;j<=devided;j++) {
				if(i%j==0) {
					isPrime++;
				}
			}
			if(isPrime==1) {
				System.out.print(i+" ");
			}
			
		}
	}

}
