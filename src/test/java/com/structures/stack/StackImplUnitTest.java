package com.structures.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;


public class StackImplUnitTest {
	public StackNode node, node1, node2, node3, node4;
	public StackImpl s;
	@Before
	public void setup(){
		s = new StackImpl();
		node = new StackNode(5);
		node1 = new StackNode(23);
		node2 = new StackNode(90);
		node3 = new StackNode(69);
		node4 = new StackNode(6);
	}
	
	@Test
	public void pushNullCheck(){
		s.push(null);
		assertNull(s.top);
	}
	
	@Test
	public void pushAddOne(){
		s.push(node);
		assertNotNull(s.top);
		assertEquals(node, s.top);
	}
	
	@Test
	public void pushAddFive(){
		s.push(node);
		s.push(node1);
		s.push(node2);
		s.push(node3);
		s.push(node4);

		assertNotNull(s.top);
		assertEquals(node4, s.top);
	}
	
	@Test
	public void popNullStack(){
		assertNull(s.pop());
	}
	
//	@Test
//	public void popOneStack(){
//		s.push(node);
//		assertNotNull(s.pop());
//	}
	
	
	
}
