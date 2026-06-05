import java .util.Scanner;
 public class Main
 {
     public static peakeleemnt(int []a)
     {
         int n=a.length;
         for(int i=0;i<a;i++)
         {
             if(i==0   ||  a[i]>a[i-1]  &&  i=n-1  || a[n-1]>a[n-2])
             {
                 return a[i];
             }
             else
             {
                 return -1;
             }
         }
     }
 }
