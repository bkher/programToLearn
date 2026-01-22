package MoreKnownOne;

public class ExtractNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abcd426742#$%hgqw21321";
		char c[]= s.toCharArray();
		
		
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0' && c[i]<='9') {
				System.out.print(c[i]+" ");
			}
		}
		
		
		String Number = s.replaceAll("[^0-9]", "");
		System.out.println("\n"+ Number);
		
		

	}

}
