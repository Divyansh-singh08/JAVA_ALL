package generic;

//public class Vehicle {
public class Vehicle implements printInterface{
	int maxSpeed;
	String company;
	
	public Vehicle(int maxSpeed,String company) {
		super();
		this.maxSpeed = maxSpeed;
		this.company = company;
	}
	
	public void print() {
		System.out.println(maxSpeed + " "+ company);
	}

}
