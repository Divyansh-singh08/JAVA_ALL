package fundamentals;

import java.util.Scanner;

public class conditionNew {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a*b<0) {
			System.out.println("negative");
		}else {
			System.out.println("positive");
		}

	}

}
