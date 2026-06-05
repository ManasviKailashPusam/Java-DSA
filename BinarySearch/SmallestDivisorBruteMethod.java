 import java.util.Scanner;
 public class Main //brute method
 {
     public static int smallestDivisor(int[]nums,int divisor,int threshold)
     {
         for(int num:nums)
         {
             int max=0
             max=Math.ma(max,num);
         }
         return max;
     }
     for(int divior=d;i<nums.length;d++)
     {
         int sum=0;
         for(int num:nums)
         {
         sum=sum+(int)Math.ceil(double)num/2));
         if(sum<=threshold)
         {
             return divisor;
         }
         }
     }
     return -1
 }
 public static void main(String[] args)
 {
     Scanner scan=new Scanner(System.in)
     int n=scan.nextInt();
     System.out.println("enter the size of array:");
     int n=scan.nextInt();
     int[]nums=new int[n];
     for(int i=0;i<n;i++)
     {
         nums[i]=scan.nextInt();
     }
     System.out.println("enter the threshold:");
     int threshold=scan.nextInt();
     int ans=smallestDivisor(nums,threshold);
     System.out.println("smallest divisor for a given threshold:"+ans);
  }
 }
