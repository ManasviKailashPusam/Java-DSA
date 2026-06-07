public static void main(String[] args)
 { // optimal approach loop in linked list
     public static boolean loop(Node head)
     {
         Node slow=head;
         Node fast=head;
         while(temp!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast)
             {
                 return true;
             }
         }
         return false;
         
     }
 }
