package newproject;
import java.util.*;
public class checking_program {

	public static int demo(int a) {
		int val=0;	
		if(a%2 == 0) {
				val = a;
			}
		return val;
		
	}
	
	public static  void  evenNumber() {
			for(int i=2;i<=100;i+=2) {
					System.out.print(i+ " ");
			}
			System.out.println();

	}
	
	public static void noweven(int start,int end) {
//		if(start%2 != 0) {
//			start++;
//		}
		for(int i =start;i<=end;i+=2) {
			 System.out.print(i+" ");
		}
	}
	
	public static int divide(int a,int b) {
		if(b == 0) {
			return Integer.MIN_VALUE;
		}
		return a/b;
	}
	public static void divide2(int a,int b) {
		if(b == 0) {
			System.out.println("return");
			return;
//			break;
		}
		System.out.println(a/b);
	}
	
	public static void func1(int a) {
		System.out.println("a");
	}
	
	public static void main(String[] args) {
		 	int store= demo(10);
		 	evenNumber();
		 	noweven(3,17);
		 	System.out.println();
		 	System.out.println(store);	
		 	System.out.println();
		 	int sakalaka =divide(10,0);
		 	System.out.println(sakalaka);
		 	divide2(10,0);
//		 	func1(2.5);

	}

}
