//search in linked list
 public static boolean search(int key)
 {
     Node temp=head;
     while(temp!=null)
     {
         if(temp.data==key)
         {
             return true;
         }
              temp=temp.next;
          
         return false;
     }
 }
