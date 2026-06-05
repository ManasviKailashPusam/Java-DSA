import java.util.Scanner
 {
     public class Main
     {
         public static floor int  sqrt(int n)
         int ans=1;
         for(int i=1;i<n;i++)
         {
             if(i*i<=n)
             {
                 ans=i;
                 
             }
             else
             {
                 break;
             }
         }
         return ans;
     }
     public static void main(String[] args)
     {
         Scanner scan=new Scanner(System.in):
         System.out.println("enter the number:");
         int n=scan.nextInt()
         System.out.println(floorSqrt(n));
         
     }
 }
