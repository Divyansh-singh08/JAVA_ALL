import org.w3c.dom.Node;


//import linkedlist.Node;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	//constructor....
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;//  true/false give
	}
	
	public void push(T elem) {
		
		//create the Node
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T top()throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public T pop()throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
		
		
	}
}
