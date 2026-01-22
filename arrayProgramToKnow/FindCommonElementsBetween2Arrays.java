package arrayProgramToKnow;

public class FindCommonElementsBetween2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,9};
		int b[]= {2,3,4,5,6,8,9};
		
		int commonCou =0;
		
		for(int i=0;i<a.length;i++) {
			commonCou =0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					commonCou++;
				}
			}
			if(commonCou>0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
