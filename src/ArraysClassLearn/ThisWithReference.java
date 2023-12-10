package ArraysClassLearn;

public class ThisWithReference {
	
	int age;
	String name ;
	
	ThisWithReference(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public void m1() {
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisWithReference ob1 = new ThisWithReference(12,"Bhagat");
		ob1.m1();
		ThisWithReference2 ob2 = new ThisWithReference2(ob1);
		ob2.m2();
	}

}
