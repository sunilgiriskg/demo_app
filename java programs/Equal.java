import java.io.*;

public class Equal{
   public static void main(String[] args){
      Base base = new Base();
      base.print();
   }

public abstract static class Base{

   public int i;
   public void print(){
      System.out.println("hello i m in Base");
   }
//   abstract void func();
}
public static class Derived extends Base{

   public int j;
   public void print(){
      System.out.println("hello im in Derived");
   } 
   void func(){
   }
}
}
