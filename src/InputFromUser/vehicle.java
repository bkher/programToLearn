package InputFromUser;

public interface vehicle {
	
	void method1();
	default void method2() {
		System.out.println("test");
	}
	
	static void method3() {
		System.out.println("test2");
	}

}


class Teestclass implements vehicle
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		vehicle.method3();
	}
}
