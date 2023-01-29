package fundamentals;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
        
        int integer = in.nextInt();
        int sum_of_even = 0;
        int sum_of_odd = 0;
        while(integer > 0){
            
            int rem = integer % 10;
            if(rem % 2 == 0){
                sum_of_even+=rem;
            }else{
                sum_of_odd+=rem;
            }
            integer = integer/10;
        }

        System.out.println(sum_of_even +" "+ sum_of_odd);
        
		

	}

}
