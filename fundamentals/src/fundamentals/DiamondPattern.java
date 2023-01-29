package fundamentals;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int n1 = (n+1)/2;
        int n2 = n/2;
        
        int i = 1;
        while(i <= n1)
        {
            int  space = n1-1;//// CHANGE
            while(space >=i){
                System.out.print(' ');
                space--;
            }
            int num = 1;
            while(num <= ((2*i)-1)){
                System.out.print("*");
                num++;
            }
            System.out.println();
            i++;
        }
        i = n2;//CHANGE
        while(i>=1) //CHANGE
        {
          
           
            int sp2 = 1;
            while(sp2 <= (n/2-i+1))//CHANGE
            {
                System.out.print(' ');
                sp2++;
            }
            
            // int st = 1;
            int st = 2*i-1;//CHANGE
            while(st>=1){//CHANGE
                System.out.print("*");
                st--;
            }
            System.out.println();
            i--;
           
        }
        
        
        
		
	}

}
