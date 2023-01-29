package newproject;
import java.util.*;
public class HalfDiamondagain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n =  s.nextInt();
		
		int n1 = (n+1)/2;
		int n2 = n/2;
		int i=1;
		while(i<=n1)
		{
			int space = n1-1;//Here the space need to create but also need to take case how start are print.
			while(space >= i) {
//				System.out.print('   ');
				space--;
			}
			
			/*
			 here  2*i -1 this will indirectly depend on the previous loop
			 */
				int num = 1;
				while(num<= (2*i)-1) {
				System.out.print("*");
				num++;
			}
			System.out.println();
			i++;
		}
		
		i = n2;
		while(i>=1) {
			
		}

	} 

}
