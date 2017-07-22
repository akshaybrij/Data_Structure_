import java.util.*;
import java.io.*;
class Node{
  Node left;
    Node right;
  Node(int key){
  int item=key;
  left=right=null;
  }
}
class Huffman{
  Node root;
  Huffman(int key){
    root=new Node(key);
  }
  Huffman(){
    root=null;
  }
  public static void main(String...args){
    Huffman huff=new Huffman();
    huff.root=new Node(12);
    huff.root.left=new Node(32);
    huff.root.right=new Node(121);
    huff.root.left.left=new Node(232);
    System.out.println(huff.root.left);
  }
}
