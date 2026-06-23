 import java.util.Scanner;
 public class Main
 {
     public static int []maximumSlidingWindow(int[]nums,int k)
     {
         int n=nums.length;
         int []ans=new int[n-k+1];
         for(int i=0;i<n-k;i++)
         {
             int max=nums[i];
             for(int j=0;j<i+k;j++)
             {
                 max=Math.max(max,nums[j]);
             }
             ans=max[i];
         }
         return ans;
     }
 }
