package com.rao.ds;

public class LinkedList {

	LNode head=null;
	
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
	
	
	// reverse a linked list without extra space using 3 pointer method in O(n) time, also handles end cases 
	public static LinkedList reverseList(LinkedList list)
	{
		if(list.head==null)
			return list;
		
		LNode p1=list.head, p2=p1.getNext(),p3=p2;
		
		while(p3!=null || p2!=null)
		{
			p3=p2.getNext();
			p1.setNext(null);
			p2.setNext(null);
			list.add(p2);
			
			
			p1=p3;
			p2=p3;
			
			//System.out.println("\n "+p2.getVal()+" "+p2.getNext().getVal()+"");
			
			
			
		}
		
	//LinkedList.printList(list);
		return list;
	}
	
}
