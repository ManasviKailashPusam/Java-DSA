import java.util.Scanner;
 public class Main
 {
     public static int celebrity(int [][]mat)
     {
         int n=mat.length;
          int top=0;
          int bottom=n-1;
          while(top<bottom)
          {
              if(mat[top][down]==1)
              {
                  top++;
              }
              else
              {
                  bottom--;
              }
          }
          int candidate=top;
          for(int i=0;i<n;i++)
          {
              if(i==candidate)
              {
                  continue;
              }
              if(mat[candidate][i]==1   ||  mat[i][candidate]==0)
              {
                  return -1;
              }
              
          }
          return candidate;
         
     }
 }
