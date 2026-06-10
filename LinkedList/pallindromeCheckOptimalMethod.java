 public class Main
 {
     public static int pallindromeCheck(Node slow,Node fast)
     {
         if(head==null   &&  head.next==null)
         {
             return true;
             
         }
         Node slow=head;
         Node fast=head;
         while(fast!=null  &&  fast.next!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
             //reverse second half
             Node newHead=reverse(slow.next);
             Node first=head;
             Node second=newHead;
             while(second!=null)
             {
                 if(first.data!=second.data)
                 {
                     reverse(newHead);
                     return false;
                 }
                 first=first.next;
                 second=second.next;
             }
             reverse(newHead);
             return true;
         }
     }
 }
