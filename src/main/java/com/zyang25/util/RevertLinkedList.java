package com.zyang25.util;

import com.zyang25.model.Node;

public class RevertLinkedList {
	
	// 1 -> 2 -> 3 -> 4
	public void revert(Node n) {
		
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.setNext(n2);
		n2.setNext(n3);
		
		n1.print();
	}
}
