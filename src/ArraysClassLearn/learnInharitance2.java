package ArraysClassLearn;

import java.util.Random;

import InputFromUser.vehicle;

class learnInharitance2{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Postman1 o1 =  new Postman1();
		
		
		FoodDeliveryBoy1 o2 =  new FoodDeliveryBoy1();
		
		bank o3 =  new bank();
		
		
		o1.m1();
		o2.m1();
		o3.m1();
		
		
		FoodDeliveryBoy1 o4 = new bank(); 
		o4.m1();
		
    }
	
	


}


class Postman1 {
    public void m1() {
    	System.out.println("Postman1 m1");
    }
}


class FoodDeliveryBoy1 extends Postman1{
	public void m1() {
    	System.out.println("m1 method in FoodDeliveryBoy1");
    }
}

class bank extends FoodDeliveryBoy1 {
	public void m1() {
    	System.out.println("m1 method in bank");
    }
}