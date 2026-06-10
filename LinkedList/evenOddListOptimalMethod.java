import java.util.Scanner;
public class Main
{
public static int oddEvenList(Node head)
{
       ListNode odd=head;
       ListNode even=head.next;

        ListNode EvenHead=even;
     while(even!=null   &&  even.next!=null)
     {
       odd.next=odd.next.next;
       even.next=even.next.next;
       
       odd=odd.next;
       even=even.next;
     }
    odd.next=EvenHead;
  return head;
  }
}
 


      
