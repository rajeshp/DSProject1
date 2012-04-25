//package com.rao.ds.problems;
import java.util.ArrayList;

/*
Problem : 
We are given a binary search tree; we need to find out its border.

So, if the binary tree is

           10
       /         \
     50           150
    /  \            /    \
  25    75     200    20
 / \           /            / \
15 35    120      155 250
It should print out 50 25 15 35 120 155 250 20 150 10.

If the binary tree is

               10
           /         \
         50           150
        /    \         /
      25     75     200
     / \       / \
    15 35  65 30  
It should be like 50 25 15 35 65 30 200 150 10.

How can this be done? Does generalising this for a binary tree make the problem any harder?

Any help through links will also be appreciated.

P.S.: please see that the pattern does not start from root but from the left (in this case). It might also start with right, but it always ends with the root.

Source: http://stackoverflow.com/questions/3753928/finding-border-of-a-binary-tree



*/


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


public static void  printLeafNodes(BNode root)
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
BNode oroot=root;
while(true)
{

if(root!=null && !isLeafNode(root)) 
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


al.remove(0);

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

if(root!=null && !isLeafNode(root))
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


public static void printBorderNodes(BTree tree)
{
if(tree.root!=null)
{

ArrayList<BNode> bordernodes = new ArrayList<BNode> ();

ArrayList<BNode> leftnodes = getLeftSideNodes(tree.root);
printLeafNodes(tree.root);

ArrayList<BNode> rightNodes = getRightSideNodes(tree.root);
 



}

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
/*
System.out.print("Leaf Nodes : ");
BTree.printLeafNodes(btree.root);

System.out.println();

System.out.print("Left Side Nodes : ");
ArrayList<BNode> ltree = BTree.getLeftSideNodes(btree.root);

System.out.println("\n Right Side Nodes : ");
ArrayList<BNode> rtree = BTree.getRightSideNodes(btree.root);

System.out.println();
*/


System.out.println("---------------SOLUTION---------------");
System.out.print("Border Nodes :"); 
BTree.printBorderNodes(btree);

System.out.println();
}



}


