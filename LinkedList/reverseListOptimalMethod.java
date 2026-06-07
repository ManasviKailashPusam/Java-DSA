public static void main(String[] args)
 {
     public static int reverseList(Node head)
     {
          Node prev=null;
          Node temp=head;
          while(temp!=null)
          {
              front=temp.next;
              temp.next=prev;
              prev=temp;
              temp=front;
          }
     }
     return head;
 }
