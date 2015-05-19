package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleClassChainTest {

	
	@Test
	public void test() {
		Person a= new Person();
		a.setFirstName("yunfei");
		a.setLastName("zhou");
		Car Passat_SE = new Car();
		Passat_SE.Owner=a;
		Passat_SE.NumberOfDoors=4;
		
		Trucks Ford_550 = new Trucks();
		Ford_550.numberOfAxels = 2;
		
		Person b=new Person();
		b.setFirstName("walt");
		b.setLastName("white");
		
		Ford_550.transferOwnership(b);
		System.out.print(Ford_550.Owner.getFirstName());
		
		MotorCycle Harley = new MotorCycle();
		Harley.hasSideCar = false;
		
		assertEquals("Person a has the name yunfei", a.getFirstName());
		assertEquals("The Passat_SE has 4 doors", 4, Passat_SE.NumberOfDoors);
		
	}
		
}
