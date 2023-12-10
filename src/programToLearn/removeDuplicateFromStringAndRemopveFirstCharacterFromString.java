package programToLearn;

import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicateFromStringAndRemopveFirstCharacterFromString {
	
public void method1(String str) {
		
		String []arrayFromstr = str.split(" ");
		
		
		//Remove duplicate SubString
		HashSet<String> hashset = new HashSet<String>();
		
		for(int i=0;i<arrayFromstr.length;i++) {
			hashset.add(arrayFromstr[i]);
		}
		
		System.out.println(hashset);
		
		// Remove first charcater from all substring
		String[] str1 = hashset.toArray(new String[hashset.size()]);
		
		for(int i=0;i<str1.length;i++) {
			String str2=str1[i].replaceFirst("[a-z]", "");
			System.out.println(str2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeDuplicateFromStringAndRemopveFirstCharacterFromString rdfs = new removeDuplicateFromStringAndRemopveFirstCharacterFromString();
		
		rdfs.method1("my name is bhagatsinh kher My");
	}

}
