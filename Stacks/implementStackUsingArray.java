class Stack
 {
     int top;
     int size;
     int []a;
     Stack(int size)
     {
         this.size=size;
         a=new int[size];
         top=-1;
     }
     //push
     public void push(int x)
     {
         if(top==size()-1)
         {
             System.out.println("stack overflow");
             return;
             
         }
         top=top+1;
         a[top]=x;
     }
     //pop
     public int pop()
     {
         if(top==-1)
         {
             System.out.println("stack overflow");
             return -1;
         }
         int el=a[top];
         top--;
         return el;
         
     }
     //top
     public int top()
     {
         if(top==-1)
         {
             return -1;
         }
         return a[top];
     }
     //size
     public int size()
     {
         return top+1;
     }
 }
 
