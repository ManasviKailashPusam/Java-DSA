   import java.util.Scanner;
 public class Main
 {
     //peak element 
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
     int low=1;
     int high=n;
     int ans =0;
       
     while(low<=high)
     {
         int mid=low+(high-low)/2;
         for(int i=0;i<n;i++)
         {
             if(mid=n/mid)
             {   
                 ans=mid;
                 low=mid+1;
             }
             else
             {
                 low=mid-1
             }
         }
     }
     return ans;
         
          
        
 }
