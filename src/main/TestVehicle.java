package main;

public class TestVehicle {
	
		public static void main(String[] args){
		
		Person a = new Person();
		Trucks truck = new Trucks();
		truck.transferOwnership(a);
		
		Person b = new Person();
		truck.transferOwnership(b);
		
		MotorCycle mc = new MotorCycle();
		mc.setHasSideCar(false);
	}

}
