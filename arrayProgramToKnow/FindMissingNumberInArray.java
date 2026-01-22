package arrayProgramToKnow;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]= {1,2,4,5,6,7,8,3,10};
		int max =n[0];
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max= n[i];
			}
		}
		
		int actualSum=0;
		for(int i=0;i<n.length;i++) {
			actualSum = actualSum+n[i];
		}
		
		int expectedSum = max*(max+1)/2;
		
		int MissingNumber = expectedSum-actualSum;
		
		System.out.println("missing Number is: -> "+MissingNumber);
	}

}
