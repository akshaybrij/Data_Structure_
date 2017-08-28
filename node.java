import java.util.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
class BinTree{
  Node root;
  BinTree(int k){
    root=new Node(k);
  }
  BinTree(){
    root=null;
  }

}
class Node{
  Node left=null;
  Node right=null;
      int wt;
  Node(int item){
    wt=item;
  }
  Node(){

  }
  public void preorder(BinTree bn){
   System.out.println(bn.root.wt);
   System.out.println(bn.root.left.wt);
   System.out.println(bn.root.left.left.wt);
   System.out.println(bn.root.left.right.wt);
   System.out.println(bn.root.right.wt);
  }
  public void levelorder(BinTree bn){
    Queue<Node> pq=new LinkedList<Node>();
    pq.add(bn.root);
    while(!pq.isEmpty()){
      System.out.println(pq.peek().wt);
      Node node=pq.poll();
      if(node.left!=null){
        pq.add(node.left);
      }
      if(node.right!=null){
        pq.add(node.right);
      }
    }
  }
  public void printTrans(Node bn,int k){
    if(bn==null){
      return ;
    }
    if(k==0){
      System.out.println("----");
      System.out.println(bn.wt);
    }
    else{
      printTrans(bn.left,k-1);
      printTrans(bn.right,k-1);
    }
  }
  public static void main(String...args){
    BinTree bn=new BinTree();
    bn.root=new Node(3);
    bn.root.left=new Node(4);
    bn.root.right=new Node(5);
    bn.root.left.left=new Node(7);
    bn.root.left.right=new Node(8);
    Node n=new Node();
    n.levelorder(bn);
    n.printTrans(bn.root,2);
  }
}
