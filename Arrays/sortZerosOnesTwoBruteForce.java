import java.util.Scanner;
 public class Main
 {
     public static int sortZerosOnesTwos(int []a)
     {
         int count0=0;
         int count1=0;
         int count2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                count0++;
            }
            else if(a[i]==1)
            {
                count1++;
            }
            else if(a[i]==2)
            {
                count2++;
            }
        }
        for(int i=0;i<count0;i++)
        {
            a[i]=0;
        }
        for(int i=0;i<count1;i++)
        {
            a[i]=1;
        }
        for(int i=0;i<count2;i++)
        {
            a[i]=2;
        }
     }
     
 }
