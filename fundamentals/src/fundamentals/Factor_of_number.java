package fundamentals;

import java.util.Scanner;

public class Factor_of_number {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
        
        int f = n.nextInt();
        
        int div = 2;
        while(div <= f-1){
            if(f % div == 0){
                System.out.print(div+" ");
            }
            div++;
        }
        

		
		
	}

}
