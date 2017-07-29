import java.util.*;
import java.io.*;
class Node{
  int data;
  Node next;
  Node(int wt){
    data=wt;
    next=null;
  }
}
class ListSort{
  Node head;
  public void sort(){
    int count[]={0,0,0};
    Node ptr=head;
    while(ptr!=null){
      count[ptr.data]++;
      ptr =ptr.next;
    }
    int i=0;
    ptr=head;
    while(ptr!=null){
      if(count[i]==0){
        i++;
      }
      else{
        ptr.data=i;
        count[i]--;
        ptr=ptr.next;
      }
    }
  }
  public void print(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"");
      temp=temp.next;
    }
  }
  public void push(int w){
    Node new_node=new Node(w);
    new_node.next=head;
    head=new_node;
  }
  public static void main(String...args){
    ListSort ls= new ListSort();
        ls.push(0);
        ls.push(1);
        ls.push(0);
        ls.push(2);
        ls.push(1);
        ls.push(1);
        ls.push(2);
        ls.push(1);
        ls.push(2);
        ls.sort();
        ls.print();
  }
}
