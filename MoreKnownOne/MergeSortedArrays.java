package MoreKnownOne;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,3,5,7,8,9};
		
		int b[]= {11,13,15,17,18,19};
		
		int c[] = new int[a.length+b.length];
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			count++;
		}
		
		int startCount = count+1;
		for(int i=0;i<b.length;i++) {
			c[count]=b[i];
			count++;
		}
		
		int temp =c[0];
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(c[i]<c[j]) {
					temp =c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(c));
		
	}

}
