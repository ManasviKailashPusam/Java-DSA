 import java.util.Scanner;
 public class stockSpanner
 {
     Stack<int[]>st;
     int index;
     stockSpanner()
     {
         st=new int<>();
         index=-1;
     }
     public static int next(int price)
     {
         index++;
         while(st.isEmpty()   &&   st.peek()[0]>price)
         {
             st.pop();
         }
         if(st.isEmpty())
         {
             int span=index+1;
         }
         else 
         {
             span=index-st.peek()[1];
         }
         st.push(new int[]{price,index});
     }
     return ans;
 }
