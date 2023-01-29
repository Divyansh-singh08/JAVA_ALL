
public class MapNode<K,V> {
	//Node type because it follow the Linked_list
	K key;
	V value;
	MapNode<K,V> next;
	
	//constructor
	public MapNode(K key,V value) {
		this.key = key;
		this.value = value;
	}
}
