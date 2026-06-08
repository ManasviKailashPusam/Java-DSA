 public static void main(String[] args)
 {
     public static int lengthOfLoop(Node head)
     {
         HashMap<Node,Integer>map=new HashMap<>();
         Node temp=head;
         int timer=1;
         while(temp!=null)
         {
             if(map.containsKey(temp))
             {
                 int value=map.get(temp);
                 return timer-value;
             }
             map.put(temp,timer);
             temp=temp.next;
         }
         return 0;
         
     }
 }
