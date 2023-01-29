import java.util.*;
public class Sum_of_natural_number {

	public static int sum_of(int n) {
		//base case
		if(n == 0) {
			return 0;
		}
		int smallOutput = sum_of(n-1);
		int output  = n + smallOutput;
		return output;
	}
	
	public static int func(int num){
	    return func(num- 1);
	}
	
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of natural number using Recursion
//		System.out.println(sum_of(10));
//		int num = 5;
//	    int ans = func(num - 1);
//	    System.out.println(ans);
		 int num = 3;
		 print(num);

	}

}
