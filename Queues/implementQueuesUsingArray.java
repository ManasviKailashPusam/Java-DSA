 import java.util.Scanner;
public class queue
{
   int []a;
   
   int size;
   int currentSum;
   int start;
   int end;
  public queue(int size)
 {
   
   this.size=size;
   a=new int[size];
   currentSum=0;
    start=-1;
      end=-1;
   }
 }
public static int  push(int x)
{
   if(currentSum==size()-1)
   {
    System.out.println("stack overflow");
    return;
   }
 if(currentSize()==0)
{
  start=0;
end=0;
}
   else
  {
    end=(end+1)%size;
  }
 
   a[end]=x;
  currentSize++;
}
public static int  pop()
{
    if(currentSum==0)
   {
     
     System.out.println("stack overflow");
    return -1;
   }
int element =a[start];
     else
  {
    start=(start+1)%size;
  }
 
 currentSize++;
 return element;
}
public static void top()
{
if(currentSize==0)
{
   System.out.println("stack is empty");
}
return a[top];
}
public static void size()
{
    return currentSize();
}

   
  
