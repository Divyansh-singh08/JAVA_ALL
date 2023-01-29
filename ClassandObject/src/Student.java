
public class Student {
	private int roll_no;
	public String name;
	
	public int getRoll_no() {
		return this.roll_no;
	}
	
	//want to set the roll_no to the private 
	//then need to use setfunction
//	public void setRoll_no(int num) {
//		if(num <=0) {
//			return;
//		}
//		roll_no = num;
//	}
	
	   ///here using this keywords
	public void setRoll_no(int roll_no) {
		if(roll_no <=0) {
			return;
		}
		System.out.println("this address same as s "+ this);
		this.roll_no = roll_no;
	}
	
}
