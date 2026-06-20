import java.util.Scanner;
 public class Main
 {
     public static int sum(int[]a)
     {
         int n=a.length;
         long sum=0;
         long mod=1000000007;
         for(int i=0;i<n;i++)
         {
             min=a[i];
             for(int j=i;j<n;j++)
             {
                 min=Math.min(min,a[j]);
                 sum=(sum+min)%mod;
             }
         }
         return (int)sum;
         
     }
 }
