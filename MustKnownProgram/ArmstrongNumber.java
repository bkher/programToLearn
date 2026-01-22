package MustKnownProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 154;
		int exact = num;
		int sum =0;
		
		while(num>0) {
			int r = num%10;
			sum= sum+(r*r*r);
			num= num/10;
		}
		
	if(exact==sum) {
		System.out.println(exact+" is Armstrong Number");
	}else {
		System.out.println(exact+" is not Armstrong Number");
	}

	}

}
