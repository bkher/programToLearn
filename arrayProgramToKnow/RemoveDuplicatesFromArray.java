package arrayProgramToKnow;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []str = {"abc","abc","bcd","edr","edr","tgf","abc","tgf","tgf"};
		
		int []a = {1,1,22,3,22,1,55,22,55,55,55,55};
		
		char []c = {'a','b','c','d','a','b','c'};
		
		int count;
		
		System.out.println("This is for Words duplications");
		for(int i=0;i<str.length;i++) {
			count=0;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(str[i]+" ");
			}
		}
		
		
		System.out.println("\n\nThis is for Number duplications");
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==(a[j])) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println("\n\nThis is for character duplications");
		for(int i=0;i<c.length;i++) {
			count=0;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==(c[j])) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(c[i]+" ");
			}
		}

	}

}
