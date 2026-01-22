package arrayProgramToKnow;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,41,5,6};
		Boolean isSorted =true;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
			}
		}
		
		if(isSorted) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}

	}

}
