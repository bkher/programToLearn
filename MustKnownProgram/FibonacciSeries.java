package MustKnownProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =10;
		int a=0;
		int b=1;
		int c=0;
				
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=num;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		System.out.println("\n\n----------with while loop ---------------------------\n");
		int a1=0;
		int b1=1;
		int c1=0;
		System.out.print(a1+" "+b1+" ");
		while(c1<num) {
			c1=a1+b1;
			a1=b1;
			b1=c1;
			System.out.print(c1+" ");
		}
		
		System.out.println("\n\n----------with do while loop ---------------------------\n");
		int a2=0;
		int b2=1;
		int c2=0;
		System.out.print(a2+" "+b2+" ");
		do {
			
			c2=a2+b2;
			a2=b2;
			b2=c2;
			if(c2<num) {
			System.out.print(c2+" ");
			}
		}while(c2<num);
		
	
		
	}

}
