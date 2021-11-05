package linkedList;

public class SingleyLinkedList {
	Node head;
	Node tail;

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			
		} else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
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

	public void insertBetweenValue(int data, int position) {
		Node currNode = new Node(data);

		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;

		}
		currNode.next = temp.next;
		temp.next = currNode;
	}

	public void popFirstElement() {

		if (head == null)
			System.out.println("No Element in Linked LIst");
		Node temp = head;
		head = head.next;

	}

	public void popLastElement() {
		if (head == null)

			if (head.next == null) {

			}

		// Find the second last node
		Node second_last = head;
		while (second_last.next.next != null)
			second_last = second_last.next;

		// Change next of second last
		second_last.next = null;

	}
	void search( int x)
	{
	    Node current = head;// Initialize current
	    int position=1;
	    while (current != null)
	    {
	        if (current.data == x)
	        	{
	        	System.out.println("Found At Location "+position);
	        	return;
	        	}
	        else {
	        current = current.next;
	        position++;
	        }
	    }
	    
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
