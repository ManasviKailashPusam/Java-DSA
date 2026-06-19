import java.util.Scanner;
 public class Main
 {
     public static int nextGreaterElement(int[]a)
     {
         int n=a.length;
         int[]a=new int[n];
         Stack<Integer>st=new Stack<>();
         for(int i=n-1;i>=0;i--)
         {
             while(!st.isEmpty()   &&  st.peek()<=a[i]  )
             {
                 st.pop();
             }
             if(st.isEmpty())
             {
                 return -1;
             }
             else
             {
                 nge[i]=st.peek();
             }
             st.push(a[i]);
         }
         return nge;
     }
 }
