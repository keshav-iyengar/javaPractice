package main;

public class BinaryTree {

	Node rootNode;

	public BinaryTree(Node rNode) {

		this.rootNode = rNode;

	}

	public int size() {
		return this.rootNode.size();
	}

	public Node getRootNode() {
		return this.rootNode;
	}

}
