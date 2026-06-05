import java.util.Scanner;
 public class Main
 {
     public static int mininumRateToEatBananas(int[]piles,int h)
     {
         int low=1;
         int high=findMax(piles);
         int ans=Integer.MAX_VALUE;
         while(low<=high)
         {
             int mid=(low+high)/2;
             int hours=calculateHours(piles,mid);
             if(hours<=h)
             {
                 ans=mid;
                 high=mid-1;
             }
             else
             {
                 low=mid+1;
             }
         }
         return ans;
     }
     public static int findMax(int []piles)
     {
         int max=0;
         for(int pile:piles)
         {
             max=Math.max(max,piles);
         }
         return max;
         
     }
     public static int CalculateHours(int []piles,int speed)
     {
         int CalculateHours=0;
         for(int pile:piles)
         {
             totalHours+=(pile+speed-1)/speed;
         }
         return totalHours ;
 }
