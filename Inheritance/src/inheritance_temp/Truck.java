package inheritance_temp;

import Inheritance.Vehicle;

public class Truck extends Vehicle {
	
	int maxLoadingCapacity;
	
	public void print() {
		System.out.println("Vehicle-->" + " color is "+ getColor() + " maxSpeed is "+ maxSpeed + " maxLoadingCapacity "+maxLoadingCapacity);
	}
	
	
}
