import java.util.*;
import java.io.*;

  class Node{
    int data;
    Node next=null;
    Node(int d){
      data=d;
    }
  }
  class LinkedList{
    Node head;
    Node prev;
  public void push(int d){
    Node new_node=new Node(d);
    new_node.next=head;
    head=new_node;
    if(head==null){
      head=new_node;
    }
  }
  public void printOut(){
    Node temp=head;
    while(temp!=null & temp!=null){
      System.out.print(temp.data+" ");
        temp=temp.next;
    }
  }
  public void count(){
  Node temp=head;
  int count=0;
  while(temp.next!=null){
    temp=temp.next;
    count+=1;
  }
  System.out.println(count);
  }
  protected void swap(int x,int y){
    Node prevX=null;
    Node CurrX=head;
    while(CurrX.data!=x & CurrX!=null){
     prevX=CurrX;
     CurrX=CurrX.next;

    }
    Node CurrY=head;
    Node prevY=null;
    while(CurrY.data!=y & CurrY!=null){
      prevY=CurrY;
      CurrY=CurrY.next;
    }
    if (CurrX == null || CurrY == null){
            System.out.println("Out");
          }
    if(prevX!=null){
    prevX.next=CurrY;
  }
  else{
    head=CurrY;

  }
  if(prevY!=null){
    prevY.next=CurrX;
  }
  else{
 head=CurrY;
  }
  Node temp = CurrX.next;
        CurrX.next = CurrY.next;
        CurrY.next = temp;
}
  public static void main(String...args){
    LinkedList list=new LinkedList();
    list.push(2);
    list.push(3);
    list.push(1);
    list.push(4);
    list.push(3);
    list.push(121);
    list.push(2);
    list.push(3);
    list.push(1);
    list.push(4);
    list.push(3);
    list.push(121);
    list.printOut();
    list.count();
    list.swap(1,4);
    list.printOut();

  }
}
