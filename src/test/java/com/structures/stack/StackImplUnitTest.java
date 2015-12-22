package com.structures.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackImplUnitTest {
	public StackNode node, node1, node2, node3, node4;
	public StackImpl s;

	@Before
	public void setup() {
		s = new StackImpl();
		node = new StackNode(5);
		node1 = new StackNode(23);
		node2 = new StackNode(90);
		node3 = new StackNode(69);
		node4 = new StackNode(6);
	}

	@Test
	public void pushNullCheck() {
		s.push(null);
		assertNull(s.top);
	}

	@Test
	public void pushAddOne() {
		s.push(node);
		assertNotNull(s.top);
		assertEquals(node, s.top);
	}

	@Test
	public void pushAddFive() {
		s.push(node);
		s.push(node1);
		s.push(node2);
		s.push(node3);
		s.push(node4);

		assertNotNull(s.top);
		assertEquals(node4, s.top);
	}

	@Test
	public void popNullStack() {
		assertNull(s.pop());
	}

	@Test
	public void popOneStack() {
		s.push(node);
		assertNotNull(s.pop());
	}

	@Test
	public void popMultipleStack() {
		s.push(node);
		s.push(node1);
		s.push(node2);
		s.push(node3);
		assertNotNull(s.pop());
		assertNotNull(s.pop());
		assertNotNull(s.pop());
		assertNotNull(s.pop());
		assertNull(s.pop());
	}
	
	@Test
	public void getStackSizeEmptyTest(){
		assertEquals(0, s.getStackSize());
	}
	
	@Test
	public void getStackSizeOneTest(){
		s.push(node);
		assertEquals(1, s.getStackSize());
	}
	
	@Test
	public void getStackSizeMultipleTest(){
		s.push(node);
		s.push(node1);
		s.push(node2);
		s.push(node3);
		s.push(node4);
		assertEquals(5, s.getStackSize());
	}
	
	@Test
	public void isEmptyStackTest(){
		assertTrue(s.isEmpty());
		assertFalse(s.isFull());
	}
	
	@Test
	public void isFullStackFalseTest(){
		s.push(node);
		s.push(node1);
		
		assertFalse(s.isFull());
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void isFullStackTrueTest(){
		s.push(node);
		s.push(node1);
		s.push(node2);
		s.push(node3);
		s.push(node4);
		
		assertTrue(s.isFull());
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void topTest(){
		s.push(node);
		assertEquals(node, s.top());
	}
	
	@Test
	public void topNullTest(){
		assertEquals(null, s.top());
	}
	
	 

}
