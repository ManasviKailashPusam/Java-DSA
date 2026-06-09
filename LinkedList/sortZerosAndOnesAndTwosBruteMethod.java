import java.util.Scanner
 {
     public class Main
     {
         public static int sortLinkedList(Node head)
         {
             Node temp=head;
             int count0;
             count1=0;
             count2=0;
             while(temp!=null)
             {
                 if(temp.data==0)
                 {
                     count0++;
                     
                 }
                 else if(temp.data==1)
                 {
                     count1++;
                 }
                 else
                 {
                     count2++;
                 }
             }
             tem=temp.data;
             temp=head;
             while(temp!=null)
             {
                 if(count0>0)
                 {
                     temp.data=0;
                     count0--;
                 }
                 else if(count1>0)
                 {
                     temp.data=1;
                     count1--;
                 }
                 else
                 {
                     temp.data=2;
                     count2--;
                 }
             }
             return head;
         }
     }
 }
