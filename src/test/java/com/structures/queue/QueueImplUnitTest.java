package com.structures.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class QueueImplUnitTest {
	QueueNode node, node1, node2, node3, node4;
	QueueImpl q;
	
	@Before
	public void setup() {
		q = new QueueImpl();
		node = new QueueNode(5);
		node1 = new QueueNode(5);
		node2 = new QueueNode(5);
		node3 = new QueueNode(5);
		node4 = new QueueNode(5);
	}
	
	@Test
	public void addNullTest(){
		q.add(null);
		assertNull(q.head);
	}
	
	@Test
	public void addOneTest(){
		q.add(node);
		assertNotNull(q.head);
	}
	
	@Test
	public void addMultipleTest(){
		q.add(node);
		q.add(node1);
		q.add(node2);
		q.add(node3);
		assertNotNull(q.head);
		assertEquals(node, q.head);
	}
	
	@Test
	public void elementNullTest(){
		assertNull(q.element());
	}
	
	@Test
	public void elementNotNullTest(){
		q.add(node);
		assertNotNull(q.element());
	}
	
	@Test
	public void peekNullTest(){
		assertNull(q.peek());
	}
	
	@Test
	public void peekNotNullTest(){
		q.add(node);
		assertNotNull(q.peek());
	}
	
	@Test
	public void removeNullTest(){
		assertNull(q.remove());
	}
	
	@Test
	public void removeTest(){
		q.add(node);
		q.add(node1);
		assertNotNull(q.remove());
		assertEquals(node1, q.remove());
	}
	
	@Test
	public void pollNullTest(){
		assertNull(q.poll());
	}
}
