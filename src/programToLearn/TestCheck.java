package programToLearn;

import java.util.Iterator;

public class TestCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {2,5,12,45,11,33,3};
		
		int temp;
		
		for(int i=0; i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j]= temp;
					
				}
			}
			
		}
		System.out.println(arr1[arr1.length-1]);
		System.out.println(arr1[arr1.length-2]);
		
	}

}
