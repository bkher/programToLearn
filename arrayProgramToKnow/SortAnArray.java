package arrayProgramToKnow;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {12,44,11,2,44,8,33};
		
		int temp =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
