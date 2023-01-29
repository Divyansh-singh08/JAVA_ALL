package newproject;
import java.util.*;
public class Isprime_funtion {
// checking function isPrime
	public static boolean checkisPrime(int n) {
		int div = 2;
		boolean check=true;;
		while(div <= n/2){
			
			if(n % div == 0) {
				check = false;
				break;
			}
			div++;
	
		}
		return check;
		
	}
	
	 public static boolean isPrime(int x)
	 {
	     for(int i=2;i<x/2;i++)
	     {
	         if(x%i==0)
	         return false;
	     }
	     return true;

	 }
	 
	 public static int sum(int a, int b ) {
		 System.out.print("int sum ");
		 return a+b;
	 }
	 public static long sum(long a,long b) {
		 System.out.print("long sum ");
		 return a+b;
	 }
	
	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean result = checkisPrime(n);
		System.out.println(result);
		System.out.println(isPrime(47));
		
		//check some function overriding call
		int a =4;
		int b =5;
		System.out.print(sum(a,b));
	}

}
