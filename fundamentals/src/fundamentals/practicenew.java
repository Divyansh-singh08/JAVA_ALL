package fundamentals;

import java.util.Scanner;

public class practicenew {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		
		int n = s.nextInt();
		
		int i = 1;
		
		while(i<= n) {
			int m = i;
			int space=1;
			while(space <= n-i) {
				System.out.print(' ');
				space++;
			}
			int num = 1;
			while(num <= i) {
				System.out.print(m);
				num++;
				m++;
			}
			int dec = i-1;
			while(dec >= 1) {
				System.out.print(m-2);
				dec--;
				m--;
			}
			System.out.println();
			i++;
		}
	}

}
