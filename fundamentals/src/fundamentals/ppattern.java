package fundamentals;
import java.util.Scanner;
public class ppattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int i = 1;
        while(i <= n){
            int space = 1;
            while(space <= n - i){
                System.out.print(' ');
                space++;
            }
			int value = 1;
            while(value <= i){
                System.out.print("*");
                value++;
            }
            int dec = i-1;
            while(dec >= 1){
                System.out.print("*");
                dec--;
            }
            
            System.out.println();
            i++;
        }

	}

}
