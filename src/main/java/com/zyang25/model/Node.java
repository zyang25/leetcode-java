package com.zyang25.model;

public class Node {
	private int val;

	private Node next;
	
	public Node(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public Node setNext(Node next) {
		this.next = next;
		return this;
	}
	
	public String print() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(val);
		
		Node n = this.next;
		
		while(n != null) {
			sb.append(" -> " + n.val);
			n = n.next;
		}
		return sb.toString();
	}
}
