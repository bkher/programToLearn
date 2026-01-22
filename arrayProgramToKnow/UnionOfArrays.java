package arrayProgramToKnow;

public class UnionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,5,7,8,9};
		
		int b[]= {11,3,15,17,8,9};
		
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
		
		int dupl =1;
		for(int i=0;i<c.length;i++) {
			dupl =1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					dupl++;
					c[j]='0';
				}
			}
			if(dupl<=1 && c[i]!='0') {
			 	System.out.println(c[i]);
			}
		}
		
		
	}

}
