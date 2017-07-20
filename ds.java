import java.util.*;
import java.io.*;
class Llist{
  Node head;
  Node prev;
  class Node{
    int data;
    Node next;
    Node(int d){
      data=d;
      next=null;
    }
  }
public void push(int d){
  Node new_node=new Node(d);
  new_node.next=head;
  head=new_node;

}
protected void anywhere(int d,Node prev_node){
  if(prev_node==null){
    System.out.println("Previous node is null");
  }
  Node new_node=new Node(d);
  new_node.next=prev_node.next;
  prev_node.next=new_node;
}
public void last_node(int d,Node node){
  Node new_node=new Node(d);
  if(node.next==null){
    node.next=new_node;
  }
}
protected void delete_node(int key){
Node temp=head;
while(temp!=null & temp.data!=key){
  prev=head;
  head=temp.next;
}
}
public void delete_key_node(int position){
  Node temp=head;
  if(position==0){
    head=temp.next;
  }
  for(int i=0;i<position-1;i++){
    temp=temp.next;
    if(temp==null){
      return ;
    }
  }
    Node next=temp.next.next;
    temp.next=temp;
}
public void printList(){
  Node tmp=head;
  if(tmp.next!=null){
    System.out.println(tmp.data+" ");
    tmp=tmp.next;
  }
}
}
class DS{
  public static void main(String...args){
    Llist list=new Llist();
    list.push(4);
    list.push(2);
    list.push(1);
    list.anywhere(3,list.head.next);
    list.printList();

  }
}
