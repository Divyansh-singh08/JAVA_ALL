package fundamentals;
import java.util.Scanner;
public class OddSquarePattern {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
	        
	        int n = s.nextInt();
	        
	    	for(int i = 1;i<=n;i++){
	            for(int j = i - 1; j < n ;j++){
	                System.out.print(j*2+1);
	            }
	            for(int k = 0;k < i - 1;k++){
	                System.out.print(k*2+1);
	            }
	            System.out.println();
	            
	        }
	}

}
