package com.learning.DataStructures;

public class BTTraversal {
	
	//Used to create a tree node
	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			this.data =data;
		}	
	}
	//Binary tree creation and connection
	 public static TreeNode createBinaryTree() {
		 TreeNode rootNode = new TreeNode(40);
		 TreeNode Node20 = new TreeNode(20);
		 TreeNode Node10 = new TreeNode(10);
		 TreeNode Node30 = new TreeNode(30);
		 TreeNode Node60 = new TreeNode(60);
		 TreeNode Node50 = new TreeNode(50);
		 TreeNode Node70 = new TreeNode(70);
		 rootNode.left = Node20;
		 rootNode.right = Node60;
		 
		 Node20.left = Node10;
		 Node20.right = Node30;
		 
		 Node60.left =  Node50;
		 Node60.right = Node70;
		 
		 return rootNode;
	 }
	 
	 //pre order - Recursive solution
	 public void preOrderTraversal(TreeNode root) {
		 if(root != null) {
			 System.out.print(root.data+ " ");
			 
			 preOrderTraversal(root.left);
			 preOrderTraversal(root.right);	
		 } 
	 }
	 //In order - Recursive solution
	 public void inOrderTraversal(TreeNode root) {
		 if(root != null) {
			 inOrderTraversal(root.left);
			 System.out.print(root.data+ " ");
			 inOrderTraversal(root.right);	 
		 }
	 }
	 //post order - Recursive solution
	 public void postOrderTraversal(TreeNode root) {
		 if(root != null) {
			 postOrderTraversal(root.left);
			 postOrderTraversal(root.right);
			 System.out.print(root.data + " ");
		 }
	 }

	public static void main(String[] args) {
		BTTraversal bt = new BTTraversal();
		
	TreeNode rootNode1 = createBinaryTree();
	
	bt.preOrderTraversal(rootNode1);
	System.out.println(" ");
	bt.inOrderTraversal(rootNode1);
	System.out.println("  ");
	bt.postOrderTraversal(rootNode1);
		

	}

}
