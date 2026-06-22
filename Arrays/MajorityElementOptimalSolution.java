import java.util.Scanner;
 public class Main
 {
     public static int majorityElement(int []nums)
     {
        
          int count=0;
            int element=0;
        for(int num:nums)
        { 
             
           if(count==0)
           {
               element=num;
           }
           else if(element==num)
           {
               count++;
           }
           else
           {
               count--;
           }
             
        }   
        return element;
        
     }
     
 }
