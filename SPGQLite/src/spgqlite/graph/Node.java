package spgqlite.graph;

public class Node extends GraphElement {

	public Node() {
		super();
	}
	
	public static enum NodeDirection {
		IN, OUT;
	}

	@Override
	public String toString() {
		return "Node [address: " + this.getAddress() + "]";
	}
	
}
