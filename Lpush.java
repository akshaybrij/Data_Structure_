import java.io.*;
import java.util.*;
class Node{

  int data;
  Node next;
  Node(int d){
    data=d;
    next=null;
  }
}
class Lpush{
Node head;
  public void push(int d)
  {
    Node new_node=new Node(d);
    new_node.next=head;
    head=new_node;
  }
  protected void print(){
    Node temp=head;
    while(temp!=null){
      System.out.println(temp.data+" ");
      temp=temp.next;
    }
  }
  public static void main(String...args){
    Lpush lp=new Lpush();
    lp.push(23);
    lp.push(10);
    lp.push(110);
    lp.print();

  }
}
