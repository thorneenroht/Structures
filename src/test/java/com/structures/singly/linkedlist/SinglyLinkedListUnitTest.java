package com.structures.singly.linkedlist;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;



public class SinglyLinkedListUnitTest {

	public SinglyLinkedList s;
	public SinglyLinkedList nCheck;
	
	@Before
	public void setUp(){
		nCheck = new SinglyLinkedList();
		s = new SinglyLinkedList();
	}
	
	@Test
	public void SinglyLinkedListAddFirstUnitTest(){
		s.addFirst(null);
		
		assertNull(s.head);
	}
	
}
