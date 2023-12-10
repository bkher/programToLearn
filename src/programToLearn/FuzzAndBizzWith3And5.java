package programToLearn;

public class FuzzAndBizzWith3And5 {
	
	// 5 >> 1,2,fuzz,4,bizz
	//9 >>  1,2,fuzz,4,bizz,fuzz,7,8,bizz
	
	
	public void method1(int n) {
		for (int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.print("fuzz ");
			}
			if(i%5==0) {
				System.out.print("Bizz ");
			}
			if(i%3!=0 && i%5 !=0) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuzzAndBizzWith3And5 fab = new FuzzAndBizzWith3And5();
		fab.method1(19);
	}

}
