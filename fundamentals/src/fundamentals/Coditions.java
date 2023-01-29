package fundamentals;

import java.util.Scanner;

public class Coditions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
//		if( a>0 && a%2 == 0 ) {
//			System.out.println(a+" is Even Number ");
//		}else {
//			System.out.println(a+ " Not an Even number ");
//		}
		
//		int x = 5;
//		if(x<6)
//			System.out.println("heee ");
//		if(x==5) {
//			System.out.println("hello ");
//		}else {
//			System.out.println("noo ");
//		}
		
//		int x = 15;
//		if(x <= 15) {
//			System.out.print("inside if ");
//		}else if( x == 15) {
//			System.out.print("inside else if ");
//		}
//		System.out.println(x);
		
//		int var1 = 5;
//		int var2 = 6;
//		if((var2 = 1)== var1)
//			System.out.println(var2);
//		else
//			System.out.println(var2+1);
		
//		if(a>0 || b < 0) {
//			System.out.println("one is positive");
//		}else {
//			System.out.println("one is negative");
//		}
		
//		int a=50;
//	    int b=Integer.MIN_VALUE;
//	    if(a/0==b)
//	    {
//
//	        System.out.println("Hello");
//	    }
//	    else
//	    {
//	        System.out.println("Hi");
//	    }

		if(a*b<0) {
			System.out.println("negative");
		}else {
			System.out.println("positive");
		}
	   

	
	}

}
