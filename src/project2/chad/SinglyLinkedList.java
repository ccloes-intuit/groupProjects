package project2.chad;

import project2.chad.AbstractMap.MapEntry;

class SinglyLinkedList <E> implements Cloneable {
	
	private static class Node<E> {
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() { return element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> n) { next = n; }
	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public SinglyLinkedList() {};
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }

	public int getSize () {
		return size;
	}

	public E first() {
		if (isEmpty()) return null;
		return head.getElement();
	}
	
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	
	public E next() {
		if (isEmpty()) return null;
		return head.element;
	}
	
	public void addFirst (E e) {
		head = new Node<E>(e, head);
		if (size == 0)
			tail = head;
		size++;
	}
	
	public void addLast(E e) {
		Node<E> newest = new Node<E>(e, null);
		if (isEmpty())
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}
	
	public E removeFirst() {
		if (isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return answer;
	}
	
	@SuppressWarnings("unchecked")
	public SinglyLinkedList<MapEntry> clone() throws CloneNotSupportedException {
	    return (SinglyLinkedList<MapEntry>) super.clone();
	}
	

	public SinglyLinkedList<MapEntry> removeLast() {
		SinglyLinkedList<MapEntry> temp = null;
		SinglyLinkedList<MapEntry> newList = new SinglyLinkedList<MapEntry>();
		try {
			temp = this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		do {
			// System.out.println("This is the current value = " + temp.first().getName());
			newList.addLast(temp.head.getElement());
			temp.removeFirst();
		} while (temp.head.next != null);
		
		return newList;
	}

}