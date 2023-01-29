package fundamentals;

import java.util.Scanner;

public class Errorchecking {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);

        
        
        double totalSalary,hra,da,pf,allow;
        double basicSalary = s.nextInt();
        char ch = s.next().charAt(0);
        
        
        hra = ((basicSalary*20)/100);
		da  = ((basicSalary*50)/100);
        pf  = ((basicSalary*11)/100);
        
        if(ch == 'A'){
            allow = 1700;
        }else if(ch == 'B'){
            allow = 1500;
        }else{
            allow = 1300;
        }
        
        totalSalary =((basicSalary+hra+da+allow)-pf);
        System.out.println( Math.round(totalSalary));
        


	
	
	}



}
