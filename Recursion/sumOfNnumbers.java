import java.util.Scanner;
 public class Main
 {
     public static int sum(int n)
     {
         if(n==0)
         {
             return 0;
         }
         return n+sum(n-1);
     }
     public static void main(String[] args)
     {
         Scanner scan=new Scanner(System.in);
         
         int ans=sum(3);
         System.out.println("sum is:"+ans);
     }
 }
