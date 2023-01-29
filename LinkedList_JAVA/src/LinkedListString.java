
import java.util.*;
public class LinkedListString {

	//function for string Node
	public static Node<String> CreateNodeString(){
		Node<String> s = new Node<String>("Divyansh");
		Node<String> s1 = new Node<String>("Srejal");
		Node<String> s2 = new Node<String>("Rudar");
		Node<String> s3 = new Node<String>("Ansh");
		s.next = s1;
		s1.next = s2;
		s2.next = s3;
		return s;
	}
	
	
	public static void printString(Node<String> head) {
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	

	
	
	public static void main(String[] args) {
	
		Node<String> ans = CreateNodeString();
//		Node<String> ans = takeInput();
		
		printString(ans);
		

	}

}
