package com.structures.singly.linkedlist;

import org.apache.commons.lang3.StringUtils;

public class SinglyLinkedList {

	public SinglyLinkedListNode head;

	public SinglyLinkedListNode tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public void addFirst(SinglyLinkedListNode node) {
		if (node != null) {
			if (head == null && tail == null) {
				setHeadAndTailToNodeIfNull(node);
			} else {
				node.next = head;
				head = node;
			}
		}
	}

	public void addLast(SinglyLinkedListNode node) {
		if (node != null) {
			if (head == null && tail == null) {
				setHeadAndTailToNodeIfNull(node);
			} else {
				tail.next = node;
				tail = tail.next;
			}

		}
	}

	public void add(SinglyLinkedListNode node) {
		if (node != null) {
			if (head == null && tail == null) {
				setHeadAndTailToNodeIfNull(node);
			} else {
				addFirst(node);
			}
		}

	}

	public void add(int position, SinglyLinkedListNode node) {
		if (node != null) {
			if (head == null && tail == null) {
				setHeadAndTailToNodeIfNull(node);
			} else {
				if (StringUtils.isNumeric(String.valueOf(position))
						&& size() >= position) {
						
				} else {
					addFirst(node);
				}
			}
		}

	}

	private SinglyLinkedListNode getLastNode(SinglyLinkedListNode node) {
		SinglyLinkedListNode temp = head;
		while (temp.hasNext()) {
			temp = temp.next;
		}
		return temp;
	}

	public int findNodePositionByNode(SinglyLinkedListNode node) {
		SinglyLinkedListNode temp = head;
		if(node != null  && head != null && tail != null){
			int i = 1;
			while(temp.hasNext()){
				if(node == temp){
					return i;
				}
				i++;
				temp = temp.next;
			}
			return i;
		}
		return 0;
	}
	
	public int findNodePositionByPlace(int pos){
		if(head != null && tail != null && pos >= 0){
			
		}
		
		return -1;
	}
	
	
	
	
	

	public int size() {
		int i = 0;
		SinglyLinkedListNode temp = head;
		if (head != null && tail != null) {
			i = 1;
			while (temp.hasNext()) {
				temp = temp.next;
				i++;
			}

		}
		return i;
	}

	public void clear(){
		head = null;
		tail = null;
	}
	
	private void setHeadAndTailToNodeIfNull(SinglyLinkedListNode node) {
		head = node;
		tail = node;
	}
	
}
