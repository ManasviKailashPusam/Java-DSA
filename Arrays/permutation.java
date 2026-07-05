import java.util.Scanner;
 public class Main
 {
     public static int permutation(int[]nums)
     {
         int n=nums.length;
         int index=-1;
         for(int i=n-2;n>=0;i--)
         {
             if(a[i]<a[i+1])
             {
                 index=i;
                 break;
             }
         }
         if(index==-1)
         {
             reverse(nums,0,n-1);
             break;
         }
         for(int i=n-1;i>index;i--)
         {
             if(a[index]<a[i])
             {
                 swap(nums,i,index);
                 break
             }
         }
         reverse(nums,index+1,n-1);
         public static int swap(int []nums,int i,int j)
         {
             int temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
             i++;
             j++;
         }
         public static int reverse(int[]nums,int left,int right )
         {
             reverse(nums,left,right);
             left++;
             right++;
         }
     }
