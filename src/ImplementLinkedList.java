package linkedList;

import java.util.Scanner;

public class ImplementLinkedList {
	public static void main(String[] args) {
		SingleyLinkedList list=new SingleyLinkedList();
		int choice;
		Scanner inp=new Scanner(System.in);
		do{
		
		System.out.println("Welcome to Menu of Linked list");
		System.out.println("1)Append");
		System.out.println("2)Push");
		System.out.println("3)Display Linked List");
		System.out.println("4)Insert at Certain Index");
		System.out.println("5)Pop First Element");
		System.out.println("6)Pop Last Element");
		System.out.println("7)Search For an Element");
		System.out.println("8)Insert Location between two data item");
		System.out.println("9)Sort Linked List");
				System.out.println("10)Exit");

		
		
		choice=inp.nextInt();
		
		
		if (choice==1) {
			System.out.println("Enter The Element to append");
			int num=inp.nextInt();
			list.append(num);
			
		}
		else if(choice==2)
		{
			System.out.println("Enter the Element to push");
			int num=inp.nextInt();
			list.push(num);
		}
		else if (choice ==3 )
		{
			list.display();
		}
		else if(choice==4) 
		{
			System.out.println("Enter the Elemnet ");
			int num=inp.nextInt();
			System.out.println("Enter the position ");
			int position=inp.nextInt();
			list.insertBetweenValue(num, position);
		}
		else if(choice==5)
		{
			list.popFirstElement();
		}
		else if(choice==6)
		{
			list.popLastElement();
		}
		else if (choice==7)
		{
			System.out.println("Enter the element you want to search");
			int num=inp.nextInt();
			list.search(num);
		}
		else if(choice==8) {
			System.out.println("Enter the new Node data");
			int newdata=inp.nextInt();
			System.out.println("Enter the First Element");
			int first=inp.nextInt();
			System.out.println("Enter the Secound Element");
			int secound=inp.nextInt();
			list.insertBetweenTwoNodeByValue(newdata, first, secound);
		}
		else if(choice==9) {
			list.sortList();
		}
		System.out.println();
		
		}while(choice!=10);
		
	
		
		

	}

}
