 public static void main(String[] args)
 {
     public static int reverseList(Node head)
     {
         Stack<Integer>st=new Stack<>();
         Node temp=head;
         while(temp!=null)
         {
             st.push(temp.data);
             temp=temp.next;
         }
         temp=head;
         while(temp!=null)
         {
          temp.data=st.peek();
          st.pop();
          temp=temp.next;
         }
         return head;
     }
 }
