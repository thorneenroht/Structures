package com.structures.trees.bst;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class BSTImpleUnitTest {
	BSTNode node;
	BSTImpl s = new BSTImpl();
	
	@Before
	public void setup(){
		node = new BSTNode(4);
	}
	
	@Test
	public void insertNullTest(){
		s.insert(null);
		
		assertNull(s.head);
	}
}
