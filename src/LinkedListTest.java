import com.rao.ds.LNode;
import com.rao.ds.LinkedList;


public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList mylist= new LinkedList();
		
		int[] a = new int[] {5,56,74,798,522,565,56565,5565656,20,30,70,80,90,100};
		LNode[] nodes = new LNode[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			nodes[i]= new LNode();
			nodes[i].setVal(a[i]);
			mylist.add(nodes[i]);
		}
		
		
		
		
		//mylist.add(a);
		
		
		
		System.out.print("mylist : ");
		LinkedList.printList(mylist);
		System.out.println("\n\n");
		mylist = LinkedList.reverseList(mylist);
		System.out.print("mylist : ");
		LinkedList.printList(mylist);
	}

}
