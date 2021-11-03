package linkedList;

public class SingleyLinkedList {
	Node head;
	Node tail;
	
	public void insert(int data) {
		Node newNode=new Node(data);
	
		
		if (head==null)
		{
			head=newNode;
		}
		else 
		{
			Node n=head;
			while(n.next!=null) 
			{
				n=n.next;
			}
			n.next=newNode;
		}
		
		
		
	}
	public Node push(int data) {
		Node newNode=new Node (data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			
			
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		return newNode;
		
		
	}
	public void display() {
		Node n=head;
		if(head==null) {
			System.out.println("Linked list is Empty");
			
		}
		else
		{
			while(n!=null)
			{
				System.out.print(n.data +" ");
				n=n.next;
			}
		}
	}

}
