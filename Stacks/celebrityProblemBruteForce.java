 import java.util.Scanner;
 public class Main
 {
     public static int celebrity(int [][]mat)
     {
         int n=mat.length;
         int[]inDegree=new int[n];
         int []outDegree=new int[n];
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(mat[i][j]==1)
                 {
                     outDegree[i]++;
                     inDegree[j]++;
                 }
             }
         }
         int candidate=top;
         for(int i=0;i<n;i++)
         {
             if(inDegree[i]==n-1   && outDegree[i]==0 )
             {
                 return -1;
             }
             
         }
         return candidate;
     }
 }
