//remove duplicates from an array
import java.util.Scanner;
public class Main
{
public static int removeDuplicates(int[]a)
 {
   int n=a.length;
   if(n==0)
   {
     return 0;
   }
    int i=0;
   for(int j=1;j<n;j++)
   {
     if(a[j]!=a[i])
   {
      a[i+1]=a[j];
      i++;
   }
   }
   return(i+1);
 }
public static void main(String[] args)
{
 Scanner scan=new Scanner(System.in);
 System.out.println("enter the size of array:");
 int n=scan.nextInt();
 int[]a=new int[n];
 for(int i=0;i<n;i++)
 {
  a[i]=scan.nextInt();
  }
  int newLength=removeDuplicates(a);
System.out.println("array after removing duplicates:");

 for(int i=0;i<newLength;i++)
  {
   System.out.println(a[i]+" ");

  }
 
}

}

