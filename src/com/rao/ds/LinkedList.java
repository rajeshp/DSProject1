package com.rao.ds;

public class LinkedList {

	LNode head;
	
	public LinkedList()
	{
		head=null;
	}
	public LinkedList(LNode head) {
		super();
		this.head = head;
	}
	
	// add node at head
	public void  add(LNode node)
	{
		if(head!=null)
			node.setNext(head);
		
		head=node;
		
	}
	

	
	
	
	public static void printList(LinkedList list)
	{
		LNode temp = list.head;
		
		
		while(temp!=null)
		{
			if(temp.getNext()!=null)
				System.out.print(temp.getVal()+"--->");
			else
				System.out.print(temp.getVal());
		
			temp = temp.getNext();
		}
		
	}
	
	
	
	public static LinkedList reverseList(LinkedList list)
	{
		LNode p1=list.head, p2=p1.getNext(),p3=p2;
		
		while(p3!=null || p2!=null)
		{
			p3 = p2.getNext();
			
			p2.setNext(p1);
			
			p1=p2;
			p2=p3;
			
			
		}
		
	LinkedList.printList(list);
		return list;
	}
	
}
