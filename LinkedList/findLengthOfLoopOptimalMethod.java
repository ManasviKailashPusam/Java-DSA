public static int countNode(Node head)
 {
     Node slow=head;
     Node fast=head;
     while(fast!=null   && fast.next!=null)
     {
         slow=slow.next;
         fast=fast.next.next;
         if(slow==fast)
         {
             return findlength(slow,fast);
         }
     }
     return 0;
 }
 public static int findLength(Node slow,Node fast)
 {
     int count=1;
     while(slow!=fast)
     {
         count++;
         fast=fast.next;
     }
     return count;
 }
