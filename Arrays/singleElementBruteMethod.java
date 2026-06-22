import java.util.Scanner;
 public class Main
 {
     public static int singleElement(int []a)
     {
          int ans=-1;
          
        for(int i=0;i<a.length;i++)
        {
            int num=a[i];
            int count=0;
            for(int j=0;j<a.length;j++)
            {
               if(a[j]==num)
               {
                   count++;
               }
               if(count==1)
               {
                   ans=num;
                   break;
               }
            }
        }   
        
     }
     
 }
