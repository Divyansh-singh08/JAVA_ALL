
import java.util.ArrayList;

public class DynamicArrayUse {

	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		//with the help of this entering value to the array;
		for(int i = 1; i < 100; i++) {
			d.add(100 + i);
		}
		
		System.out.println(d.size());
		System.out.println(d.get(2));
		d.set(3,170);
		System.out.println(d.get(3));
		
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("size - "+d.size());
		}

	}

}
