package com.structures.singly.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SinglyLinkedListUnitTest {

	public SinglyLinkedList s;
	public SinglyLinkedList nCheck;
	public SinglyLinkedListNode node, node2, node3;

	@Before
	public void setUp() {
		nCheck = new SinglyLinkedList();
		s = new SinglyLinkedList();
		node = new SinglyLinkedListNode(1);
		node2 = new SinglyLinkedListNode(2);
		node3 = new SinglyLinkedListNode(3);
	}

	@Test
	public void SinglyLinkedListAddFirstNull() {
		s.addFirst(null);

		assertNull(s.head);
	}

	@Test
	public void SinglyLinkedListAddFirstNode() {
		s.addFirst(node);

		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.head.val, node.val);
		assertEquals(s.tail.val, node.val);
	}

	@Test
	public void SinglyLinkedListAddFirstNodeWhenToNotEmptyList() {
		s.addFirst(node);
		s.addFirst(node2);
		s.addFirst(node3);
		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.head.val, node3.val);
		assertEquals(s.tail.val, node.val);
	}

	@Test
	public void SinglyLinkedListAddLastNull() {
		s.addLast(null);

		assertNull(s.head);
		assertNull(s.tail);
	}

	@Test
	public void SinglyLinkedListAddLastNode() {
		s.addLast(node);

		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node.val);
		assertEquals(s.head.val, node.val);
	}

	@Test
	public void SinglyLinkedListAddLastNodeWhenListNotEmpty() {
		s.head = node2;
		s.tail = node2;
		s.addLast(node);

		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node.val);
		assertEquals(s.head.val, node2.val);
	}

	@Test
	public void SinglyLinkedListAddNull() {
		s.add(null);

		assertNull(s.head);
		assertNull(s.tail);
	}

	@Test
	public void SinglyLinkedListAddNode() {
		s.add(node);

		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node.val);
		assertEquals(s.head.val, node.val);
	}

	@Test
	public void SinglyLinkedListAddNodeWhenListNotEmpty() {
		s.head = node2;
		s.tail = node2;
		s.add(node);

		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node2.val);
		assertEquals(s.head.val, node.val);
	}

	@Test
	public void SinglyLinkedListSizeZero() {
		s.add(null);
		assertEquals(0, s.size());

	}

	@Test
	public void SinglyLinkedListSize() {
		for (int i = 0; i < 100; i++) {
			s.add(new SinglyLinkedListNode(i));
		}
		assertEquals(100, s.size());

	}

	@Test
	public void SinglyLinkedListFindNodePosition() {
		s.add(node);
		s.add(new SinglyLinkedListNode(50));
		s.add(node2);
		s.add(new SinglyLinkedListNode(20));
		s.add(new SinglyLinkedListNode(21));
		s.add(new SinglyLinkedListNode(22));
		s.addFirst(node3);

		assertEquals(0, s.findNodePositionByNode(null));
		assertEquals(7, s.findNodePositionByNode(node));
		assertEquals(5, s.findNodePositionByNode(node2));
		assertEquals(1, s.findNodePositionByNode(node3));
	}

	@Test
	public void SinglyLinkedListFindNodePositionOnlyOne() {
		s.add(node);
		assertEquals(1, s.findNodePositionByNode(node));
	}
	
	@Test
	public void SinglyLinkedListClear() {
		s.add(node);
		s.clear();
		assertEquals(0, s.findNodePositionByNode(node));
		assertNull(s.head);
		assertNull(s.tail);

	}
	
	@Test
	public void SinglyLinkedListFindNodePositionByPlace(){
		assertEquals(-1,s.findNodePositionByPlace(1));
	}

}
