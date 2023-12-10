package programToLearn;

import java.util.Iterator;

public class CountOfUpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "PassWORd!ed test USER";
		int sizeOfS = s.length();
		
		if (sizeOfS>0) {
			
			char [] charArrayOfS = s.toCharArray();
			int sizeOfcharArrayOfS = charArrayOfS.length;
			int sizeOfcharacter=0;
			int sizeOfcharacterLower=0;
			for(int i=0; i<sizeOfcharArrayOfS;i++) {
				 if(Character.isUpperCase(charArrayOfS[i])) {
					 sizeOfcharacter++;
				 }
				 
				 if(Character.isLowerCase(charArrayOfS[i])) {
					 sizeOfcharacterLower++;
				 }
				 
			}
			System.out.println("uppaer case: "+ sizeOfcharacter);
			System.out.println("lower case: "+ sizeOfcharacterLower);
			
		}

	}

}
