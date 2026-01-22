package MoreKnownOne;

public class ReplaceMultipleSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I will     change  j   o  b i  n 2 0  2  6";
		
		String result =  s1.replaceAll("\\s{1,}+", " ");
		
		System.out.println(result);
		
		

	}

}
