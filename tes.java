import java.util.*;
import java.io.*;
enum Tes{
Monday,Tuesday,Wednesday;
}
class Test{
  Tes day;
  public Test(Tes day){
    this.day=day;
  }
public void Itsday() {
  switch(day){
    case Monday:
    System.out.println("Bro Mon");
    case Tuesday:
    case Wednesday:
      System.out.println("Mon Mon");
    default:
     System.out.print("Def");
  }}
}
class Student{
  int roll;
  public Student(){
    this.roll=getRoll();
    this.roll=getRoll();
    System.out.println(this.roll+"Roll");
  }
  static int counter = 0;
  static int getRoll(){
    counter++;
    return counter;
  }
}
class Resm extends Fle{
  public static void main(String...args){
    String ft="Tuesday";
    Test t=new Test(Tes.valueOf(ft));
    Student s =new Student();
    int a;
    StringBuffer sds=new StringBuffer("Hello");
    sds.insert(5,"Geeks");
    StringTokenizer str=new StringTokenizer("Sach, Keh raha hai dewana",",");
    while(str.hasMoreTokens()){
      System.out.println(str.nextToken());
    }
    System.out.println(sds);
    a=getRoll();
    t.Itsday();
    Fle f=new Fle();
  }
}
class Fle{
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  String di=br.readLine();
  Scanner sc=new Scanner(System.in);
  String dname=sc.next();
  File file=new File(di,dname);
  if(file.exists()){
    String[] x=file.list();
    int n=x.length;
    System.out.print(n);
  }
}
