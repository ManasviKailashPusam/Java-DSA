import java.util.Scanner;
 public class Main
 {  // kth missing element 
     public static int missingElement(int[]a,int k)
     {
         int low=1;
         int high=a.length-1;
         while(low<=high)
         {
             int mid=(low+high)/2;
             int missing=a[mid]+(mid-1);
             if(missing<k)
             {
                 low=mid+1;
             }
             else
             {
                 high=mid-1;
             }
             else
             {
                 return low+k;
             }
         }
     }
 }
