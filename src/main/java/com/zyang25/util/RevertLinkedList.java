package com.zyang25.util;

import com.zyang25.model.Node;

public class RevertLinkedList {
	
	// 1 -> 2 -> 3 -> 4
	// 4 -> 3 -> 2 -> 1
	public Node revert(Node n) {
		if(n == null)
			return n;
		
		Node curr = n;
		Node prev = null;
		Node next = null;
		
		while(curr != null) {
			next = curr.getNext();
			
			curr.setNext(prev);
			
			
		}
		
		return prev;
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
