package fundamentals;
import java.util.*;
public class RoughWork {

	public static void main(String[] args) {
//		int a = 42;
//		int b = ~a;
//		System.out.println(a+" "+b);
//		
//		int x,y=1;
//		x=10;
//		if(x!=10 && x/0==0) {
//			System.out.println(y);
//		}else {
//			System.out.println(++y);
//		}
//		int x=15;
//		int y=x++;
//		int z=++x;
//		System.out.println(y+" "+z);
		
//		int x=3;
//		System.out.println(++x*8);
		
//		 	int x =10;
//	        int y = 20;
//	        if(x++ > 10 && ++y > 20 ){
//	        System.out.print("Inside if  ");
//	        }else{
//	        System.out.print("Inside else  ");
//	        }
//	        System.out.println(x +" "+y);
		
//		 int x = 10;
//         int y = 20;
//         if(x++ > 10 || ++y > 20 ){
//        System.out.print("Inside if  ");
//         }else{
//        System.out.print("Inside else  ");
//         }
//         System.out.println(x  + " " + y);
		
//		int a=5;
//		a+=5+(++a)+(a++);
//		System.out.println(a);
//		int a=10;
//	    a+=++a-5/3+6*a;
//	    System.out.print(a);
		
		   Scanner s = new Scanner(System.in);
	        
//	        int n = s.nextInt();
////	        int temp;
//	        int a =0,b=1;
////	        for(int i=1;i<=n;i++){
////	            temp = a+b;
////	            a=b;
////	            b=temp;
////	        }
//	        int temp=0,i =2;
//	        while(i<=n) {
//	        	temp = a+b;
//	        	a = b;
//	        	b = temp;
//	        	i++;
//	        }
//	        System.out.print(temp);
		   
//		   for(int i=1;i<10;i*=2)
//		   {
//		        System.out.println(i);
//		   }
		   
//		   for(int i =0;i<5;i=i+1) {
//			   System.out.println(i+" ");
//			   i=i+1;
//		   }
//		   for(int i = 1; i < 5; i = i + 1){
//			    System.out.print(i +" ");
//			    i = i - 1;
//			}
//		   for(int i = 0; i < 2; i = i + 1) {
//			     for(int j = 0; j < 2; j = j + 1) {
//			          if (j == 1)
//			              break;
//			          System.out.print(j +" ");
//			      }
//			 }
		   
		   
//		   	int i=0;
//		    for(;;)
//		    {
//		        if(i==5)
//		            break;
//		        System.out.print(i);
//		        i++;
//		    }
		   
		   
		   
//		    for(int i=7;i!=0;i--)
//		    {
//		        System.out.print(i--);
//		    }
		   
//		   int i = 1;
//		   while(i < 3) {
//		       int j = 1;
//		       while(j < 5) {
//		           if(j == 3) {
//		               break;
//		           }
//		           System.out.print(j + " ");
//		           j++;
//		       }
//		       i++;
//		   }
		   
		   
		   int i = 1;
		   while(i < 3) {
		       int j = 0;
		       while(j < 5) {
		           j++;
		           if(j == 3) {
		               continue;
		           }
		           System.out.print(j + " ");
		       }
		       i++;
		   }
		   
	}

}
