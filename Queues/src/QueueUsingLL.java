import java.util.*;

import java.util.LinkedList;


public class QueueUsingLL<T>  {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	//constructor no need...
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T elem) {
//		inset element
//		cerate a new node
		Node<T> newNode = new Node<>(elem);
		size++;
		if(rear == null) {
			front = newNode;//create node
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;//rear = rear.next;
		}
	}
	
	public T front()throws QueueEmptyException {
		if(front == null)  {
			throw new QueueEmptyException();
		}
		 return front.data;//top of the value give out
		 
	}
	
	public T dequeue()throws QueueEmptyException {
		if(front == null)  {
			throw new QueueEmptyException();
		}
		//remove / delete
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		 return temp;
		
	}
}
