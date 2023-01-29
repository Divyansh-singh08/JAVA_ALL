package Interface;

public class car extends Vehicle implements VehicleInterface,CarInterface {

	@Override
	public boolean isMotorised() {
		System.out.println("this is the car class motorised ");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numGeer() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	//print method
	void print() {
		System.out.println("PI of car class"+PI);
	}
	
}