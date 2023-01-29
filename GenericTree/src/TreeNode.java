import java.util.ArrayList;

public class TreeNode<T> {

	//generic classs
	T data;
	ArrayList<TreeNode<T>> children;
	
	//make constructor
	public TreeNode(T data) {
		this.data = data;
		this.children = new ArrayList<>();//this will be empty ArrayList but not the Null..
	}
}
