package programToLearn;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;

public class ElementOrderMapping {

	//Find details from screenshot
	//Given an array of integers, modify each element to reflect its relative position in the sorted array. 
	//That is, the smallest element should be replaced with 1, the second-smallest with 2, and so on. 
	//Integers of the same value will have the same relative position.
	
	
	public void method1(int a[]) {
	//	Arrays.sort(a);
		
	//	System.out.println(a.length);
		if (a.length<1) {
			throw new NullPointerException("array size is 0");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElementOrderMapping eom = new ElementOrderMapping();
		int a[] = {};
		eom.method1(a);
		
	}

}
