package arrayProgramToKnow;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7};
		
		int temp = a[0];
		
		int ArryLen = a.length/2;
		
		int end = a.length-1;
		
		for(int i=0;i<ArryLen;i++) {
			temp = a[i];
			a[i]= a[end];
			a[end]=temp;
			end--;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
