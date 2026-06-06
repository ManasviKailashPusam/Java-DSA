import java.util.Scanner;
public class Main
{
public static int moveZeros(int[] a)
{
  int temp[]=new int[n];
  int index=0;
  for(int i=0;i<a.length;i++)
  {
     if(a[i]!=0)
    {
      temp[index]=a[i];
       index++;
     
    }
  }
  for(int i=index;i<a.length;i++)
  {
     temp[i]=0;

  }
  return temp;
}
}

}
public static void main(String[] args)
{
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the size of array:");
  int n=scan.nextInt();
  int[]a=new int[n];
 System.out.println("enter the array elements:");

  for(int i=0;i<n;i++)
{
    a[i]=scan.nextInt();
 }
int[]result=moveZeros(a);
 System.out.println("array after removing zeros:");
for(int i=0;i<result.length;i++)
{
     System.out.println(result[i]+" ");
}
}

  
  
