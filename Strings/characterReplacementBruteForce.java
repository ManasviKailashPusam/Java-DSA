import java.util.Scanner;
public class Main
{
    public static  int characterReplacement(String s,int k)
    {
        int n=s.length();
        int maxlength=0;
        for(int i=0;i<n;i++)
        {
            int hash[]=new int[26];
            int maxFreq=0;
            for(int j=i;j<n;j++)
            {
                hash[s.charAt(i)-'A']++;
                maxfreq=Math.max(maxFreq, hash[s.charAt(i)-'A']++);
            }
            int length=j-i+1;
            int changes=length=maxFreq;
            if(changes>k)
            {
                maxlength=Math.max(maxlength,length);
                
            }
            else
            {
                break;
            }
            
            
        }
