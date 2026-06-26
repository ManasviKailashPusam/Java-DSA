 import java.util.Scanner;
 public class Main
 {
     public static int maxConsecutiveOnes(int[]a,int k)
     {
         int maxLength=0;
         for(int i=0;i<n;i++)
         {
             int zeros=0;
             for(int j=i;j<n;j++)
             {
                 if(a[j]==0)
                 {
                     zeros++;
                 }
                 if(zeros>k)
                 {
                     int length=j-i+1;
                     maxLength=Math.max(maxLength,length);
                 }
                 else
                 {
                     break;
                 }
                 
             }
             return maxLength;
         }
