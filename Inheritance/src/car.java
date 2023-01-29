//package Inheritance;
public class car extends Vehicle{
	
	int no_of_door;
//	int maxSpeed;
	
	//constructor calling for the car
//	public car() {
//		System.out.println("car constructor is called");
//	}
	
	
	public car(int no_of_door,int maxSpeed) {
//		super();
		//this will fill the vehicle constructor  value to it!!..
		System.out.println("car constructor is called");
		this.no_of_door = no_of_door;

		
	}
	
	
	
//	public void printCar() {
//		System.out.println("CAR-->" + " color is "+ getColor() + " maxSpeed is "+ maxSpeed+" no_of_door "+ no_of_door);
//	}
	
	public void print() {
		super.print();
		System.out.println("CAR-->" + " no_of_door "+ no_of_door);
	}
	
//	public void printmaxSpeed() {
//		super.maxSpeed = 120;
//		System.out.println("maxSpeed of car --> "+ maxSpeed+" vehicle maxSpeed "+ super.maxSpeed);
//	}
	
	
	//abstract function to remove it
	
	public boolean isMotorised() {
		return true;
	}
	
	

	
	
}
