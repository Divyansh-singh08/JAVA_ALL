import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
	
	static class HashMap<K,V>{
		//Node class
		private class Node{
			K key;
			V value;
			//constructor
			public Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}
		
		//variable
		private int n;
		private int N;
		//make HashMap(Array)
		private LinkedList<Node> buckets[];//this should be of N size
		
		//constructor
		public HashMap() {
			this.N = 4;
			this.buckets = new LinkedList[4];
			for(int i = 0; i < 4; i++) {
				this.buckets[i] = new LinkedList<>();
			}
		}
		
		//hashFunction
		private int hashFunction(K key) {
			int hc = key.hashCode();
			return Math.abs(hc) % N;
		}
		
		//searchInLL FUNCTION
		private int searchInLL(K key,int buckindex) {
			//make a LLNode
			LinkedList<Node> ll = buckets[buckindex];
			int di = 0;
			
			for(int i = 0; i < ll.size(); i++) {
				
				//search int the node
				Node node = ll.get(i);//here get the value on the base of index
				//check
				if(node.key == key) {
					return di;
				}
				di++;
			}
			return -1;
		}
		
		
		//rehash() function
		private void rehash() {
			LinkedList<Node> oldBucket[] = buckets;
			//make the buckets size increase
			buckets = new LinkedList[N*2];
			N = 2*N;
			//make the buckets ll empty
			for(int i = 0; i < buckets.length; i++) {
				buckets[i] = new LinkedList<>();
			}
			
			//need to add the Node in the new Buckets from the oldBucket
			for(int i = 0; i < oldBucket.length; i++) {
				LinkedList<Node> ll = oldBucket[i];
				for(int j = 0; j < ll.size(); j++) {
					Node node = ll.remove();//this will reomve the node
					//then add the new node to it
					put(node.key, node.value);
					
				}
			}
		}
		
		//put function
		public void put(K key,V value) { //O(1)
			//give the index number that is in the range of 0 to N-1
			int buckindex = hashFunction(key);
			//return the index
			int di = searchInLL(key,buckindex);
			
			//matched
			if(di != -1) {
				//update the value
				Node node = buckets[buckindex].get(di);//ll in which index
				node.value = value;
			}else {
				//not get any key
				//make a new node and add to it
				buckets[buckindex].add(new Node(key,value));
				n++;
			}
			
			//rehashing
			double lambda = n/N;
			if(lambda > 2.0) {
				rehash();
			}
		}
		
		
		//conatain_key Function
		public boolean containKey(K key) {//O(1)
			//give the index number that is in the range of 0 to N-1
			int buckindex = hashFunction(key);
			//return the index
			int di = searchInLL(key,buckindex);
			
			//matched
			if(di != -1) {
				//valid
				return true;
			}else {
				//not valid
				return false;
			}
		}
		
		
		//get function()
		public V get(K key) {
			//give the index number that is in the range of 0 to N-1
			int buckindex = hashFunction(key);
			//return the index
			int di = searchInLL(key,buckindex);
			
			//matched
			if(di != -1) {
				//update the value
				Node node = buckets[buckindex].get(di);//ll in which index
				return node.value;
			}else {
				//not get any key(node)
				return null;
			}
		}
		
		
		//remove function
		public V remove(K key) {
			//give the index number that is in the range of 0 to N-1
			int buckindex = hashFunction(key);
			//return the index
			int di = searchInLL(key,buckindex);
			
			//matched
			if(di != -1) {
				//update the value
				Node node = buckets[buckindex].remove(di);//ll in which index
				n--;
				return node.value ;
			}else {
				//not get any key(node)
				return null;
			}
		}
		
		
		
		//keySet() function
		
		public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<>();
			
			
			for(int i = 0; i < buckets.length; i++ ) {
				LinkedList<Node> ll = buckets[i];
				for(Node node: ll) {
					keys.add(node.key);
				}
			}
			return keys;
		}
		
		
		//isEmpty() funtion
		public boolean isEmpty() {
			return n==0;
		}
	}

	public static void main(String[] args) {
		// 
		HashMap<String,Integer> hm = new HashMap<>();//define the hashmap
		hm.put("India",100);
		hm.put("china",150);
		hm.put("USA", 80);
		hm.put("Nepal", 50);
		
		
		//store the key 
		ArrayList<String> keys = hm.keySet();
		for(String s: keys) {
			System.out.println(s); 
		}
		
		System.out.println(hm.get("India"));
		System.out.println(hm.remove("India"));
		System.out.println(hm.get("India"));
		//this
	}

}
