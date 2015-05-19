package main;

public class Car extends Vehicle implements VehicleInterface{
	public int NumberOfDoors;
	
	public Car(){
		
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
	

}
