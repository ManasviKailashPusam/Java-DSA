 import java.util.Scanner;
 public class Main
 {
     public static boolean pallindromeList(Node slow,Node fast)
     {
        Stack<Integer>st=new stack<>();
        node temp=head;
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.next;
        }
        while(temp!=null)
        {
            temp=head
            if(temp.data!=st.peek())
            {
                return false;
            }
            st.pop();
            temp=temp.next;
            return true;
        }
         
     }
     
      
 }
