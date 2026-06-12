 import java.util.Scanner;
 public class Main
 {
     public static int f(int n)
     {
         if(n<=1)
         {
             return n;
         }
         int last=f(n-1);
         int slast=f(n-2);
         return last+slast;
     }
     public static void main(String[] args)
     {
         Scanner scan=new Scanner(System.in);
         int n=3;
         System.out.println(f(3));
     }
 }
