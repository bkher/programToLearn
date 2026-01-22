package arrayProgramToKnow;

public class FindMaxMinInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,55,11,22,45,23,9};
		int leng = arr.length;
		int max= arr[0];
		int min = arr[0];
		
		for(int i=0;i<leng;i++) {
			
				if(arr[i]>max) {
					max= arr[i];
				}
				
				if(arr[i]<min) {
					min=arr[i];
				}
		}
		
		System.out.println(min+"   "+max);
	}

}
