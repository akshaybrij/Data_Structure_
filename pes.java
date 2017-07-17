import java.util.*;
import java.io.*;
class Tes{
  int p=32;
  public static void main(String...args){
    String r[]={"asd"};
    String j[]={"asd"};
    Object c[]={r};
    Object n[]={j};
    if(Arrays.deepEquals(c,n)){
      System.out.println("same");
      Tes t= new Tes();
      System.out.println(t.p);
      final int arr[]={1,2,3};
      int m[]={4,5,6};
      ArrayList<Integer> arm=new ArrayList<Integer>();
      arm.add(12);
      arm.add(23);
      arm.get(0);
      int x=(int)2.33;
      Object ma[]=arm.toArray();
       System.out.println(arm.size());
       for(Integer xs:arm){
         System.out.println(xs);
       }
    }
    else{
      System.out.println("Not Same");
    }
  }
}
