import java.util.Scanner;
 public class Main
 {
     public class int subArraysum(int []a)
     {
         int n=a.length;
         int []pse=findPSE(a);
         int []nse=findNSE(a);
         long total=0;
         long mod=100000007;
         for(int i=0;i<n;i++)
         {
             long left=i-pse[i];
             long right=nse[i]-i;
             long contributions=(left*right)%mod;
              contributions=(contributions*a[i])%mod;
              long total=(total+contributions)%mod;
         }
         return total;
     }
     private static int[]findPSE(int []a)
     {
         int n=a.length;
         int []pse=new int[n];
         Stack<Integer>st=new Stack<>();
         for(int i=0;i<n;i++)
         {
             while(!st.isEmpty()   &&  a[st.peek()]>a[i] )
             {
                 st.pop();
             }
             pse[i]=st.isEmpty()?-1:st.peek();
             st.push(i);
             
         }
         return pse;
     }
     private static int[]findNSE(int []a)
     {
         int n=a.length;
         int []nse=new int[n];
         Stack<Integer>st=new Stack<>();
         for(int i=n-1;i>=0;i--)
         {
             while(!st.isEmpty()   &&  a[st.peek()]>=a[i] )
             {
                 st.pop();
             }
             nse[i]=st.isEmpty()?n:st.peek();
             st.push(i);
             
         }
         return nse;
     }
 }
