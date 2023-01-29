package fundamentals;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
//				System.out.print("*");
//				printing 1111 
//				         2222
//				         3333
//				         4444
//				System.out.print(i);
//				printing 1234
//				         1234
//				         1234
//				         1234
//				System.out.print(j);
//				printing 4321
//				         4321
//				         4321
//				         4321
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
