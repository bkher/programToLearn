package programToLearn;

import java.util.Arrays;

public class evenNumbersLisySwip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] listOfNumbers = {1,2,3,4,5,6,7};
		int lengthOflistOfNumbers = listOfNumbers.length;
		System.out.println("length of the Array "+lengthOflistOfNumbers);
		
		
			for(int i=0; i<lengthOflistOfNumbers-1;i=i+2) {
				 int temp = listOfNumbers[i];
				 listOfNumbers[i] = listOfNumbers[i+1];
				 listOfNumbers[i+1] = temp;
			 }
			 System.out.println(Arrays.toString(listOfNumbers));
		}
	}


