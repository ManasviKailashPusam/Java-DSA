   import java.util.Scanner;
 public class Main
 {
     public static int LengthlongestSubstring(String s)
     {
         int n=s.length();
         int maxLen=0;
        
         for(int i=0;i<n;i++)
         {
               int []hash=new int[256];
             for(int j=i;j<n;j++)
             {
                 if(hash[s.charAt(j)==1)
                 {
                     break;
                 }
                 
                 hash[s.charAt(j)==1;
                 int  length=j-i+1;
                 maxLength=Math.max(maxLength,length);
                 
                     
                 }
             }
         }
         return maxLength;
     }
 }
