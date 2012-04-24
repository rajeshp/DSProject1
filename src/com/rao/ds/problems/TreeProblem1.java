//package com.rao.ds.problems;
import java.util.ArrayList;


class BNode{
BNode left;
int data;
BNode right;

}


class BTree
{
BNode root;

public BTree()
{
this.root=null;
}


public BTree(BNode root)
{
this.root = root;
}


// prints tree in inorder using recursion
public static void printTree(BNode root)
{

if(root!=null)
{

printTree(root.left);

System.out.print(root.data+"  ");

printTree(root.right);

}

} 


//prints tree in pre-order using recursion
public static void printTreePreOrder(BNode root)
{

if(root!=null)
{
System.out.print(root.data+" ");
printTreePreOrder(root.left);
printTreePreOrder(root.right);

}


}


//prints tree in post-order using recursion
public static void printTreePostOrder(BNode root)
{

if(root!=null)
{
printTreePostOrder(root.left);
printTreePostOrder(root.right);

System.out.print(root.data+" ");
}


}


public static void printLeafNodes(BNode root)
{

if(root!=null)
{

if(isLeafNode(root))
System.out.print(root.data+" ");
else
{
printLeafNodes(root.left);
printLeafNodes(root.right);

}

}

}


public static boolean isLeafNode(BNode root)
{
if(root!=null)
{
if(root.left==null && root.right==null)
return true;

}

return false;
}


// this will get all left side border nodes except the last left leaf node
public static ArrayList<BNode> getLeftSideNodes(BNode root)
{

ArrayList<BNode> al = new ArrayList<BNode> ();

/*
while(root.left!=null)
{
al.add(root);
root=root.left;
}
*/

while(true)
{

if(root!=null)
al.add(root);
else
break;

if(root.left!=null)
root=root.left;
else
if(root.right!=null)
root=root.right;
else
break;

}



for(BNode b : al)
{
System.out.print(b.data+" ");
}

return al;
} 



public static ArrayList<BNode> getRightSideNodes(BNode root)
{
ArrayList<BNode> al = new ArrayList<BNode>();

while(true)
{

if(root!=null)
al.add(root);
else
break;

if(root.right!=null)
root=root.right;
else
if(root.left!=null)
root=root.left;
else
break;

}

int len=al.size()-1;

for(int i=len;i>=0;i--)
System.out.print(al.get(i).data+" ");

/*
for(BNode b : al)
{
System.out.print(b.data+" ");
}

*/

return al;
}

}

class TreeProblem1
{

public static void main(String[] args)
{

//int[] a = new int[]{15,25,35,50,75,10,120,200,150,155,20,250};

//BNode[] treenodes =  new BNodes[a.length];

//BNode root=null;

BNode b1 = new BNode();
BNode b2 = new BNode();
BNode b3 = new BNode();
BNode b4 = new BNode();
BNode b5 = new BNode();
BNode b6 = new BNode();
BNode b7 = new BNode();
BNode b8 = new BNode();
BNode b9 = new BNode();

b1.data=1;
b2.data=2;
b3.data=3;
b4.data=4;
b5.data=5;
b6.data=6;
b7.data=7;
b8.data=8;
b9.data=9;

b1.left=b2;
b1.right=b3;

b2.left=b4;
b2.right=b5;

b3.left=b6;
//b3.right=b7;

b4.left=b8;
b8.right=b9;


BTree btree = new BTree(b1);
System.out.print("inorder traversal :");
BTree.printTree(btree.root);
System.out.println();
System.out.println("preoder traversal : ");
BTree.printTreePreOrder(btree.root);

System.out.println();

BTree.printTreePostOrder(btree.root);

System.out.println();

System.out.print("Leaf Nodes : ");
ArrayList<BNode> leafNodes = BTree.printLeafNodes(btree.root);

System.out.println();

System.out.print("Left Side Nodes : ");
ArrayList<BNode> ltree = BTree.getLeftSideNodes(btree.root);

System.out.println("\n Right Side Nodes : ");
ArrayList<BNode> rtree = BTree.getRightSideNodes(btree.root);

System.out.println();

System.out.println("---------------SOLUTION---------------");



System.out.println("Helladsghkhakdgjs");
}



}


