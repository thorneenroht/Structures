package com.structures.singly.linkedlist;

public class SinglyLinkedListNode {
	int val;
	SinglyLinkedListNode next;
	public SinglyLinkedListNode(int x) { val = x; }
	public boolean hasNext(){
		if(next != null){
			return true;
		}
		return false;
	}
}
