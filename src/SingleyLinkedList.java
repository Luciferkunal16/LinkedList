package linkedList;

public class SingleyLinkedList {
	Node head;
	Node tail;



	 public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            head.next = this.tail;
	        } else {
	            if (head.next == null) {
	                newNode.prev = head;
	                head.next = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                newNode.prev = this.tail;
	                tail = newNode;
	            }
	        }
	     
	    }

	public Node push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			newNode.next = head;
			head = newNode;
		}
		return newNode;

	}

	public void display() {
		Node n = head;
		if (head == null) {
			System.out.println("Linked list is Empty");

		} else {
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
		}
	}

}
