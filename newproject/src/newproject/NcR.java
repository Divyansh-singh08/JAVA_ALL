package newproject;
import java.util.*;
public class NcR {

	public static int factorial(int num) {
		int factN=1;
		for(int i =1;i<=num;i++) {
			factN=factN*i;
		}
		return factN;
	}
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int r =s.nextInt();
		
		int factN =factorial(n) ;
		int factR=factorial(r);
		int factNR=factorial(n-r);
		
		int factor = (factN)/(factR*factNR);
		System.out.println(factor);
	
		

	}

}
