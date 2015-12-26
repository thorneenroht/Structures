package com.structures.singly.linkedlist;

import org.apache.commons.lang3.StringUtils;

import com.structures.exceptions.SizeException;

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
		SinglyLinkedListNode temp, nodeBefore;

		if (node != null) {
			if (head == null && tail == null) {
				setHeadAndTailToNodeIfNull(node);
			} else {
				if (StringUtils.isNumeric(String.valueOf(position))
						&& size() >= position) {
					nodeBefore = findNodePositionByPlace(position - 1);
					temp = nodeBefore.next;
					node.next = temp;
					nodeBefore.next = node;
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
		if (node != null && head != null && tail != null) {
			int i = 1;
			while (temp.hasNext()) {
				if (node == temp) {
					return i;
				}
				i++;
				temp = temp.next;
			}
			return i;
		}
		return 0;
	}

	public SinglyLinkedListNode findNodePositionByPlace(int pos) {
		SinglyLinkedListNode temp = head;
		if (head != null && tail != null && pos >= 0 && pos <= size()) {
			if (pos == 1) {
				return temp;
			} else {
				while (pos > 1) {
					pos--;
					temp = temp.next;
				}
				return temp;
			}
		}

		return null;
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

	public void clear() {
		head = null;
		tail = null;
	}

	private void setHeadAndTailToNodeIfNull(SinglyLinkedListNode node) {
		head = node;
		tail = node;
	}

	public void removeFirst() {
		if(head != null){
			head = head.next;
		}
		
	}
	
	public void removeLast(){
		SinglyLinkedListNode temp;
		SinglyLinkedListNode nodeBefore = null;
		if(head != null || head.next != null){
			temp = head;
			if(temp.next != null){
				while(temp.hasNext()){
					nodeBefore = temp;
					temp = temp.next;
					
				}
				nodeBefore.next= null;
			}else{
				removeFirst();
			}
		}
	}
	
	public void removeNodeFromPosition(int pos){
		SinglyLinkedListNode temp, removeNode;
		if(head != null && pos > 0 && pos <= size()){
			temp = head;
			while(pos > 2){
				pos--;
				temp = temp.next;
			}
			removeNode = temp.next;
			temp.next = removeNode.next;
		}
	}

	public void reverseList() {
		if(head != null){
			SinglyLinkedListNode temp = head;
			SinglyLinkedListNode reverseList = null;
			SinglyLinkedListNode reverseHead = null;
			
			while(head != null){
				temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				if(reverseHead == null){
					reverseList = temp;
					reverseHead = reverseList; 
				}else{
					while(reverseList.next != null){
						reverseList = reverseList.next;
					}
					reverseList.next = temp;
				}
				removeLast();
			}
			head = reverseHead;
			
		}
		
	}
	
	public int getSize(){
		SinglyLinkedListNode temp = head;
		int i = 0;
		while(temp != null){
			temp = temp.next;
			i++;
		}
		return i;
		
		
	}

	public void deleteNodeNthFromTheEnd(int i) throws SizeException {
		SinglyLinkedListNode temp = head;
		if(i <= getSize() - 1){
			if(i == 0){
				removeLast();
			}else if(i == getSize() - 1) {
				removeFirst();
			}else{
				int num =  getSize() - i;
				while(num > 0){
					num--;
					temp = temp.next;
				}
				temp.next = temp.next.next;
			}
			
		}else{
			throw new SizeException("Age can't be less than zero");
		}
		
	}

}
