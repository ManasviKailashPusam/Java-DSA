import java.util.Scanner;
 public class Main
 {
 public static int flattenedList(Node head)
 {
     ArrayList<Integer>a=new ArrayList<>();
     Node temp=head;
     while(temp!=null)
     {
         while(t2!=null)
         {
             Node t2=a.add(t2.data);
             t2=t2.child;
         }
         temp=temp.next;
     }
     collections.Sort(a);
     head=convert(a);
     return head;
 }
 public static Node convert(Arraylist<Integer>a)
 {
     Node head=new Node(a.get[0]);
     for(int i=1;i<a.size;i++)
     {
         Node newNode=new Node(a.get(i));
         temp.child=new Node;
         temp=temp.child;
     }
     return head;
 }
 }
