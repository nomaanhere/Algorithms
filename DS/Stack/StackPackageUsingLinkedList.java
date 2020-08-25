package MyStackLL;

class MyStackLL{
	class ListNode {
		ListNode next;
		int data;
		ListNode(int data){
			this.data = data;
			next = null;
		}
	}

	ListNode head = null;
	int size = 0;
	public void push(int data) {
		ListNode n = new ListNode(data);
		if(head == null) {
			head = n;
		}
		n.next = head;
		head = n;
		size++;
	}
	
	public int pop() {
		if(head != null) {
			ListNode temp = head;
			head = head.next;
			size--;
		}
		return head.data;
	}
	
	public int peek() {
		return head.data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
