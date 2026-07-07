 import java.util.Scanner;
 public class Main
 {
     public static int rotateImage(int[][]matrix)
     {
         int n=matrix.length;
         int []ans=new int[n];
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                  ans[j][n-1-i]=matrix[i][j];
             <n;j++

{
    
}         }
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
        
             matrix[i][j]=ans[i][j];
             }
         }
         
     }
 }
