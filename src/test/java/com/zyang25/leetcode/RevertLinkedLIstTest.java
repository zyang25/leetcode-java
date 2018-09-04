package com.zyang25.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.zyang25.model.Node;

class RevertLinkedLIstTest {
	
	private Node testNode;
	
	@Before
	public void setUp() {
		testNode = new Node(1);
		Node n2 = new Node(2);
		
		testNode.setNext(n2);
	}
	
	@Test
	void revert_Return2To1_WhenNodeHas1To2() {
		assertEquals("2 -> 1", testNode.print());
	}

}
