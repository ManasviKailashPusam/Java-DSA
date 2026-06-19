 import java.util.Scanner;
 public class Main
 {
     public static int trap(int[]height)
     {
         int n=height.length;
         int []leftmax=new int[n];
         int []rightmax=new int[n];
         //build leftmax
         leftmax[0]=height[0];
         for(int i=0;i<n;i++)
         {
             leftmax[i]=Math.max(leftmax[i-1],height[i]);
         }
         //build right max
         rightmax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--)
         {
             rightmax=Math.max(rightmax[i+1],height[i]);
         }
         int water =0;
         for(int i=0;i<n;i++)
         {
             water+=Math.min(leftmax[i],rightmax[i]-height[i]);
         }
         return water;
         
     }
 }
