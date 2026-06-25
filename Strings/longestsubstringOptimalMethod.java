import java.util.Scanner;
 public class int LongestSubstring(String s)
 {
     int n=s.length();
     int hash[]=new int[256];
     Arrays.fill(hash,-1);
     int maxlen=0;
     int l=0;
     for(int r=0;r<n;r++)
     {
           char ch=s.charAt(r);
         if(hash[ch]!=-1  &&  hash[ch]>=1)
         {
             l=hash[ch]+1;
         }
         int len=r-l+1;
         maxLength=Math.max(maxLength,len);
         hash[ch]=r;
     }
     return maxLength;
 }
