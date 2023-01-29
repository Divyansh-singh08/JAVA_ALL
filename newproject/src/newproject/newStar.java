package newproject;
import java.util.*;
public class newStar {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter the element at index: "+ i);
				arr[i]=s.nextInt();
			}
			for(int i =0;i<n;i++) {
				System.out.println("Array of ith index value "+ i + " is "+arr[i]);
			}
			
	}

}
