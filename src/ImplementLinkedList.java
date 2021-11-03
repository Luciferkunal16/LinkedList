package linkedList;


public class ImplementLinkedList {
	public static void main(String[] args) {
		SingleyLinkedList list=new SingleyLinkedList();
		list.append(56);
		list.append(30);
		list.append(70);
		list.insertBetweenValue(12, 2);
		
		list.display();
		
		

	}

}
