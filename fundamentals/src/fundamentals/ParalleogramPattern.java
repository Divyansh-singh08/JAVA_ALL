package fundamentals;
import java.util.Scanner;
public class ParalleogramPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i =1;
		while(i <= n) 
		{
			int k = 1;
			while(k <= i) {
				System.out.print(' ');
				k++;
			}
			int j = 1;
			while(j <= n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
