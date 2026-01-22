package MustKnownProgram;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=233;
		int b=3333;
		int c =2911;
		int larget=0;
		
		if(a>b) {
			larget=a;
		}
		if(b>c) {
			larget=b;
		}
		if(c>a) {
			
			larget=c;
		}
	
		System.out.println(larget);

	}

}
