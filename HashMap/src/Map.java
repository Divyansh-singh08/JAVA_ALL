import java.util.ArrayList;

public class Map<K,V> {

		//Bucket of the Array List
		ArrayList<MapNode<K,V>> buckets;
		
		int count;//number of elements in the hasMap 
		
		int numBuckets;
		
		
		//constructor
		public Map() {
			buckets = new ArrayList<>();
			numBuckets = 20;
			for(int i = 0; i < numBuckets; i++) {
				buckets.add(null);
			}
		}
		
		private int getBucketsIndex(K key) {
			int HashCode = key.hashCode(); //present in the object class this will give bucket index
			int index = HashCode % numBuckets;
			return index;
		}
		
		//size()
		public int size() {
			return count;
		}
		
		
		//remove
		public V remove(K key) {
			int bucketIndex = getBucketsIndex(key);
			//by default head will be
			MapNode<K,V> head = buckets.get(bucketIndex);
			MapNode<K,V> prev = null;
			while(head != null) {
				
				if(head.key.equals(key)) {
					
					if(prev != null) {
						//find the key or match the  key which need to remove
						prev.next = head.next;
					}else {
						buckets.set(bucketIndex, head.next);
					}
					
				}
				prev = head;
				head = head.next;
			}
			return null;//not find any value
		}
		
		
		
		//getValue
		public V getValue(K key) {
			int bucketIndex = getBucketsIndex(key);
			//by default head will be
			MapNode<K,V> head = buckets.get(bucketIndex);
			//iterate over the linked_list
			//
			while(head != null) {
				
				if(head.key.equals(key)) {
					 //Compare the value of the string
					//if we get the element
					return head.value;
					
				}
				
				head = head.next;
			}
			return null;//not find any value
		}
		

		
		
		
		//Insert function start here
		public void Insert(K key,V value) {
			
			int bucketIndex = getBucketsIndex(key);
			//by default head will be
			MapNode<K,V> head = buckets.get(bucketIndex);
			//iterate over the linked_list
			//element is already there ? just update its value
			while(head != null) {
				
				if(head.key.equals(key)) {
					 //Compare the value of the string
					head.value = value;
					return;
				}
				
				head = head.next;
				
			}
			
			//not present the value in the bucket
			//element is not present there.INSERT at 0th position  of the Linked_List
			head = buckets.get(bucketIndex);
			MapNode<K,V> newNode = new MapNode<>(key,value);//new node create
			newNode.next = head;
			buckets.set(bucketIndex, newNode);
			count++;
			
		}

}
