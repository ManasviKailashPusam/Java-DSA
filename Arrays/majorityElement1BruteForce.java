import java.util.Scanner;
 public class Main
 {
     public static int singleElement(int []a)
     {
          int majority=-1;
          
        for(int i=0;i<a.length;i++)
        { 
            int count=0;
            for(int j=0;j<a.length;j++)
            {
               if(a[i]==a[j])
               {
                   count++;
               }
               if(count>n/2)
               {
                   majority=a[i];
                   break;
               }
            }
        }   
        
     }
     
 }
