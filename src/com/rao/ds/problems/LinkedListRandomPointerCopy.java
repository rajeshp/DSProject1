package com.rao.ds.problems;

class LNode
{
int val;
LNode next;
LNode random;
public int getVal() {
	return val;
}
public void setVal(int val) {
	this.val = val;
}
public LNode getNext() {
	return next;
}
public void setNext(LNode next) {
	this.next = next;
}
public LNode getRandom() {
	return random;
}
public void setRandom(LNode random) {
	this.random = random;
}


}

class RandomPointerLinkedList
{
LNode head=null;
int size=0;
        
	public RandomPointerLinkedList()
	        {
	
	        }

	public RandomPointerLinkedList(int n)
	{
		LNode temp = new LNode();
		temp.setVal(n);
		head=temp;
	}
		
	public void printList()
	{
		LNode temp = head;
		while(temp!=null)
		{
			if(temp.getNext()!=null)
				System.out.print(temp.getVal()+"--->");
			else {
				System.out.print(temp.getVal());
			}
			
			temp=temp.getNext();
		}
	}
	
	public void printByRandomPointer()
	{
		LNode temp = head;
		int nodeindex=0;
		while(temp!=null)
		{
			if(temp.getRandom()!=null)
				System.out.println(nodeindex+" : "+temp.getVal()+"--->"+temp.getRandom().getVal());
			else {
				System.out.println(nodeindex+" : "+temp.getVal()+"---> NULL");
			}
			
			temp=temp.getNext();
			nodeindex++;
		}
	}

	public void copyList()
	{
		LNode temp = head, next=null;
		
			while(temp!=null)
			{
				
				LNode tempcopy = new LNode();
				tempcopy.setVal(temp.getVal());
				
					if(temp.getNext()!=null)
						tempcopy.setNext(temp.getNext());
					else 
						tempcopy.setNext(null);
						
					
				next = temp.getNext();
				
				temp.setNext(tempcopy);
				
				temp = next;
			}
		
			
			temp = head;next=head.getNext();
			LNode ref=null;
			while(temp!=null)
			{
				next=temp.getNext();
				
				if(temp.getRandom()!=null)
				next.setRandom(temp.getRandom().getNext());
				else {
					next.setRandom(null);
				}
				
				temp = next.getNext();
				
				
				
			}
			
			
			
			
	}

	
	public void breaklists()
	{
		
		LNode temp = head,temp1=head.getNext();
		LNode head1 = temp, head2 = temp1,ref=null;
		
		
		while(temp1!=null)
		{
			temp.setNext(temp1.getNext());
			ref= temp1.getNext();
			temp=temp1;
			temp1=ref;
			
		}
		
		
		System.out.println("\n Original List : ");
		RandomPointerLinkedList origList= new RandomPointerLinkedList();
		origList.head = head1;
		
		origList.printList();
		
		System.out.println("\n Original List by random pointers :");
		origList.printByRandomPointer();
		
		System.out.println("\n COpied List : ");
		RandomPointerLinkedList newList= new RandomPointerLinkedList();
		newList.head = head2;
		
		newList.printList();
		
		System.out.println("\n Copied List by random pointers :");
		newList.printByRandomPointer();
		
	}
	
}





public class LinkedListRandomPointerCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] arr = new int[] {20,30,50,10,60};
			LNode[] nodes = new LNode[arr.length];
			LNode previous = null;
			for(int i=0;i<arr.length;i++)
			{
				nodes[i]= new LNode();
				nodes[i].setVal(arr[i]);
					if(previous!=null)
						previous.setNext(nodes[i]);
				previous = nodes[i];	
			}
			
			
			nodes[0].setRandom(nodes[2]);
			nodes[1].setRandom(nodes[3]);
			nodes[2].setRandom(nodes[4]);
			nodes[3].setRandom(nodes[1]);
			nodes[4].setRandom(nodes[2]);
			
			
			RandomPointerLinkedList rlist = new RandomPointerLinkedList();
			
			rlist.head = nodes[0];
			
			rlist.printList();
			System.out.println("\n");
			rlist.printByRandomPointer();
			
			System.out.println();
			System.out.println("List after copy : \n");
			
			
			rlist.copyList();
			rlist.printList();
			System.out.println("\n");
			rlist.printByRandomPointer();
			
			System.out.println("Now breaking list \n \n ");
			
			rlist.breaklists();
			
			//rlist.printList();*/
			System.out.println("end");
	}
	
	
	public void copyList(RandomPointerLinkedList list)
	{
		LNode temp = list.head, next=null;
		
			while(temp!=null)
			{
				
				LNode tempcopy = new LNode();
				tempcopy.setVal(temp.getVal());
				
					if(temp.getNext()!=null)
						tempcopy.setNext(temp.getNext());
					else 
						tempcopy.setNext(null);
						
					
				next = temp.getNext();
				
				temp.setNext(tempcopy);
				
				temp = next;
			}
		
			
			temp = list.head;next=list.head.getNext();
			LNode ref=null;
			while(temp!=null)
			{
				next=temp.getNext();
				
				if(temp.getRandom()!=null)
				next.setRandom(temp.getRandom().getNext());
				else {
					next.setRandom(null);
				}
				
				temp = next.getNext();
				
				
				
			}
			
			
			
			
	}

	
	public void breaklists(RandomPointerLinkedList list)
	{
		
		LNode temp = list.head,temp1=list.head.getNext();
		LNode head1 = temp, head2 = temp1,ref=null;
		
		
		while(temp1!=null)
		{
			temp.setNext(temp1.getNext());
			ref= temp1.getNext();
			temp=temp1;
			temp1=ref;
			
		}
		
		
		System.out.println("\n Original List : ");
		RandomPointerLinkedList origList= new RandomPointerLinkedList();
		origList.head = head1;
		
		origList.printList();
		
		System.out.println("\n Original List by random pointers :");
		origList.printByRandomPointer();
		
		System.out.println("\n COpied List : ");
		RandomPointerLinkedList newList= new RandomPointerLinkedList();
		newList.head = head2;
		
		newList.printList();
		
		System.out.println("\n Copied List by random pointers :");
		newList.printByRandomPointer();
		
	}

}
