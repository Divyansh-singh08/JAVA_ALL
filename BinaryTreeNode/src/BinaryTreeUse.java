import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {
	
	//this is more clear input approach 
	public static BinaryTreeNodes<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the Root data please ");
		}
		else 
		{
			if(isLeft) {
				System.out.println(" Enter left child of" + parentData);
			}else {
				System.out.println(" Enter right child of " + parentData);
			}
			
		}
		
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNodes<Integer> root = new BinaryTreeNodes<>(rootData);
//		BinaryTreeNodes<Integer> leftChild = takeTreeInput();
//		BinaryTreeNodes<Integer> rightChild = takeTreeInput();
		
		BinaryTreeNodes<Integer> leftChild = takeTreeInputBetter(false,rootData,true);
		BinaryTreeNodes<Integer> rightChild = takeTreeInputBetter(false,rootData,false);
		
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	
	
	
	
	//take tree input
	public static BinaryTreeNodes<Integer> takeTreeInput(){
		System.out.println("Enter the Root data please ");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNodes<Integer> root = new BinaryTreeNodes<>(rootData);
		BinaryTreeNodes<Integer> leftChild = takeTreeInput();
		BinaryTreeNodes<Integer> rightChild = takeTreeInput();
		
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	
	
	
	public static void printTreeDetail(BinaryTreeNodes<Integer> root) {
		//TODO take care of base case
		//this base case is more good and easy to understand
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		
		
		if(root.left != null) {
			System.out.print(root.left.data + "L " +"," );
		}
		if(root.right != null) {
			System.out.print(root.right.data + "R" );
		}
		
		System.out.println();
		
		
		  ////another way
		printTreeDetail(root.left);
		printTreeDetail(root.right);
		
		
	}
	
	
	
	//print the tree in Recursive
	public static void print(BinaryTreeNodes<Integer> root) {
		//TODO take care of base case
		//this base case is more good and easy to understand
		if(root == null) {
			return;
		}
		System.out.println(root.data);
//		if(root.left != null) {
//			print(root.left);
//		}
//		if(root.right != null) {
//			print(root.right);
//		}
		
		
		  ////another way
		print(root.left);
		print(root.right);
		
		
	}
	
	
	//counting the number of nodes in the TREE
	
	public static int numNodes(BinaryTreeNodes<Integer> root) {
		//base case
		if(root == null) return 0;
		
		int leftNodeCount  = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		
		return 1 + leftNodeCount + rightNodeCount;
	}
	
	
	public static int numLeaves(BinaryTreeNodes<Integer> root) {
		//base case
		if(root == null) {
			return 0;
		}
		
		//special case
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		return numLeaves(root.left) + numLeaves(root.right);
	}

	
	//print the  Nodes at Depth K
	public static void printAtDepthK(BinaryTreeNodes<Integer> root,int k) {
		//base case
		if(root == null) {
			return;
		}
		
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}
	
	//check height of the tree
	public static int heightTree(BinaryTreeNodes<Integer> root) {
		//base case
		if(root == null) {
			return 0;
		}
		
		int leftTree = heightTree(root.left);
		int rightTree = heightTree(root.right);
		
		return 1 + Math.max(leftTree, rightTree);
		
	}
	
	//checking the tree isBalanced
	public static boolean isBalance(BinaryTreeNodes<Integer> root) {
		//base case
		if(root == null) {
			return true;
		}
		
		//check the left/right height of the tree
		int leftHeight = heightTree(root.left);
		int rightHeight = heightTree(root.right);
		
		//check is left and right height is less then equal to 1 or not
		if(Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		
		//now imp check is left subtree or right subtree is balanced ?
		boolean isLeftBalanced = isBalance(root.left);
		boolean isRightBalanced = isBalance(root.right);
		
		return isLeftBalanced && isRightBalanced;
	}
	
	
	//remove leaf nodes from the tree
	public static BinaryTreeNodes<Integer> removeLeafNode(BinaryTreeNodes<Integer> root) {
		//base case
		if(root == null) {
			return null;
		}
		//special case
		if(root.left == null && root.right == null) {
			return null;
		}
		//here we attached the null to the left and right when need
		root.left = removeLeafNode(root.left);
		root.right = removeLeafNode(root.right);
		
		return root;
		
	}
	 ///this is for the better approach to balance the TREE in O(N) complexity
	public static BalancedTreeReturn isbalanceBetter(BinaryTreeNodes<Integer> root) {
		//base case
		if(root == null) {
			int height = 0;
			boolean isbal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isbal;
			return ans;
		}
		
		BalancedTreeReturn leftOrigin = isbalanceBetter(root.left);
		BalancedTreeReturn rightOrigin = isbalanceBetter(root.right);
		
		boolean isBal = true;
		int height = 1 + Math.max(leftOrigin.height, rightOrigin.height);
		//case check
		if(Math.abs(leftOrigin.height - rightOrigin.height) > 1) {
			isBal = false;
		}
		
		if(!leftOrigin.isBalanced || !rightOrigin.isBalanced) {
			isBal = false;
		}
		
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		
		return ans;
	}
	
	public static int maximum(BinaryTreeNodes<Integer> root) {
		if(root == null) return Integer.MIN_VALUE;
		
		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);
		
		return Math.max(root.data,Math.max(leftMax, rightMax));
		
		
	}
	
	
	public static int minimum(BinaryTreeNodes<Integer> root) {
		if(root == null) return Integer.MAX_VALUE;
		
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		
		return Math.min(root.data,Math.min(leftMin, rightMin));
		
	}
	
	//CHECK THE TREE IS BST OR NOT
	public static boolean checkBST(BinaryTreeNodes<Integer> root) {
		if(root == null) return true;
		
		int LeftMax = maximum(root.left);
		//every things on the left side of the root data is  must smaller 
		if(LeftMax >= root.data) {
			return false;
		}
		
		int RightMin = minimum(root.right);
		//every things on the Right side of the root data is must be greater 
		if(RightMin < root.data) {
			return false;
		}
		
		boolean isLeftBST = checkBST(root.left);
		boolean isRightBST = checkBST(root.right);
		
		return isLeftBST && isRightBST;
	}
	
	public static isBSTReturn isBST2(BinaryTreeNodes<Integer> root) {
		//base case
		if(root == null) {
			//create object for isBstReturn type
			isBSTReturn ans = new isBSTReturn(Integer.MIN_VALUE,Integer.MAX_VALUE,true);
			return ans;
		}
		//object type leftSide variable  9p
		isBSTReturn leftSide = isBST2(root.left);
		
		isBSTReturn rightSide = isBST2(root.right);
		
		int min = Math.min(root.data,Math.min(leftSide.min,rightSide.min));
		int max = Math.max(root.data,Math.max(rightSide.max,rightSide.max));
		
		boolean isBST = true;
		if(leftSide.max >= root.data) {
			isBST = false;
		}
		
		if(rightSide.min < root.data) {
			isBST = false;
		}
		
		if(!leftSide.isBST) {
			isBST = false;
		}
		
		if(!rightSide.isBST) {
			isBST = false;
		}
		
		isBSTReturn ans = new isBSTReturn(min,max,isBST);
		
		return ans;//this Method will work for the O(N) TIME.....
		
	}
	
	//isBST3 another Method to do this......
	public static boolean isBST3(BinaryTreeNodes<Integer> root,int minRange,int maxRange) {
		if(root == null) {
			return true;
		}
		
		if(root.data < minRange || root.data > maxRange) {
			return false;
		}
		
		boolean isLeftRange = isBST3(root.left,minRange,root.data-1);
		boolean isRightRange = isBST3(root.right,root.data,maxRange);
		
		return isLeftRange && isRightRange;
	}
	
	
	//Root to the Node Path in BST
	public static ArrayList<Integer> noodtoRoot(BinaryTreeNodes<Integer> root,int x){
		//base case
		if(root == null) {
			return null;
		}
		
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOut = noodtoRoot(root.left,x);
		if(leftOut != null) {
			leftOut.add(root.data);
			return leftOut;
		}
		
		ArrayList<Integer> rightOut = noodtoRoot(root.right,x);
		if(rightOut != null) {
			rightOut.add(root.data);
			return rightOut;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
//		BinaryTreeNodes<Integer> root = new BinaryTreeNodes<>(1);
////		root.data = 1;
//		
//		BinaryTreeNodes<Integer> rootLeft = new BinaryTreeNodes<>(2);
//		BinaryTreeNodes<Integer> rootRight = new BinaryTreeNodes<>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//	
//		
//		
//		BinaryTreeNodes<Integer> twoRight = new BinaryTreeNodes<>(4);
//		BinaryTreeNodes<Integer> threeLeft = new BinaryTreeNodes<>(5);
////		
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
////		
////		BinaryTreeNodes<Integer> root = new BinaryTreeNodes<>(1);
//		print(root);
//		
//		System.out.println(" Full Detail information of the Tree  ");
//		
		
//		BinaryTreeNodes<Integer> root = takeTreeInput();
		
		BinaryTreeNodes<Integer> root = takeTreeInputBetter(true,0,false);
		
		printTreeDetail(root);
		
		System.out.println("Number of Nodes are: " + numNodes(root));
		System.out.println("number of Parent who don't have any leaves " + numLeaves(root));
		System.out.println("Print the Depth K " );
		printAtDepthK(root,2);
//		BinaryTreeNodes<Integer> newRoot = removeLeafNode(root);
//		printTreeDetail(newRoot);
		System.out.println("is Balance " + isBalance(root));
		
		System.out.println(" Better approach is balanced " + isbalanceBetter(root).isBalanced);
		System.out.println("This is the BST Tree " + checkBST(root));
		isBSTReturn ans = isBST2(root);
		System.out.println("This is the BST2 NEW "+ans.min + " " + ans.max + " " + ans.isBST);
		System.out.println("BST3"+isBST3(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

}
