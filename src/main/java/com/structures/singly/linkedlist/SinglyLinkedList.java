package com.structures.singly.linkedlist;

public class SinglyLinkedList {


	public SinglyLinkedListNode head;
	
	public SinglyLinkedListNode tail;
	
	public SinglyLinkedList(){
		head = null;
		tail = null;
	}
	
	public void addFirst(SinglyLinkedListNode newNode){
		if(newNode != null){
			if(head == null && tail == null){
				head =newNode;
				tail = newNode;
			}else{
				newNode.next = head;
				head = newNode;
			}
		}
		return;
	}
	
}
