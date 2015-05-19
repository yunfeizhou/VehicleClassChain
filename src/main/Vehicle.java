package main;

public abstract class Vehicle {
	
	public String Name;
	public String Color;
	public String Weight;
	public Person Owner;
	
	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		Owner = owner;
	}

}
