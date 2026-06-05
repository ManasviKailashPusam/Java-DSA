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
     int ans=n;
     while(low<=high)
     {
         int mid=(low+high)/2;
         if(a[mid]<=target)
         {
             ans=mid;
             high=mid-1;
         }
         else  
         {
             low=mid+1;
         }
         
     }
      
         System.out.println(" upper bound element found at index:"+ans);
      
     
 }
 }
