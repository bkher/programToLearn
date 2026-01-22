package arrayProgramToKnow;

import java.util.Arrays;

public class RemoveNullValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"A",null,"b",null,"c",null,null};
		int countNull=0;
		
		for(String s: a) {
			if(s==null) {
				countNull++;
			}
		}
		
		System.out.println(countNull);
		
		String a1[] = new String[a.length-countNull];
		
		int index = 0;
		
		for(String s:a) {
			if(s!=null) {
				a1[index]=s;
				index++;
			}
		}

		 System.out.println(Arrays.toString(a1));
	}

}
