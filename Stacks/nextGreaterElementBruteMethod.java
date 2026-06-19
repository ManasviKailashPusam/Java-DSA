 import java.util.Scanner;
 public class Main
 {
     Public static int nextGreaterElement(int []a)
     {
         int n=a.length;
         int[]a=new int[n];
         Arrays.fill(nge,-1);
         for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 if(a[j]>a[i])
                 {
                     nge[i]=a[j];
                     break;
                 }
             }
         }
         return nge;
     }
 }
