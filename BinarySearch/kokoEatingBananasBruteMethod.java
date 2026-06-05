import java.util.Scanner;
 public class Main
 {
     //brute solution
     public static int FindTotalHours(int []a,int hourly)
     {
         int totalHours=0;
         for(int i=0;i<a.length;i++)
         {
             totalHours+=(int)Math.ceil((double)a[i]/hourly);
         }
         return TotalHours;
     }
     public static int minimumBananasToEat(int[]a,int h)
     {
         int max=a[0];
         for(int i=0;i<a.length;i++)
         {
             if(a[i]>max)
             {
                 max=a[i];
             }
         }
         for(int speed=1;<speed<=max;speed++)
         {
             int totalHours=FindTotalHours(a,speed);
             if(totalHours<h){
                 return speed;
             }
         }
         return -1;
     }
      
 }          
