 import java.util.Scanner;
 public class Main
 {
 public static void main(String[] args)
 {
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the size of array:");
     int n=scan.nextInt();
     int []a=new int[n];
     System.out.print("enter the sorted array:");
     for(int i=0;i<n;i++)
     {
         a[i]=scan.nextInt();
     }
     System.out.println("enter the target element:");
     int target=scan.nextInt();
     int low=0;
     int high=n-1;
     int floor=-1;
     int ceil=-1;
     //floor
      while(low<=high)
     {
         int mid=(low+high)/2;
         if(a[mid]<=target)
         {
             floor=a[mid];
             low=mid+1;
         }
         else  
         {
             high=mid-1;
         }
         
     }
     low=0;
     high=n-1;
      
     //ceil
     while(low<=high)
     {
         int mid=(low+high)/2;
         if(a[mid]>=target)
         {
             ceil=a[mid];
             high=mid-1;
         }
         else  
         {
             low=mid+1;
         }
         
     }
     System.out.println("floor="+floor);
     System.out.println("ceil="+ceil);
 }
 }
