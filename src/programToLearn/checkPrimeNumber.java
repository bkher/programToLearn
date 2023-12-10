package programToLearn;

public class checkPrimeNumber {
	
	public void method1(int num) {
		
	//	int num =13;
		int checkDevision = num/2;
		int temp=0;
		
		for(int i=2;i<=checkDevision;i++) {
			if(num%i==0) {
				temp++;
				break;
			}
			else {
				temp=0;
			}
		}
		
		if (temp>0) {
			System.out.println(num+" is not Prim number");
		}else {
			System.out.println(num+" is prim number");
		}
		
	}

	public void method2(int n,int n1) {
	
		int a = 0;
		int b = 1;
		int sum =0;
		
		//System.out.print(a+" ");
		//System.out.print(b+" ");
		
		for(int i=0;i<=n;i++) {
			
			sum = a+b;
			a=b;
			b=sum;
			if(sum == n1) {
				System.out.print(sum+" ");
				break;
			}
			
			if(sum> n1) {
				break;
			}
			
			
			
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrimeNumber cpn = new checkPrimeNumber();
		cpn.method1(1999);
		cpn.method2(3,8);

	}

}
