 Node flatten(Node head)
  {
      if(head==null  &&  head.next!=null)
      {
          return head;
          mergedHead=flatten(head.next);
          return merge(head,mergedHead);
      }
  }
  public static Node merge(Node list1,list2)
  {
      Node dummy =new Node(-1);
      Node res=dummy;
      while(list1!=null   && list2!=null)
      {
          if(list1.data<list2.data)
          {
              res.child=list1;
              res=list1;
              list1=list1.child;
          }
          else
          {
               res.child=list2;
              res=list2;
              list2=list2.child;
          }
          res.child=null;
      }
      if(list1!=null)
      {
          res.child=list1;
      }
      else
      {
          res.child=list2;
      }
      return dummy.child;
  }
