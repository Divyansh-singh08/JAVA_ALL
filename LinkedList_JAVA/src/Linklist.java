
public class Linklist {

	//this is the Node class 
	public static class Node{
		int data;
		Node next;
	}
	
	//now i have to make LinkList class
	public static class LinkList{
		//need 3 data member(type)
		Node head;
		Node tail;
		int size;
		
		void addLast(int val) {
			
			Node temp = new Node();//node have two property data/address
			temp.data = val;
			temp.next = null;
			if(size == 0) {
//				Node temp = new Node();//node have two property data/address
//				temp.data = val;
//				temp.next = null;
				head = tail = temp;
//				size++;
			}else {
//				Node temp = new Node();//node have two property data/address
//				temp.data = val;
//				temp.next = null;
				tail.next = temp;
				tail = temp;
//				size++;
			}
			size++;
		}
	}
	
	public static void main(String[] args) {
		

	}

}
