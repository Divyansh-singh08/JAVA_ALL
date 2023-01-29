//package default;
public abstract class Vehicle {
	private String color;
	protected int maxSpeed;
	
//	constructor is call
	public Vehicle() {
		System.out.println("vehicle constructor is called");
	}
	
	public Vehicle(int maxSpeed) {
		System.out.println("vehicle constructor is called");
		this.maxSpeed = maxSpeed;
	}
//	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("vehicle-->" + " color "+color+" maxSpeed "+maxSpeed);
	
	}	
	
	public abstract boolean isMotorised();
	
	public abstract String getCompany();

	}
//}
