package Interface;

public class VehicleUse extends car{

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();//object of v
//		VehicleInterface v1 = new VehicleInterface();
		//interface object is not allow
//		VehicleInterface ve; //this is allow as reference...
//		with the help of reference we can achive polymorphism
		
//		ve = new Vehicle();
//		ve.getCompany();
//		ve.print();//not access bcz we can only access that are in interface
		
		VehicleInterface v = new car();
		
		v.isMotorised();
		
		
		
	}

}
