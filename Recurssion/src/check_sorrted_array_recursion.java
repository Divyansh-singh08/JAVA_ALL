import java.util.*;
public class check_sorrted_array_recursion {

	public static boolean isSorted(int a[],int sIndex) {
		if(sIndex == a.length-1) {
			return true;
		}
		if(a[sIndex] > a[sIndex+1]) {
			return false;
		}
		return isSorted(a,sIndex+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
