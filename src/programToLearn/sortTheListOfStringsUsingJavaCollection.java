package programToLearn;

import java.util.ArrayList;
import java.util.Collections;

public class sortTheListOfStringsUsingJavaCollection {

	public void method1(ArrayList<String>al) {
		Collections.sort(al);
		
		System.out.println(al);
	}
	
	public void method2(ArrayList<Integer>al) {
		Collections.sort(al);
		
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortTheListOfStringsUsingJavaCollection lsujc = new sortTheListOfStringsUsingJavaCollection();
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahesh");
		al.add("kapil");
		al.add("Ramesh");
		al.add("Arjun");
		al.add("Bhojo");
		lsujc.method1(al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(23);
		al1.add(33);
		al1.add(22);
		al1.add(20);
		al1.add(13);
		al1.add(3);
		al1.add(8);
		al1.add(1);
		
		lsujc.method2(al1);

	}

}
