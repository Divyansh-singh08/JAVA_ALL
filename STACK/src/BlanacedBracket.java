//import java.util.Scanner;
import java.util.*;

public class BlanacedBracket {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		//now make the stack
		Stack<Character> stack = new Stack<>();
		
		//now input the String value into the Stack
		for(int i=0;i<str.length();i++) {
			//change into the character
			char ch = str.charAt(i);
			if(ch == '('||ch == '{'|| ch == '[') 
			{
				//
				stack.push(ch);
			}
			else if(ch == ')' )
			{
//				 //first check the stack size
//				if(stack.size() == 0) {
//					System.out.println(false);
//					return;
//				}
//				else if(stack.peek() != '(')
//				{
//					System.out.println(false);
//					return;
//				}else {
//					stack.pop();
//				}
				
				boolean val = handleClosing(stack,'(');
				if(val == false) {
					System.out.println(val);
					return;
				}
				
			}else if(ch == '}') {
				boolean val = handleClosing(stack,'{');
				if(val == false) {
					System.out.println(val);
					return;
				}
			}else if(ch == ']') {
				boolean val = handleClosing(stack,'[');
				if(val == false) {
					System.out.println(val);
					return;
				}
			} else {
				
			}
		}
		
		if(stack.size() == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}
	
	public static boolean handleClosing(Stack<Character> stack, char crosOpch) {
		 //first check the stack size
		if(stack.size() == 0) {
//			System.out.println(false);
//			return;
			return false;
		}
		else if(stack.peek() != crosOpch)
		{
//			System.out.println(false);
//			return;
			
			return false;
		}else {
			stack.pop();
			return true;
		}
	}

}
