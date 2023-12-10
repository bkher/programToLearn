package programToLearn;

import java.util.HashSet;
import java.util.Set;

public class filterDuplicateElementsFromAnArrayAndPrintAsList {
	
	
	public void method1(int[] arrayNumber) {
		int sizeOfArrayNumber = arrayNumber.length;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<=sizeOfArrayNumber-1;i++) {
			for(int j=i+1;j<sizeOfArrayNumber;j++) {
				if(arrayNumber[i]==arrayNumber[j]) {
					set.add(arrayNumber[i]);
					i++;
				}
			}
		}
		
		System.out.println(set);
	}
	
	public void method2(String str) {
		char[] strArray = str.toCharArray();
		int sizeOfArrayNumber = strArray.length;
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<=sizeOfArrayNumber-1;i++) {
			if(strArray[i]!=' ') {
				set.add(strArray[i]);
			}
		}
		
		System.out.println(set);
	}
	
	public void method3(String str) {
		char[] strArray = str.toCharArray();
		int sizeOfArrayNumber = strArray.length;
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<=sizeOfArrayNumber-1;i++) {
			for(int j=i+1;j<sizeOfArrayNumber;j++) {
				if(strArray[i]==strArray[j] && strArray[i]!=' ') {
					set.add(strArray[i]);
					i++;
				}
			}
		}
		
		System.out.println(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterDuplicateElementsFromAnArrayAndPrintAsList fdefa = new filterDuplicateElementsFromAnArrayAndPrintAsList();
		int a[] = {12,10,12,10,9};
		fdefa.method1(a);
		
		String str1 = "my name is lakhan my name";
		fdefa.method2(str1);
		fdefa.method3(str1);
	}

}
