package fundamentals;
import java.util.Scanner;

public class patternTraigle {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
//		int i = 1;
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print(j);
//			     j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
//		Printing 1
//		         23
//		         456
//		         78910
		
//		int p = 1;
//		int i = 1;
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print(p);
//				 p++;
//			     j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
//		printing 1
//		         23
//		         345
//		         4567
	
		int i = 1;
		while(i<=n) {
			int p = i;
			int j=1;
			while(j<=i) {
				System.out.print(p);
				 p++;
			     j++;
			}
			System.out.println();
			i++;
			
		}	
		
	   
		
	}

}
