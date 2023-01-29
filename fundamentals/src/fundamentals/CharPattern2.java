package fundamentals;
import java.util.Scanner;
public class CharPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			char ithchar = (char)('A'+i-1);
			int j = 1;
			while(j <= n) {
				System.out.print(ithchar);
				ithchar = (char)(ithchar+1);
				j = j + 1;
				
			}
			System.out.println();
			i++;
		}

	}

}
