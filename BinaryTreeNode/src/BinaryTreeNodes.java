
//let make it generic class
public class BinaryTreeNodes<T> {
	
	public T data;
	public BinaryTreeNodes<T> left;
	public BinaryTreeNodes<T> right;
	
	//lets create a constructor who take data
	public BinaryTreeNodes(T data) {
		this.data = data;
	}
	
}
