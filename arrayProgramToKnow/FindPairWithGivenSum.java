package arrayProgramToKnow;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2, 7, 5, 4, 6,3,1,8};
		int target =9;
		int sum;
		
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=0;j<arr.length;j++) {
				sum= arr[i]+arr[j];
				if(sum==target) {
					System.out.println("The pair is: "+ arr[i]+","+arr[j]);
					arr[j]=arr[i];
				}
			}
			
		}

	}

}
