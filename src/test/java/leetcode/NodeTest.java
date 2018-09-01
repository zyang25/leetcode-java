package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.zyang25.model.Node;

class NodeTest {

	@Test
	void print_ReturnNodeString_WhenProvided() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.setNext(n2);
		n2.setNext(n3);
		
		assertEquals("1 -> 2 -> 3", n1.print());
	}

}
