package programToLearn;

public class findOutTheFirstTwoMaxValuesFromAnArray {

	public void method1(int[] numArray) {
		
		int lengthOdArray = numArray.length;
		int max = numArray[0];
		
		for(int i=1;i<=lengthOdArray-1;i++) {
			if(max<numArray[i]) {
				max= numArray[i];
			}
		}
		System.out.println("Largest number in the array: "+max);
	}
	
	public void method2(int[] numArray) {
		int lengthOdArray = numArray.length;
		int temp;
		for(int i=0;i<lengthOdArray;i++) {
			for(int j=i+1;j<lengthOdArray;j++) {
				if(numArray[i]>numArray[j]) {
					temp= numArray[i];
					numArray[i]=numArray[j];
					numArray[j]=temp;
				}
			}
		}
		
		System.out.println("Second largest number in the Array: "+numArray[lengthOdArray-2]);
		System.out.println("Largest number in the array: "+numArray[lengthOdArray-1]);
	}
	
	public void method3(int[] numArray) {
		
		int lengthOdArray = numArray.length;
		int maxone = 0;
		int maxtwo =0;
		
		for(int n : numArray) {
			if(maxone<n) {
				maxtwo = maxone;
				maxone =n;
			}else if (maxtwo<n) {
				maxtwo=n;
			}
		}
		System.out.println(maxone+" "+maxtwo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findOutTheFirstTwoMaxValuesFromAnArray maxAray = new findOutTheFirstTwoMaxValuesFromAnArray();
		int [] numArray = {111,33,10,222,55,23,55,77};
		maxAray.method1(numArray);
		maxAray.method2(numArray);
		maxAray.method3(numArray);

	}

}
