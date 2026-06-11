import java.util.Scanner;
 public class Main
 {
     public static Node addOne(Node head)
     {
         Node head=reverse(head);
         Node temp=head;
         carry=1;
         while(temp!=null)
         {
             temp.data=temp.data+carry;
             if(temp.data>10)
             {
                 carry=0;
                 break;
             }
             else
             {
                 carry=1;
                 temp.data=0;
             }
             temp=temp.data;
         }
         if(carry==1)
         {
             Node newNode=new Node(1);
             head=reverse(head);
             newNode=temp.next;
             return newNode;
         }
