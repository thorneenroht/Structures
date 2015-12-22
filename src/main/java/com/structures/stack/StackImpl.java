package com.structures.stack;

public class StackImpl {
	public StackNode top = null;
	public int depth = 5;
	public int size = 0;

	public void push(StackNode node) {
		StackNode temp;
		if (node != null) {
			if (top != null) {
				temp = top;
				node.next = temp;
				top = node;
			} else {
				top = node;
			}

		}
	}

	public StackNode pop() {
		StackNode temp = null;
		if(top != null){
			temp = top.next;
			top = top.next;
			temp.next = null;
		}

		return temp;

	}

}
