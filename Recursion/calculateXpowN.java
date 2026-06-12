import java.util.Scanner;
 public class Main
 {
     public static int calPow(int x,int n)
     {
         if(x==0)
         {
             return 1;
         }
         if(n==0)
         {
             return 0;
         }
         int xpownm1 =calPow(x,n-1);
         int xpown=x*xpownm1;
         return xpown;
         
         
     }
     public static void main(String[] args)
     {
         int x=2;
         int n=5;
         int ans=calPow(x,n);
         System.out.println(ans);
     }
 }
