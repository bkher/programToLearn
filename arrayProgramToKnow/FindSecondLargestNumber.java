package arrayProgramToKnow;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,33,11,22,45,22,44,77};
		int len = a.length;
		int temp;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		System.out.println("Second largest: "+a[len-2]);
	}

}
