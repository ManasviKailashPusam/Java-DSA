 public static void main(String[] args)
 {
     public class Main
     {
         public static int sortList(Node head)
         {
             Node Zerohead=new Node (-1);
             Node Onehead=new Node (-1);
             Node Twohead=new Node (-1);
             
               Node zero=Zerohead;
                Node one=onehead;
                 Node two=twohead;
                 
                 while(temp!=null)
                 {
                     if(temp.data==0)
                     zero.next=temp;
                     zero=temp;
                    else  if(temp.data==1)
                     one.next=temp;
                     one=temp;
                       
                     two.next=temp;
                     two=temp;
                 }
                 temp=temp.next;
                 //connect links
                 zero.next=(onehead.next!=null)?onehead.next:twohead.next;
                 one.next=two.next;
                 two.next=null;
                 Node newhead=zerohead.next;
                 return newhead;
                 
                 
             
             
         }
     }
 }
