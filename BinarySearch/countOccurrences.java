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
     int first=-1;
     int last=-1;
      
     //first occurrence
     while(low<=high)
     {
         int mid=(low+high)/2;
         if(a[mid]==target)
         {
             first=mid;
             high=mid-1;
         }
         else if(a[mid]<target) 
         {
             low=mid+1;
         }
         else
         {
             high=mid-1;
         }
         
     }
     //last occurrence
      while(low<=high)
     {
         int mid=(low+high)/2;
         if(a[mid]==target)
         {
             last=mid;
             low=mid+1;
         }
         else if(a[mid]<target) 
         {
             low=mid+1;
         }
         else
         {
             high=mid-1;
         }
         
          
     }
     if(first==-1)
     {
     System.out.println("element not found:");;
     }
     else
     {
         int count=last-first+1;
     System.out.println("first occurrence="+first);
      System.out.println("first occurrence="+first);
      System.out.println("count="+count);
      
     
     }
     return new int[]{first,last};
 }
 }
