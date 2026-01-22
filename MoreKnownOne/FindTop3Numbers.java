package MoreKnownOne;

import java.util.Arrays;

public class FindTop3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {23,33,44,55,23,11,67,22};
		
		int first = a[0];
		int second = a[0];
		int third  =a[0];
		
		
		for(int num : a) {
			
			if(num>first) {
				third=second;
				second=first;
				first=num;
			}else if(num>second) {
				third=second;
				second=num;
			}else if(num>third) {
				third=num;
			}
		}
		
		System.out.println(first+" "+ second+" "+ third);
	}

}
