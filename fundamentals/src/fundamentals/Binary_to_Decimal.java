package fundamentals;
import java.util.*;
public class Binary_to_Decimal {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
        
        int temp=n;
        int val=0;
        int base = 1;
        while(temp>0){
            int last_digit = temp%2;
            temp=temp/2;
            val = val +last_digit*base;
            base=base*10;
            
        }
        System.out.print(val);

	}

}
