 //add first
     public static void addFirst(int data)
     {
         Node newNode=new Node(data);
         newNode.next=head;
         head=newNode;
     }
