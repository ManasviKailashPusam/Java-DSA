import java.util.Scanner;
 public class Main
 {
     public static boolean CanwePlace(int[]stalls,int cows,int distance)
     {
         int cowsCount=1;
         int last=stalls[0];
         
         for(int i=0;i<stalls.length;i++)
         {
              if(stalls[i]-last>=distance)
              {
                  countCows++;
                  last=stalls[i];   
              }
                  
         }
         if( cowscount>cows)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
     public static int aggressiveCows(int[]stalls,int cows)
     {
          int n=stalls.length;
         Arrays.sort(stalls)
         int low=0;
         int high=stalls[n-1]-stalls[0];
         int ans=-1;
         while(low<=high)
         {
             int mid=(low+high)/2;
             for(int i=0;i<stalls[last]-stalls[0];i++)
             {
             if(!canWePlace(stalls,cows,mid))
             {
                 ans=mid;
                 low=mid+1;
             }
             else
             {
                 high=mid-1;
             }
         }
         return ans;
     }
 }
