package MyLinkedList;

class MyLinkedList<E>{
	class Node<E>{
		E data;
		Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		}
	}
	
	Node<E> head;
	
	void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		if(head == null) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	boolean isEmpty() {
		return head == null;
	}
}
