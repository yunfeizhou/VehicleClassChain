package main;

public class Trucks extends Vehicle implements VehicleInterface{
	Integer numberOfAxels;
	
	public void set_axels(Integer num_Of_axels){
		this.numberOfAxels= num_Of_axels;
	}
	
	public void transferOwnership(Person newOwner) {
		this.setOwner(newOwner);
	}


	
	

}
