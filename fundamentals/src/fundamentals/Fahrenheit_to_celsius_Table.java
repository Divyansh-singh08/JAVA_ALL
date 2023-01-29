package fundamentals;

import java.util.Scanner;

public class Fahrenheit_to_celsius_Table {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		 int sf = s.nextInt();
	     int se = s.nextInt();
	     int w  = s.nextInt();
	        
	     while(sf <= se){
	       int c = ((sf - 32)*5)/9;
	       System.out.print(sf+" "+c+"\n");
//	       System.out.println("");
	       sf= sf+w;
	    }

	}

}
