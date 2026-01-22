package arrayProgramToKnow;

public class FindSmallestPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {-1,-4,2,5,-2};
		
		int smallPositive = Integer.MAX_VALUE;;
		
		for(int i : a) {
			if(i>0) {
				if(i<smallPositive) {
					smallPositive=i;
				}
			}
		}
		
		System.out.println(smallPositive);
		

	}

}
