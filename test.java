import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
interface Aks{
  final String as="Dude";
  void Bro();
}
class Bro implements Aks{
  public void Bro(){
    System.out.println("as");
  }
}
class Dude implements Aks{
  public void Bro(){
    System.out.println("Bro");
  }
}
class Fle{
  public static void main(String...args) throws IOException{
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  String di=br.readLine();
  Scanner sc=new Scanner(System.in);
  String dname=sc.next();
   Dude d=new Dude();
   d.Bro();
   Bro b=new Bro();
   b.Bro();
  File file=new File(di,dname);
  if(file.exists()){
    String[] x=file.list();
    int n=x.length;
    for(int i=0;i<n;i++){
      File fl=new File(x[i]);
      if(fl.isFile()){
        System.out.print("File"+fl);
      }
      if(fl.isDirectory()){
        System.out.println("Directory"+fl);
      }
    }
  }}
}
