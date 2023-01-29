package generic;

public class students implements printInterface{
	int rollnum;
	
	//constructor

	public students(int rollnum) {

		this.rollnum = rollnum;
	}

	@Override
	public void print() {
		System.out.println(rollnum);
		
	}
	
}
