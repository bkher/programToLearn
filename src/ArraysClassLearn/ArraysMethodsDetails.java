package ArraysClassLearn;

import java.util.Arrays;

public class ArraysMethodsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {12,34,21,44,12,8,9};
		int []b = {12,34,21,44,12,8,9};
		System.out.println(Arrays.asList(a));
		
		System.out.println(Arrays.binarySearch(a, 8));
		
		System.out.println(Arrays.binarySearch(a, 0, 5, 8));
		
		System.out.println(Arrays.compare(a, b));
		
		System.out.println(Arrays.compareUnsigned(a, b));
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));
		

	}

}
