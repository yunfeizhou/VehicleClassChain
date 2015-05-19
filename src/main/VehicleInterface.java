package main;

public interface VehicleInterface {

	public void transferOwnership(Person newOwner);
	
	public String getName();

	public void setName(String name);

	public String getColor();

	public void setColor(String color);

	public String getWeight();

	public void setWeight(String weight);

	public Person getOwner();

	public void setOwner(Person owner);
}