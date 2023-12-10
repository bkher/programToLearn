package ArraysClassLearn;

public class ThisWithReference2 {
	
	int age;
	String name ;
	
	ThisWithReference2(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public ThisWithReference2(ThisWithReference ob1) {
		// TODO Auto-generated constructor stub
		ob1.age=age;
		ob1.name=name;
	}

	public void m2() {
		System.out.println(age+" "+name);
	}

}
