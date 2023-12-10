package programToLearn;

public class replaceTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =15;
		int b=22;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);	
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);		

	}

}
