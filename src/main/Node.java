package main;

public class Node {

	int data;
	Node leftChild = null;
	Node rightChild = null;
	int size;
	boolean isRootNode = false;

	public Node(int d, Node lChild, Node rChild) {

		this.data = d;
		this.leftChild = lChild;
		this.rightChild = rChild;
		this.size = 1 + lChild.size() + rChild.size();

	}

	public Node(int d, Node lChild) {

		this.data = d;
		this.leftChild = lChild;
		this.size = 1 + lChild.size();

	}

	public void setIsRootNode(boolean isRoot) {
		this.isRootNode = isRoot;
	}

	public Node(int d) {

		this.data = d;
		this.size = 1;
	}

	public int size() {
		return this.size;
	}

	public Node getRootNode() {
		return this;
	}

	public Node getLeftChild() {
		return this.leftChild;
	}

	public Node getRightChild() {
		return this.rightChild;
	}

	public int getData() {
		return this.data;
	}

}
