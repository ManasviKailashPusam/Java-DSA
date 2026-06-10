   approach:Store all odd-position node values first, then even-position node values in an ArrayList, and finally overwrite the linked list with the stored order. 

  //Time Complexity:O(N)
  //Space Complexity:O(N)
  // code
  import java.util.Scanner;
public class Main
{
    public static int oddEvenlist(Node head)
    {
        if(head==null   &&   head.next==null)
        {
            return head;
        }
        ArrayList<Integer>a=new ArrayList<>();
        Node head=temp;
        //stores at even position
        while(temp!=null   &&  temp.next!=null)
        {
            a.add(temp.data);
            temp=temp.next;
            
        }
        if(temp!=null)
        {
            a.add(temp.data);
        }
        //stores at even position
        
         while(temp!=null   &&  temp.next!=null)
        {
            a.add(temp.data);
            temp=temp.next;
            
        }
        if(temp!=null)
        {
            a.add(temp.data);
        }
        //add back into linked list
        while(temp!=null  && temp.next!=null)
        {
            int i=0;
            temp=head;
            temp.data=a.get(i);
            i++;
            temp=temp.next;
        }
    
    }
}

