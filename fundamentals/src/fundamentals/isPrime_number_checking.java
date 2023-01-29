package fundamentals;

import java.util.Scanner;

public class isPrime_number_checking {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		
		int div = 2;
//		int flag = 1;
		while(div <= (number-1)) {
			if(number % div == 0) {
//				flag = 0;
				System.out.println("Composite Number");
				return;
			}
			div++;
		}
		
		System.out.println("Prime Number");
		
//		if(flag==1) {
//			System.out.println("This is the Prime Number");
//		}else {
//			System.out.println("This is the Composite Number");
//		}

	}

}
