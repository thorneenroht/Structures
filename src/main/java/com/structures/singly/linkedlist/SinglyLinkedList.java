package com.structures.singly.linkedlist;

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
			}else{
				node.next = head;
				head = node;
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

	private int findNodePosition(SinglyLinkedListNode node) {
		int i = 0;
		if (head != node) {
			while (head.hasNext()) {
				i++;
				if (head.next == node) {
					return i;
				}
			}
		}
		return 0;

	}

	private void setHeadAndTailToNodeIfNull(SinglyLinkedListNode node) {
		head = node;
		tail = node;
	}

}
