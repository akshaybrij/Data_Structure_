import java.util.*;
import java.io.*;
class Rotate{
  public void rotate(int[] arr,int k,int n){
      for(int i=0;i<k;i++){
           leftbyOne(arr,n);
      }
  }
  public void leftbyOne(int[] arr,int n){
      int temp=0;
      temp=arr[0];
      int i;
      for(i=0;i<n-1;i++){
          arr[i]=arr[i+1];
      }
      arr[i]=temp;
  }
  public void printarr(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String...args){
      int[] arr={1,2,3,4,5,6,7};
      Rotate rotate=new Rotate();
      rotate.rotate(arr,2,7);
      rotate.printarr(arr);
  }
}
