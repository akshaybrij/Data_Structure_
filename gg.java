import java.util.*;
import java.io.*;
import java.util.Arrays;
class gg{
public static void main(String...args){
  Scanner sc =new Scanner(System.in);
  int otp=Integer.parseInt(sc.next());
  for(int i=0;i<otp;i++){
    Scanner scc= new Scanner(System.in);
    String ff[]=scc.nextLine().split("\\s+");
    int n=Integer.parseInt(ff[0]);
    int k =Integer.parseInt(ff[1]);
      jj(n,k);
  }
}
public static void jj(int n,int k){
    int z[]=new int[10];
    int g=0,cnt=0;
    Scanner sc= new Scanner(System.in);
    String ff[]=sc.nextLine().split("\\s+");
    for(int i=0;i<ff.length;i++){
    z[i]=Integer.parseInt(ff[i]);
    }
    Arrays.sort(z);
    List b = Arrays.asList(z);
    int max=z[0];
    for(int j=0;j<z.length;j++){
      if(z[j]>max){
        max=z[j];
      }
    }
    System.out.println(k);
    while((max-z[g])>k){
     max-=1;
     g+=1;
     cnt+=1;
     System.out.println("go"+cnt);
    }
    
}
}
