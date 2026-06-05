//subarray of an Array
import java.util.Scanner;
public class Main
{
public static void SubarrayOfAnArray(int[]a)
{
    int n=a.length;
     for(int i=0;i<n;i++)
    {
      for(int j=ij<n;j++)
      {
        for(int k=i;k<=j;k++)
         {
           System.out.println(a[k]+"\t");
         }
         System.out.println();
      }
     }
  }
public static void main(String[] args)
{
      Scanner scan=new Scanner(System.in);
    System.out.println("enter the size of array:");
   int n=scan.nextInt();
   int a[]=new int[n];
   System.out.println("enter the elements of array:");
   for(int i=0;i<n;i++)
   {
     a[i]=scan.nextInt();
    }
   System.out.println("Subarrays of the array are:");
        subarrayOfAnArray(a);

        scan.close();
    }

 
}

      
