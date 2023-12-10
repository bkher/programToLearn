package programToLearn;

public class sortAnArray {
	
	public void method1(int[] numArray) {
		int lengthOdArray = numArray.length;
		int temp = 0;
		for(int i=0;i<lengthOdArray;i++) {
			for(int j=i+1;j<lengthOdArray;j++) {
				if(numArray[i]<numArray[j]) {
					temp= numArray[i];
					numArray[i]=numArray[j];
					numArray[j]=temp;
				}
			}
			System.out.println(numArray[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sortAnArray saa = new sortAnArray();
		int [] numArray = {111,33,10,222,55,23,55,77};
		saa.method1(numArray);
	}

}
