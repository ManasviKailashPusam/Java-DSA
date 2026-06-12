import java.util.Scanner;
 public class Main
 {
     public static int fact(int n)
     {
         if(n==0)
         {
             return 1;
         }
         return n*fact(n-1);
     }
     public static void main(String[] args)
     {
         Scanner scan=new Scanner(System.in);
         
         int ans=fact(3);
         System.out.println("fact is:"+ans);
     }
 }
