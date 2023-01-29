import java.util.Scanner;

public class UserLinkedList_input {
	
	
	//taking input choice by the user in the node connection making O(N)
	public static Node<String> takeString(){
		Scanner s = new Scanner(System.in);
		String str = s.next();//taking string input here
		Node<String> head = null,tail = null;
		while(str != "") {
			Node<String> si = new Node<String>(str);
			if(head == null) {
				//if our head is empty
				head = si; //here head is pointing to the si
				tail = si;
			}else {
				//now we have to  work on the case
				tail.next = si; //this line is for the connection between the two nodes....
				tail = si;//tail = tail.next;//this line make moving to our nodes in the list....
			}
			str = s.nextLine();
		}
		return head;
		
	}
	
	
	public static void print(Node<String> head) {
		//now head is coming as the first address of the Node
		
		Node<String> temp = head;
		while( temp != null) {
			System.out.print(temp.data+ " ans hai ");
			temp = temp.next;
		}
		System.out.println()
		;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take input by the user
		Node<String> s = takeString();
		
		print(s);

	}

}
