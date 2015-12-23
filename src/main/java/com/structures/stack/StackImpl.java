package com.structures.stack;

public class StackImpl {
	public StackNode top = null;
	public int depth = 3;

	public void push(StackNode node) {
		StackNode temp;
		if (node != null) {
			if (top != null  && getStackSize() < depth) {
				temp = top;
				node.next = temp;
				top = node;
			} else if(top == null) {
				top = node;
			}
		}
	}

	public StackNode pop() {
		StackNode temp = null;
		if (top != null) {
			temp = top;
			top = top.next;
			temp.next = null;
		}
		return temp;
	}

	public boolean isFull() {
		if (getStackSize() == depth) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (getStackSize() == 0) {
			return true;
		}
		return false;
	}

	public int getStackSize() {
		StackNode temp = top;
		int i = 0;
		while (temp != null) {
			i++;
			temp = temp.next;
		}
		return i;
	}
	
	public StackNode top(){
		if(top != null){
			StackNode temp = top;
			temp.next = null;
			return temp;
		}
		return null;
	}

}
