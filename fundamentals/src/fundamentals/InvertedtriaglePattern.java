package fundamentals;
import java.util.Scanner;
public class InvertedtriaglePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int i = 1;
        int p = n;
        while(i <= n){
            int j = 1;
            
            while(j <= n-i+1){
                System.out.print(p);
                j++;
            }
            System.out.println();
            i++;
            p--;
        }

	}

}
