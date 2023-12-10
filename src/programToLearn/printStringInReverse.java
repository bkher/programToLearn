package programToLearn;

public class printStringInReverse {
	
	public void method1(String str) {
		char[] strchar = str.toCharArray();
		int lengthOfstrchar = strchar.length;
		
		for(int i=lengthOfstrchar-1;i>=0;i--) {
			System.out.print(strchar[i]);
		}
		
		System.out.println();
		for (char c : strchar) {
			System.out.print(c+" ");
		}
	}
	
	public void method2(String str) {
		String[] strArray = str.split(" ");
		int lengthOfstrchar = strArray.length;
		
		for(int i=lengthOfstrchar-1;i>=0;i--) {
			System.out.print(strArray[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStringInReverse psr = new printStringInReverse();
		psr.method1("Abhijit123@#");
		psr.method2("Hello Java?");
	}

}
