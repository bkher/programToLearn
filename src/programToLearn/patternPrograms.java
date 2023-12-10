package programToLearn;

public class patternPrograms {
	
	public void method1(int num) {
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void method2(int num) {
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void method3(int num) {
		for(int i=num;i>0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void method4(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public void method5(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public void method6(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternPrograms pp = new patternPrograms();
		pp.method1(4);
		pp.method2(5);
		pp.method3(5);
		pp.method4(5);
		pp.method5(6);
		pp.method6(7);
	}

}
