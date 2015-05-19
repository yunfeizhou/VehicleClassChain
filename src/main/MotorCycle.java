package main;

public class MotorCycle extends Vehicle implements VehicleInterface{
	
	public boolean hasSideCar;
	
	public MotorCycle(){
		
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

}