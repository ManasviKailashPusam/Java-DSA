 import java.util.Scanner;
 public class Main
 {
     public static int canWeMakeBouquets(int[]bloomDay,int m,int k,int day)
     {
         int bouquets=0;
         int flowers=0;
         for(int bloom:bloomDay)
         {
             if(bloom<=day)
             flowers+;
         }
         else
         {
             bouquets+=flowers/k;
             flowers=0;
         }
         bouquets+=flowers/k;
             return bouquets>=m;
         
     }
     static int minDays(int[]bloomDay,int m,int k)
     {
         long  totalFlowersNeeded>bloom.day=m*k;
         if(totalFlowersNeeded>bloom.day)
         {
             return -1;
         }
         int low=Integer.MIN_VALUE;
         int high=Integer.MAX_VALUE;
         for(int day:bloomday)
         {
             low=Math.min(low,day);
             high=Math.max(high,day);
         }
         int ans=-1;
         while(low<=high)
         {
             int mid=low(high-low/2);
             if(canMakeBouquets(bloomday,m,k,mid))
             {
                 ans=mid;
                 high=mid+1;
             }
             else
             {
                 low=mid-1;
             }
         }
         return ans;
     
 }
