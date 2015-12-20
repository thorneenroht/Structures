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
	public SinglyLinkedListNode node;
	public SinglyLinkedListNode node2;

	@Before
	public void setUp() {
		nCheck = new SinglyLinkedList();
		s = new SinglyLinkedList();
		node = new SinglyLinkedListNode(1);
		node2 = new SinglyLinkedListNode(2);
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
		s.head = node;
		s.tail = node;
		s.addFirst(node2);
		
		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.head.val, node2.val);
		assertEquals(s.tail.val, node.val);
	}
	
	@Test
	public void SinglyLinkedListAddLastNull(){
		s.addLast(null);
		
		assertNull(s.head);
		assertNull(s.tail);
	}

	@Test
	public void SinglyLinkedListAddLastNode(){
		s.addLast(node);
		
		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node.val);
		assertEquals(s.head.val, node.val);
	}
	
	@Test
	public void SinglyLinkedListAddLastNodeWhenListNotEmpty(){
		s.head = node2;
		s.tail = node2;
		s.addLast(node);
		
		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node.val);
		assertEquals(s.head.val, node2.val);
	}
	
	@Test
	public void SinglyLinkedListAddNull(){
		s.add(null);
		
		assertNull(s.head);
		assertNull(s.tail);
	}
	
	@Test
	public void SinglyLinkedListAddNode(){
		s.add(node);
		
		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node.val);
		assertEquals(s.head.val, node.val);
	}
	
	
	@Test
	public void SinglyLinkedListAddNodeWhenListNotEmpty(){
		s.head = node2;
		s.tail = node2;
		s.add(node);
		
		assertNotNull(s.head);
		assertNotNull(s.tail);
		assertEquals(s.tail.val, node2.val);
		assertEquals(s.head.val, node.val);
	} 
}
