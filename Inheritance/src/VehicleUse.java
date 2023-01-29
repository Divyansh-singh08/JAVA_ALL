import java.util.*;
public class VehicleUse {

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();//constructor is called
		
//		car c = new car();//car constructor is called this is calling both vehicle and car constructor ? 
                          // Reason -->
//		c.print();
		
		
		
		
		
		
		
//		Vehicle v = new Vehicle();
//		v.print();
////		v.color = "Orange";
//		v.setColor("pink");
//		v.maxSpeed = 90;
//		v.print();
//		
//		
//		car c = new car();
////		c.color = "Blue";
//		c.setColor("black");
//		c.maxSpeed = 100;
//		c.no_of_door = 4;
//		c.printmaxSpeed();
//		c.print();
////		c.printCar();
//		
//		
//		Bicycle b = new Bicycle();
////		b.color = "Red";
//		b.maxSpeed = 60;
//		b.print();
		
		
		
		//polymorphism
		
//		Vehicle v = new car(4 , 100);
//		v = new Bicycle();
//		v.maxSpeed  = 100;
////		v.no_of_door = 4;
//		v.print();  // this will call car function
		
		//more clearfication
		
//		Vehicle v;
//		Scanner s =  new Scanner(System.in);
//		int n = s.nextInt();
//		
//		if(n<10) {
//			v = new car(4,100);
//		}else {
//			v = new  Vehicle();
//		}
//		v.print();
		
		
		//type cast to the object
		
//		Vehicle v = new car(4 , 100);
//		
//		car c = (car) v;
//		c.no_of_door  = 5;
//		
////		object is the super class of all the subclass
//		
//		Object o = new Vehicle();
//		
//		Vehicle vi = new Vehicle();
////		vi.
//		
		
		Vehicle  v;
		v= new car(4,5);
		System.out.println(v.isMotorised());
		
		
		

	}
	
	

}
