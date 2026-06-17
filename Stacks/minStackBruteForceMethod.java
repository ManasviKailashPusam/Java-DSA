 import java.util.Scanner
   public class MinStack
   {
       static class Pair
       {
           int val;
           int min;
           Pair(int val,int min)
           {
               this.val=val;
               this.min=min;
           }
       }
       Stack<Pair>st
      public MinStack()
      {
          st=new Stack<>();
      }
      public static void push()
      {
          if(st.empty())
          {
              st.push(newPair(val,val));
          }
          else
          {
              int currentMin=Math.min(val,st.peek().min);
              st.push(newPair(val,currentMin));
          }
      }
      public static void pop()
      {
          if(!st.empty())
          {
              st.pop()
          }
      }
      public static void top()
      {
          if(st.empty())
          {
              return -1;
          }
          return st.peek();
      }
      public  static void min
      {
          if(st.empty())
          {
              return -1;
          }
          return st.peek().min;
      }
   }
