 import java.util.Scanner;
   class MinStack
   {
       Stack<long>st=new Stack<>();
       int mini;
       public static void push(int val)
       {
           int val=x;
           if(st.isEmpty())
           {
               mini=x;
               st.push(x);
           }
           else
           {
               if(x>=mini)
               {
                   st.push(x);
               }
               else{
                   st.push(2*x-mini);
                   mini=x;
               }
           }
       }
       public static void pop()
       {
           if(st.empty())
           {
               return -1;
           }
           long top=st.pop();
           if(top<mini)
           {
               mini=2*mini-top;
           }
       }
       public static int top()
       {
           if(isEmpty())return -1;
           long top=st.peek();
           if(top>=mini)
           {
               return top;
           }
           return mini;
       }
       public static int getMin()
       {
           if(isEmpty())
           {
               return -1;
           }
           return mini;
       }
   }
