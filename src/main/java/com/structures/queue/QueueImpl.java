package com.structures.queue;

public class QueueImpl {
	QueueNode head;

	public void add(QueueNode node) {
		QueueNode findTail = head;
		if (node != null) {
			if (head != null) {
				while (findTail != null) {
					findTail = findTail.next;
				}
				findTail = node;

			} else {
				head = node;
			}
		}

	}

	public QueueNode element() {
		return head;
	}

	public QueueNode peek() {
		if (head != null) {
			return head;
		}
		return null;
	}

	public QueueNode poll() {
		QueueNode temp = head;
		if (head != null) {
			head = head.next;
			return temp;
		}
		return null;
	}

	public QueueNode remove() {
		QueueNode temp = head;

		head = head.next;
		return temp;

	}
}
