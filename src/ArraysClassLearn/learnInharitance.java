package ArraysClassLearn;

import java.util.Random;

import InputFromUser.vehicle;

class learnInharitance implements vehicle{
	
	public void deliver() {
        System.out.println("Delivering Item");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle.method3();
		

		learnInharitance deliveryBoy = getDeliveryBoy();
        deliveryBoy.deliver();
        
        deliveryBoy.method1();
        deliveryBoy.method2();
    }
	
	private static learnInharitance getDeliveryBoy() {
        Random random = new Random();
        int number = random.nextInt(5);
        System.out.println(number);
        return number % 2 == 0 ? new Postman() : new FoodDeliveryBoy();
    }

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("test for method 1");
	}
	
	

}


class Postman extends learnInharitance {
    @Override
    public void deliver() {
        System.out.println("Delivering Letters");
    }
}


class FoodDeliveryBoy extends learnInharitance {
    @Override
    public void deliver() {
        System.out.println("Delivering Food");
    }
}