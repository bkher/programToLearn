package arrayProgramToKnow;

public class FindFrequencyOfEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,1,2,3,1,2,4,5,4,5,3,11};
		
		int frequCount =1;
		
		for(int i=0;i<a.length;i++) {
			 frequCount =1;
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 frequCount++;
					 a[j]='0';
				 }
			 }
			 
			 if(a[i]!='0') {
				 System.out.println(a[i]+" is occured "+ frequCount+" times");
			 }
		}
		

	}

}
