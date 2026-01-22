package MustKnownProgram;

public class ReverseString {
	
	public static void main(String []args) {
	
		String str = "I will change job in 2026";
		String str1[]= str.split(" ");
		int length = str1.length;
		
		System.out.println(" only reverse word --->");
		for(int i=length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
		}
		
		System.out.println("\n reverse word character--->");
		
		for(int i=0;i<=length-1;i++) {
			char str1Char[] = str1[i].toCharArray();
			for(int j=str1Char.length-1;j>=0;j--) {
				System.out.print(str1Char[j]);
			}
			System.out.print(" ");
		}
		
		System.out.println("\n reverse full senetence--->");
		char str2[]= str.toCharArray();
		for(int i=str2.length-1;i>=0;i--) {
			System.out.print(str2[i]);
		}
		
	}

}
