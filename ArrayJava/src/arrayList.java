

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>(10);
		arr.add(20);
		arr.add(30);
		arr.add(10);
		System.out.println(arr.size());
		
		arr.add(3,14);
		//want to print the particular function  then the get is the function 
		System.out.println(arr.get(3));
		System.out.println(arr);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println("this is the arr "+arr.get(i));
		}
		
		//Enhanced for loop --- for Each loop
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
